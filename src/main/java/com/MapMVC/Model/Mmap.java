package com.MapMVC.Model;

import javax.management.loading.PrivateClassLoader;

import lombok.Data;

@Data
public class Mmap {
	private String diaChi;
	private int id;
	private String moTa;
	private String theLoai;
	private float lat;
	private float log;
	private String sdt;

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLog() {
		return log;
	}

	public void setLog(float log) {
		this.log = log;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Mmap(String diaChi, int id, String moTa, String theLoai, float lat, float log, String sdt) {
		super();
		this.diaChi = diaChi;
		this.id = id;
		this.moTa = moTa;
		this.theLoai = theLoai;
		this.lat = lat;
		this.log = log;
		this.sdt = sdt;
	}

	public Mmap() {
		super();
	}

	public Mmap(String diaChi, String moTa, String theLoai, float lat, float log, String sdt) {
		super();
		this.diaChi = diaChi;
		this.moTa = moTa;
		this.theLoai = theLoai;
		this.lat = lat;
		this.log = log;
		this.sdt = sdt;
	}

}
