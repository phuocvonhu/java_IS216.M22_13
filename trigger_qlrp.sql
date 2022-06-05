ALTER TABLE tai_khoan ADD UNIQUE (ten_dang_nhap);

ALTER TABLE loai_tai_khoan ADD CONSTRAINT check_ten_loai CHECK ( ten_loai in ("Khach hang", "Nhan vien", "Quan ly"));

ALTER TABLE phan_hoi ADD CONSTRAINT check_danh_gia CHECK (danh_gia >=0 AND danh_gia <= 5.0);

ALTER TABLE tai_khoan ADD CONSTRAINT check_do_dai_mat_khau CHECK (length(mat_khau) >= 6);

ALTER TABLE khuyen_mai ADD CONSTRAINT check_tri_gia CHECK (tri_gia >0 AND tri_gia <= 1.0);

ALTER TABLE hoa_don_hang_hoa ADD CONSTRAINT check_so_luong CHECK (so_luong > 0);

ALTER TABLE hang_hoa ADD CONSTRAINT check_don_gia CHECK (don_gia > 0);

ALTER TABLE hang_hoa ADD CONSTRAINT check_tong_so_luong CHECK (tong_so_luong > 0);

ALTER TABLE ghe ADD CONSTRAINT check_loai_ghe CHECK (loai_ghe in ('đơn', 'đôi'));

ALTER TABLE nhap_hang_hoa ADD CONSTRAINT check_so_luong CHECK (so_luong > 0);


CREATE  TRIGGER cap_nhat_tong_hang_hoa_1 
AFTER INSERT ON nhap_hang_hoa
FOR EACH ROW
	UPDATE hang_hoa
    SET tong_so_luong = tong_so_luong + NEW.so_luong
    WHERE ma_hang_hoa = NEW.ma_hang_hoa;





	DELIMITER %%
	CREATE or replace TRIGGER cap_nhat_tong_hang_hoa_2
	AFTER update ON nhap_hang_hoa
	FOR EACH ROW BEGIN
	IF NEW.so_luong>=OLD.so_luong
		THEN
			UPDATE hang_hoa
			SET tong_so_luong = (tong_so_luong + (NEW.so_luong-OLD.so_luong))
			WHERE ma_hang_hoa =(NEW.ma_hang_hoa);
			 ELSE 
			UPDATE hang_hoa
			SET tong_so_luong = tong_so_luong - (OLD.so_luong-NEW.so_luong)
			WHERE ma_hang_hoa = NEW.ma_hang_hoa;
	END if;
	end
	%%
	DELIMITER ;





DELIMITER %%
CREATE OR REPLACE TRIGGER cap_nhat_gia_hoa_don_ve
BEFORE INSERT ON hoa_don_ve
FOR EACH ROW
BEGIN
	DECLARE loai_ghe_test varchar(25);
    DECLARE gia_tien BIGINT(20);
    
	SELECT loai_ghe INTO loai_ghe_test
    FROM ghe
    WHERE ma_ghe = NEW.ma_ghe;
    
    SELECT gia_ve INTO gia_tien
    FROM suat_chieu
    WHERE ma_suat_chieu = NEW.ma_suat_chieu;
    
    IF loai_ghe_test = 'đôi'
    THEN
    	SET NEW.gia = gia_tien + gia_tien;
   	ELSE
    	SET NEW.gia = gia_tien;
    END IF;
END
%%
DELIMITER ;



DELIMITER %%
CREATE OR REPLACE TRIGGER cap_nhat_tri_gia_hoa_don_2
AFTER INSERT ON hoa_don_hang_hoa
FOR EACH ROW
BEGIN
	DECLARE gia_hang_hoa BIGINT(20);
    SELECT don_gia INTO gia_hang_hoa
    FROM hang_hoa
    WHERE ma_hang_hoa = NEW.ma_hang_hoa;
    
    UPDATE hoa_don
    SET trigia = trigia + (gia_hang_hoa*NEW.so_luong)
    WHERE ma_hoa_don = NEW.ma_hoa_don;
END
%%
DELIMITER ;




DELIMITER %%
CREATE OR REPLACE TRIGGER cap_nhat_tri_gia_hoa_don_3
AFTER INSERT ON hoa_don_ve
FOR EACH ROW
BEGIN
	UPDATE hoa_don
    SET trigia = trigia + NEW.gia
    WHERE ma_hoa_don = NEW.ma_hoa_don;
END
%%
DELIMITER ;
