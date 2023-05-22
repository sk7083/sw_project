package com.kh.sw.vo;

public class CategoryVO {
	
	private String ca_pid;
	private String ca_name;
	
	public String getCa_name() {
		return ca_name;
	}
	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}
	public String getCa_pid() {
		return ca_pid;
	}
	public void setCa_pid(String ca_pid) {
		this.ca_pid = ca_pid;
	}
	
	@Override
	public String toString() {
		return "CategoryVO [ca_pid=" + ca_pid + ", ca_name=" + ca_name + "]";
	}
}
