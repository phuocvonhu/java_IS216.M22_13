INSERT INTO `loai_tai_khoan`(`ten_loai`) VALUES ('Nhan vien');
INSERT INTO `loai_tai_khoan`(`ten_loai`) VALUES ('Quan ly');


INSERT INTO `tai_khoan`(`ten_dang_nhap`, `mat_khau`, `ma_loai_tai_khoan`) VALUES ('NV01','NV01NV01',2);
INSERT INTO `tai_khoan`(`ten_dang_nhap`, `mat_khau`, `ma_loai_tai_khoan`) VALUES ('KH01','KH01KH01',1);
INSERT INTO `tai_khoan`(`ten_dang_nhap`, `mat_khau`, `ma_loai_tai_khoan`) VALUES ('KH02','KH02KH02',1);
INSERT INTO `tai_khoan`(`ten_dang_nhap`, `mat_khau`, `ma_loai_tai_khoan`) VALUES ('QL01','QL01QL01',3);


INSERT INTO `nhan_vien`(`ho_ten`, `gioi_tinh`, `ngay_sinh`, `email`, `so_dien_thoai`, `ngay_bat_dau`, `ma_tai_khoan`) VALUES ('Nguyễn Văn Luân','Nam','2002-11-24','luan2411@gmail.com','0123456789','2022-06-03',1);
INSERT INTO `nhan_vien`(`ho_ten`, `gioi_tinh`, `ngay_sinh`, `email`, `so_dien_thoai`, `ngay_bat_dau`, `ma_tai_khoan`) VALUES ('Nguyễn Đức Phúc','Nam','2002-10-28','phuc2810@gmail.com','0987654321','2021-05-10',3);

INSERT INTO `khach_hang`(`ho_ten`, `so_dien_thoai`, `email`, `ma_tai_khoan`) VALUES ('Võ Minh Trung','098712436','trung1234@gmail.com',2);
INSERT INTO `khach_hang`(`ho_ten`, `so_dien_thoai`, `email`, `ma_tai_khoan`) VALUES ('Lê Văn Lâm','908487217','lam1234@gmail.com',4);



INSERT INTO phim( ten_phim, loai_phim, tac_gia, quoc_gia, thoi_luong, nam_phat_hanh) VALUES ('Bố Già','Tâm lý','Trấn Thành','Việt Nam',120,'2020-11-15');
INSERT INTO phim( ten_phim, loai_phim, tac_gia, quoc_gia, thoi_luong, nam_phat_hanh) VALUES ('Đêm Tối Rực Rỡ','Tâm lý','Ivan Trần','Việt Nam',150,'2022-05-20');



INSERT INTO `nha_cung_cap`(`ten_ncc`, `dia_chi`) VALUES ('Công ty thiên phúc','Q1, Thành phố Hồ Chí Minh');
INSERT INTO `nha_cung_cap`(`ten_ncc`, `dia_chi`) VALUES ('Công ty Unilever','Q7, Thành phố Hồ Chí Minh');


INSERT INTO `hang_hoa`(`ten_hang_hoa`, `tong_so_luong`, `don_gia`) VALUES ('Pepsi',300,30000);
INSERT INTO `hang_hoa`(`ten_hang_hoa`, `tong_so_luong`, `don_gia`) VALUES ('Bắp rang',500,40000);
INSERT INTO `hang_hoa`(`ten_hang_hoa`, `tong_so_luong`, `don_gia`) VALUES ('Snack',500,20000);
INSERT INTO `hang_hoa`(`ten_hang_hoa`, `tong_so_luong`, `don_gia`) VALUES ('Khăn giấy',100,10000);


INSERT INTO `nhap_hang_hoa`(`ma_ncc`, `ma_hang_hoa`, `so_luong`, `don_gia`, `ngay_nhap`) VALUES (1,1,300,15000,'2022-1-15');
INSERT INTO `nhap_hang_hoa`(`ma_ncc`, `ma_hang_hoa`, `so_luong`, `don_gia`, `ngay_nhap`) VALUES (1,2,500,20000,'2022-1-15');
INSERT INTO `nhap_hang_hoa`(`ma_ncc`, `ma_hang_hoa`, `so_luong`, `don_gia`, `ngay_nhap`) VALUES (2,3,500,10000,'2022-1-20');
INSERT INTO `nhap_hang_hoa`(`ma_ncc`, `ma_hang_hoa`, `so_luong`, `don_gia`, `ngay_nhap`) VALUES (2,4,100,500,'2022-1-20');
INSERT INTO `nhap_hang_hoa`(`ma_ncc`, `ma_hang_hoa`, `so_luong`, `don_gia`, `ngay_nhap`) VALUES (2,4,100,5000,'2022-1-30');




