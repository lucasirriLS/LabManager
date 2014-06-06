package it.rn14.managerlab.proxyobj;

import it.rn14.managerlab.Event;

public class Lab extends Event {
	
	private boolean suitablenovice;
	private boolean suitablehandicap;
	private int maxage = 200;
	private int minage = 0;
	private int subcamp;
	
	private String title;

	public boolean isSuitablenovice() {
		return suitablenovice;
	}

	public void setSuitablenovice(boolean suitablenovice) {
		this.suitablenovice = suitablenovice;
	}

	public boolean isSuitablehandicap() {
		return suitablehandicap;
	}

	public void setSuitablehandicap(boolean suitablehandicap) {
		this.suitablehandicap = suitablehandicap;
	}

	public int getMaxage() {
		return maxage;
	}

	public void setMaxage(int maxage) {
		this.maxage = maxage;
	}

	public int getMinage() {
		return minage;
	}

	public void setMinage(int minage) {
		this.minage = minage;
	}

	public int getSubcamp() {
		return subcamp;
	}

	public void setSubcamp(int subcamp) {
		this.subcamp = subcamp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
