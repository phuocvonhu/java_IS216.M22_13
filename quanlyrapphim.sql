-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 23, 2022 lúc 08:57 AM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlyrapphim`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chi_tiet_khuyen_mai`
--

CREATE TABLE `chi_tiet_khuyen_mai` (
  `ma_khuyen_mai` int(11) NOT NULL,
  `ma_hoa_don` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ghe`
--

CREATE TABLE `ghe` (
  `ma_ghe` int(11) NOT NULL,
  `ma_phong_chieu` int(11) NOT NULL,
  `ten_ghe` varchar(5) DEFAULT NULL,
  `loai_ghe` varchar(5) DEFAULT NULL,
  `tinh_trang` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hang_hoa`
--

CREATE TABLE `hang_hoa` (
  `ma_hang_hoa` int(11) NOT NULL,
  `ten_hang_hoa` varchar(100) DEFAULT NULL,
  `tong_so_luong` int(11) DEFAULT NULL,
  `don_gia` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don`
--

CREATE TABLE `hoa_don` (
  `ma_hoa_don` int(11) NOT NULL,
  `ma_nhan_vien` int(11) DEFAULT NULL,
  `ma_khach_hang` int(11) DEFAULT NULL,
  `trigia` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don_hang_hoa`
--

CREATE TABLE `hoa_don_hang_hoa` (
  `ma_hoa_don` int(11) NOT NULL,
  `ma_hang_hoa` int(11) NOT NULL,
  `so_luong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don_ve`
--

CREATE TABLE `hoa_don_ve` (
  `ma_hoa_don` int(11) DEFAULT NULL,
  `ma_ve` int(11) NOT NULL,
  `ma_suat_chieu` int(11) NOT NULL,
  `ma_ghe` int(11) NOT NULL,
  `gia` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khach_hang`
--

CREATE TABLE `khach_hang` (
  `ma_khach_hang` int(11) NOT NULL,
  `ho_ten` varchar(255) DEFAULT NULL,
  `so_dien_thoai` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ma_tai_khoan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuyen_mai`
--

CREATE TABLE `khuyen_mai` (
  `ma_khuyen_mai` int(11) NOT NULL,
  `noi_dung` text DEFAULT NULL,
  `tri_gia` float DEFAULT NULL,
  `dung_chung` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loai_tai_khoan`
--

CREATE TABLE `loai_tai_khoan` (
  `ma_loai_tai_khoan` int(11) NOT NULL,
  `ten_loai` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_vien`
--

CREATE TABLE `nhan_vien` (
  `ma_nhan_vien` int(11) NOT NULL,
  `ho_ten` varchar(255) DEFAULT NULL,
  `gioi_tinh` varchar(5) DEFAULT NULL,
  `ngay_sinh` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `so_dien_thoai` varchar(20) DEFAULT NULL,
  `ngay_bat_dau` date DEFAULT NULL,
  `ma_tai_khoan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhap_hang_hoa`
--

CREATE TABLE `nhap_hang_hoa` (
  `ma_don` int(11) NOT NULL,
  `ma_ncc` int(11) DEFAULT NULL,
  `ma_hang_hoa` int(11) DEFAULT NULL,
  `so_luong` int(11) DEFAULT NULL,
  `don_gia` bigint(20) DEFAULT NULL,
  `ngay_nhap` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nha_cung_cap`
--

CREATE TABLE `nha_cung_cap` (
  `ma_ncc` int(11) NOT NULL,
  `ten_ncc` varchar(255) DEFAULT NULL,
  `dia_chi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phan_hoi`
--

CREATE TABLE `phan_hoi` (
  `ma_phan_hoi` int(11) NOT NULL,
  `ma_khach_hang` int(11) DEFAULT NULL,
  `noi_dung` text DEFAULT NULL,
  `danh_gia` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phim`
--

CREATE TABLE `phim` (
  `ma_phim` int(11) NOT NULL,
  `ten_phim` varchar(255) DEFAULT NULL,
  `loai_phim` varchar(5) DEFAULT NULL,
  `tac_gia` varchar(255) DEFAULT NULL,
  `quoc_gia` varchar(255) DEFAULT NULL,
  `thoi_luong` int(11) DEFAULT NULL,
  `nam_phat_hanh` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phim_them`
--

CREATE TABLE `phim_them` (
  `ma_phim` int(11) NOT NULL,
  `mo_ta` text DEFAULT NULL,
  `anh_minh_hoa` longblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong_chieu`
--

CREATE TABLE `phong_chieu` (
  `ma_phong_chieu` int(11) NOT NULL,
  `ten_phong_chieu` varchar(255) DEFAULT NULL,
  `loai_phong_chieu` varchar(5) DEFAULT NULL,
  `so_luong_ghe` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `suat_chieu`
--

CREATE TABLE `suat_chieu` (
  `ma_suat_chieu` int(11) NOT NULL,
  `ma_phong_chieu` int(11) NOT NULL,
  `ma_phim` int(11) DEFAULT NULL,
  `gia_ve` bigint(20) DEFAULT NULL,
  `thoi_gian` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `su_co`
--

CREATE TABLE `su_co` (
  `ma_su_co` int(11) NOT NULL,
  `ma_phong_chieu` int(11) DEFAULT NULL,
  `ten_su_co` varchar(255) DEFAULT NULL,
  `thong_tin_them` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tai_khoan`
--

CREATE TABLE `tai_khoan` (
  `ma_tai_khoan` int(11) NOT NULL,
  `ten_dang_nhap` varchar(255) DEFAULT NULL,
  `mat_khau` varchar(255) DEFAULT NULL,
  `ma_loai_tai_khoan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chi_tiet_khuyen_mai`
--
ALTER TABLE `chi_tiet_khuyen_mai`
  ADD PRIMARY KEY (`ma_khuyen_mai`,`ma_hoa_don`),
  ADD KEY `FK_chi_tiet_km_1` (`ma_hoa_don`);

--
-- Chỉ mục cho bảng `ghe`
--
ALTER TABLE `ghe`
  ADD PRIMARY KEY (`ma_ghe`,`ma_phong_chieu`),
  ADD KEY `FK_GHE_1` (`ma_phong_chieu`);

--
-- Chỉ mục cho bảng `hang_hoa`
--
ALTER TABLE `hang_hoa`
  ADD PRIMARY KEY (`ma_hang_hoa`);

--
-- Chỉ mục cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD PRIMARY KEY (`ma_hoa_don`),
  ADD KEY `FK_HOADON_1` (`ma_khach_hang`),
  ADD KEY `FK_HOADON_2` (`ma_nhan_vien`);

--
-- Chỉ mục cho bảng `hoa_don_hang_hoa`
--
ALTER TABLE `hoa_don_hang_hoa`
  ADD PRIMARY KEY (`ma_hoa_don`,`ma_hang_hoa`),
  ADD KEY `FK_HDHH_2` (`ma_hang_hoa`);

--
-- Chỉ mục cho bảng `hoa_don_ve`
--
ALTER TABLE `hoa_don_ve`
  ADD PRIMARY KEY (`ma_ve`,`ma_suat_chieu`,`ma_ghe`),
  ADD KEY `FK_HDV_1` (`ma_hoa_don`),
  ADD KEY `FK_HDV_2` (`ma_suat_chieu`),
  ADD KEY `FK_HDV_3` (`ma_ghe`);

--
-- Chỉ mục cho bảng `khach_hang`
--
ALTER TABLE `khach_hang`
  ADD PRIMARY KEY (`ma_khach_hang`),
  ADD KEY `FK_KHACHHANG_1` (`ma_tai_khoan`);

--
-- Chỉ mục cho bảng `khuyen_mai`
--
ALTER TABLE `khuyen_mai`
  ADD PRIMARY KEY (`ma_khuyen_mai`);

--
-- Chỉ mục cho bảng `loai_tai_khoan`
--
ALTER TABLE `loai_tai_khoan`
  ADD PRIMARY KEY (`ma_loai_tai_khoan`);

--
-- Chỉ mục cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  ADD PRIMARY KEY (`ma_nhan_vien`),
  ADD KEY `FK_NHANVIEN_1` (`ma_tai_khoan`);

--
-- Chỉ mục cho bảng `nhap_hang_hoa`
--
ALTER TABLE `nhap_hang_hoa`
  ADD PRIMARY KEY (`ma_don`),
  ADD KEY `FK_NHAPHH_1` (`ma_ncc`),
  ADD KEY `FK_NHAPHH_2` (`ma_hang_hoa`);

--
-- Chỉ mục cho bảng `nha_cung_cap`
--
ALTER TABLE `nha_cung_cap`
  ADD PRIMARY KEY (`ma_ncc`);

--
-- Chỉ mục cho bảng `phan_hoi`
--
ALTER TABLE `phan_hoi`
  ADD PRIMARY KEY (`ma_phan_hoi`),
  ADD KEY `FK_PHAN_HOI_1` (`ma_khach_hang`);

--
-- Chỉ mục cho bảng `phim`
--
ALTER TABLE `phim`
  ADD PRIMARY KEY (`ma_phim`);

--
-- Chỉ mục cho bảng `phim_them`
--
ALTER TABLE `phim_them`
  ADD PRIMARY KEY (`ma_phim`);

--
-- Chỉ mục cho bảng `phong_chieu`
--
ALTER TABLE `phong_chieu`
  ADD PRIMARY KEY (`ma_phong_chieu`);

--
-- Chỉ mục cho bảng `suat_chieu`
--
ALTER TABLE `suat_chieu`
  ADD PRIMARY KEY (`ma_suat_chieu`,`ma_phong_chieu`,`thoi_gian`),
  ADD KEY `FK_SUATCHIEU_1` (`ma_phong_chieu`),
  ADD KEY `FK_SUATCHIEU_2` (`ma_phim`);

--
-- Chỉ mục cho bảng `su_co`
--
ALTER TABLE `su_co`
  ADD PRIMARY KEY (`ma_su_co`),
  ADD KEY `FK_SUCO_1` (`ma_phong_chieu`);

--
-- Chỉ mục cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD PRIMARY KEY (`ma_tai_khoan`),
  ADD KEY `FK_TAIKHOAN_1` (`ma_loai_tai_khoan`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `ghe`
--
ALTER TABLE `ghe`
  MODIFY `ma_ghe` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `hang_hoa`
--
ALTER TABLE `hang_hoa`
  MODIFY `ma_hang_hoa` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  MODIFY `ma_hoa_don` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `hoa_don_ve`
--
ALTER TABLE `hoa_don_ve`
  MODIFY `ma_ve` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `khach_hang`
--
ALTER TABLE `khach_hang`
  MODIFY `ma_khach_hang` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `khuyen_mai`
--
ALTER TABLE `khuyen_mai`
  MODIFY `ma_khuyen_mai` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `loai_tai_khoan`
--
ALTER TABLE `loai_tai_khoan`
  MODIFY `ma_loai_tai_khoan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  MODIFY `ma_nhan_vien` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nhap_hang_hoa`
--
ALTER TABLE `nhap_hang_hoa`
  MODIFY `ma_don` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nha_cung_cap`
--
ALTER TABLE `nha_cung_cap`
  MODIFY `ma_ncc` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `phan_hoi`
--
ALTER TABLE `phan_hoi`
  MODIFY `ma_phan_hoi` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `phim`
--
ALTER TABLE `phim`
  MODIFY `ma_phim` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `phong_chieu`
--
ALTER TABLE `phong_chieu`
  MODIFY `ma_phong_chieu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `suat_chieu`
--
ALTER TABLE `suat_chieu`
  MODIFY `ma_suat_chieu` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `su_co`
--
ALTER TABLE `su_co`
  MODIFY `ma_su_co` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  MODIFY `ma_tai_khoan` int(11) NOT NULL AUTO_INCREMENT;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chi_tiet_khuyen_mai`
--
ALTER TABLE `chi_tiet_khuyen_mai`
  ADD CONSTRAINT `FK_chi_tiet_km_1` FOREIGN KEY (`ma_hoa_don`) REFERENCES `hoa_don` (`ma_hoa_don`),
  ADD CONSTRAINT `FK_chi_tiet_km_2` FOREIGN KEY (`ma_khuyen_mai`) REFERENCES `khuyen_mai` (`ma_khuyen_mai`);

--
-- Các ràng buộc cho bảng `ghe`
--
ALTER TABLE `ghe`
  ADD CONSTRAINT `FK_GHE_1` FOREIGN KEY (`ma_phong_chieu`) REFERENCES `phong_chieu` (`ma_phong_chieu`);

--
-- Các ràng buộc cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD CONSTRAINT `FK_HOADON_1` FOREIGN KEY (`ma_khach_hang`) REFERENCES `khach_hang` (`ma_khach_hang`),
  ADD CONSTRAINT `FK_HOADON_2` FOREIGN KEY (`ma_nhan_vien`) REFERENCES `nhan_vien` (`ma_nhan_vien`);

--
-- Các ràng buộc cho bảng `hoa_don_hang_hoa`
--
ALTER TABLE `hoa_don_hang_hoa`
  ADD CONSTRAINT `FK_HDHH_1` FOREIGN KEY (`ma_hoa_don`) REFERENCES `hoa_don` (`ma_hoa_don`),
  ADD CONSTRAINT `FK_HDHH_2` FOREIGN KEY (`ma_hang_hoa`) REFERENCES `hang_hoa` (`ma_hang_hoa`);

--
-- Các ràng buộc cho bảng `hoa_don_ve`
--
ALTER TABLE `hoa_don_ve`
  ADD CONSTRAINT `FK_HDV_1` FOREIGN KEY (`ma_hoa_don`) REFERENCES `hoa_don` (`ma_hoa_don`),
  ADD CONSTRAINT `FK_HDV_2` FOREIGN KEY (`ma_suat_chieu`) REFERENCES `suat_chieu` (`ma_suat_chieu`),
  ADD CONSTRAINT `FK_HDV_3` FOREIGN KEY (`ma_ghe`) REFERENCES `ghe` (`ma_ghe`);

--
-- Các ràng buộc cho bảng `khach_hang`
--
ALTER TABLE `khach_hang`
  ADD CONSTRAINT `FK_KHACHHANG_1` FOREIGN KEY (`ma_tai_khoan`) REFERENCES `tai_khoan` (`ma_tai_khoan`);

--
-- Các ràng buộc cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  ADD CONSTRAINT `FK_NHANVIEN_1` FOREIGN KEY (`ma_tai_khoan`) REFERENCES `tai_khoan` (`ma_tai_khoan`);

--
-- Các ràng buộc cho bảng `nhap_hang_hoa`
--
ALTER TABLE `nhap_hang_hoa`
  ADD CONSTRAINT `FK_NHAPHH_1` FOREIGN KEY (`ma_ncc`) REFERENCES `nha_cung_cap` (`ma_ncc`),
  ADD CONSTRAINT `FK_NHAPHH_2` FOREIGN KEY (`ma_hang_hoa`) REFERENCES `hang_hoa` (`ma_hang_hoa`);

--
-- Các ràng buộc cho bảng `phan_hoi`
--
ALTER TABLE `phan_hoi`
  ADD CONSTRAINT `FK_PHAN_HOI_1` FOREIGN KEY (`ma_khach_hang`) REFERENCES `khach_hang` (`ma_khach_hang`);

--
-- Các ràng buộc cho bảng `phim_them`
--
ALTER TABLE `phim_them`
  ADD CONSTRAINT `FK_PHIM_THEM_1` FOREIGN KEY (`ma_phim`) REFERENCES `phim` (`ma_phim`);

--
-- Các ràng buộc cho bảng `suat_chieu`
--
ALTER TABLE `suat_chieu`
  ADD CONSTRAINT `FK_SUATCHIEU_1` FOREIGN KEY (`ma_phong_chieu`) REFERENCES `phong_chieu` (`ma_phong_chieu`),
  ADD CONSTRAINT `FK_SUATCHIEU_2` FOREIGN KEY (`ma_phim`) REFERENCES `phim` (`ma_phim`);

--
-- Các ràng buộc cho bảng `su_co`
--
ALTER TABLE `su_co`
  ADD CONSTRAINT `FK_SUCO_1` FOREIGN KEY (`ma_phong_chieu`) REFERENCES `phong_chieu` (`ma_phong_chieu`);

--
-- Các ràng buộc cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD CONSTRAINT `FK_TAIKHOAN_1` FOREIGN KEY (`ma_loai_tai_khoan`) REFERENCES `loai_tai_khoan` (`ma_loai_tai_khoan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