INSERT INTO `phong_chieu`(`ten_phong_chieu`, `loai_phong_chieu`, `so_luong_ghe`) VALUES ('Phòng A','Bình thường',20);
INSERT INTO `phong_chieu`(`ten_phong_chieu`, `loai_phong_chieu`, `so_luong_ghe`) VALUES ('Phòng B','Cao cấp',30);
INSERT INTO `phong_chieu`(`ten_phong_chieu`, `loai_phong_chieu`, `so_luong_ghe`) VALUES ('Phòng C','Vip',40);
INSERT INTO `phong_chieu`(`ten_phong_chieu`, `loai_phong_chieu`, `so_luong_ghe`) VALUES ('Phòng D','Vip',40);


INSERT INTO `suat_chieu`( `ma_phong_chieu`, `ma_phim`, `gia_ve`, `thoi_gian`) VALUES (1,1,70000,'2022-06-20 8:00:00');
INSERT INTO `suat_chieu`( `ma_phong_chieu`, `ma_phim`, `gia_ve`, `thoi_gian`) VALUES (1,2,70000,'2022-06-20 11:00:00');
INSERT INTO `suat_chieu`( `ma_phong_chieu`, `ma_phim`, `gia_ve`, `thoi_gian`) VALUES (1,1,70000,'2022-06-20 3:30:00');


INSERT INTO `hoa_don`( `ma_nhan_vien`, `ma_khach_hang`, `trigia`, `ngay_hoa_don`) VALUES (1,1,0,'2022-07-1');
INSERT INTO `hoa_don`(`ma_nhan_vien`, `ma_khach_hang`, `trigia`, `ngay_hoa_don`) VALUES (1,2,0,'2022-07-1');




INSERT INTO `hoa_don_hang_hoa`(`ma_hoa_don`, `ma_hang_hoa`, `so_luong`) VALUES (1,1,2);
INSERT INTO `hoa_don_hang_hoa`(`ma_hoa_don`, `ma_hang_hoa`, `so_luong`) VALUES (1,2,1);
INSERT INTO `hoa_don_hang_hoa`(`ma_hoa_don`, `ma_hang_hoa`, `so_luong`) VALUES (1,4,1);

INSERT INTO `hoa_don_hang_hoa`(`ma_hoa_don`, `ma_hang_hoa`, `so_luong`) VALUES (2,1,3);
INSERT INTO `hoa_don_hang_hoa`(`ma_hoa_don`, `ma_hang_hoa`, `so_luong`) VALUES (2,3,3);
INSERT INTO `hoa_don_hang_hoa`(`ma_hoa_don`, `ma_hang_hoa`, `so_luong`) VALUES (2,4,1);



INSERT INTO `hoa_don_ve`(`ma_hoa_don`, `ma_suat_chieu`, `ma_ghe`, `gia`) VALUES (1,1,16,0);
INSERT INTO `hoa_don_ve`(`ma_hoa_don`, `ma_suat_chieu`, `ma_ghe`, `gia`) VALUES (1,1,17,0);
INSERT INTO `hoa_don_ve`(`ma_hoa_don`, `ma_suat_chieu`, `ma_ghe`, `gia`) VALUES (1,1,22,0);


INSERT INTO `hoa_don_ve`(`ma_hoa_don`, `ma_suat_chieu`, `ma_ghe`, `gia`) VALUES (2,1,18,0);
INSERT INTO `hoa_don_ve`(`ma_hoa_don`, `ma_suat_chieu`, `ma_ghe`, `gia`) VALUES (2,1,19,0);
INSERT INTO `hoa_don_ve`(`ma_hoa_don`, `ma_suat_chieu`, `ma_ghe`, `gia`) VALUES (2,1,20,0);
INSERT INTO `hoa_don_ve`(`ma_hoa_don`, `ma_suat_chieu`, `ma_ghe`, `gia`) VALUES (2,1,21,0);