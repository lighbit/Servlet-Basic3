package com.DataPegawai;

import java.util.Date;

public class DataPegawai {

	private int ID;
	private String Nama;
	private String Golongan;
	private int Gaji_Perbulan;
	public Date Tanggal_Masuk;

	private String formattedTglMasuk;// TODO CONVERT TANGGAL_MASUK --> STRING

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNama() {
		return Nama;
	}

	public void setNama(String nama) {
		Nama = nama;
	}

	public String getGolongan() {
		return Golongan;
	}

	public void setGolongan(String golongan) {
		Golongan = golongan;
	}

	public int getGaji_Perbulan() {
		return Gaji_Perbulan;
	}

	public void setGaji_Perbulan(int gaji_Perbulan) {
		Gaji_Perbulan = gaji_Perbulan;
	}

	public Date getTanggal_Masuk() {
		return Tanggal_Masuk;
	}

	public Date setTanggal_Masuk(Date dates) {
		return dates;

	}

	public String getFormattedTglMasuk() {
		return formattedTglMasuk;
	}

	public void setFormattedTglMasuk(String formattedTglMasuk) {
		this.formattedTglMasuk = formattedTglMasuk;
	}

}
