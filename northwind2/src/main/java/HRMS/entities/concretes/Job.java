package HRMS.entities.concretes;

import HRMS.entities.abstracts.Entity;

public class Job implements Entity{

	private String ad;
	private String soyad;
	private int yas;
	
	
	public Job() {}


	public Job(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
}
