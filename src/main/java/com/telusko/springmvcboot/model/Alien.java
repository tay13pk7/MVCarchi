package com.telusko.springmvcboot.model;

public class Alien 
{
	private int aid;       // this values are used in index.jsp, pls observe
	private String aname;

	public Alien(int aid, String aname) {  // use this only in case of GetMapping call
		super();
		this.aid = aid;
		this.aname = aname;
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {                                           // without this there won't be value on the webpage
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
}
