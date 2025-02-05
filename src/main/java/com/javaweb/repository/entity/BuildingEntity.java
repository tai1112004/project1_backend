package com.javaweb.repository.entity;

public class BuildingEntity {
		private String ten_toa_nha , quan , phuong,duong, ketcau, sotangham ;

		public String getTen_toa_nha() {
			return ten_toa_nha;
		}

		public void setTen_toa_nha(String ten_toa_nha) {
			this.ten_toa_nha = ten_toa_nha;
		}

		public String getQuan() {
			return quan;
		}

		public void setQuan(String quan) {
			this.quan = quan;
		}

		public String getPhuong() {
			return phuong;
		}

		public void setPhuong(String phuong) {
			this.phuong = phuong;
		}

		public String getDuong() {
			return duong;
		}

		public void setDuong(String duong) {
			this.duong = duong;
		}

		public String getKetcau() {
			return ketcau;
		}

		public void setKetcau(String ketcau) {
			this.ketcau = ketcau;
		}

		public String getSotangham() {
			return sotangham;
		}

		public void setSotangham(String sotangham) {
			this.sotangham = sotangham;
		}

		@Override
		public String toString() {
			return "buildingDTOproject1 [ten_toa_nha=" + ten_toa_nha + ", quan=" + quan + ", phuong=" + phuong + ", duong="
					+ duong + ", ketcau=" + ketcau + ", sotangham=" + sotangham + "]";
		} 
		
	}
