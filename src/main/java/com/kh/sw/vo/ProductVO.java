package com.kh.sw.vo;

import org.springframework.beans.factory.annotation.Autowired;

import com.kh.sw.dao.ProductDAO;

public class ProductVO {
	@Autowired
	ProductDAO productDAO;
	
	//�긽�뭹 踰덊샇
	private int pr_pid;
	//�긽�뭹 移댄뀒怨좊━ 踰덊샇(紐⑦뀛, �샇�뀛, 寃뚰븯 �벑)
	private String pr_ca_pid;
	//�긽�뭹 �씠由�
	private String pr_name;
	private String ca_name;
	//�긽�뭹 �궡�슜
	private String pr_content;
	//�긽�뭹 二쇱냼
	private String pr_address1;
	private String pr_address2;
	private String pr_address3;
	
	private String displayAdress;

	// �빐�떦 �긽�뭹 由щ럭
	private int re_pid;
	
	//=========== 移댄뀒怨좊━ VO =========
	private int ca_pid;

	public int getPr_pid() {
		return pr_pid;
	}

	public void setPr_pid(int pr_pid) {
		this.pr_pid = pr_pid;
	}

	public String getPr_ca_pid() {
		return pr_ca_pid;
	}

	public void setPr_ca_pid(String pr_ca_pid) {
		this.pr_ca_pid = pr_ca_pid;
	}

	public String getPr_name() {
		return pr_name;
	}

	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}

	public String getPr_content() {
		return pr_content;
	}

	public void setPr_content(String pr_content) {
		this.pr_content = pr_content;
	}

	public String getPr_address1() {
		return pr_address1;
	}

	public void setPr_address1(String pr_address1) {
		this.pr_address1 = pr_address1;
	}

	public String getPr_address2() {
		return pr_address2;
	}

	public void setPr_address2(String pr_address2) {
		this.pr_address2 = pr_address2;
	}

	public String getPr_address3() {
		return pr_address3;
	}

	public void setPr_address3(String pr_address3) {
		this.pr_address3 = pr_address3;
	}

	public int getRe_pid() {
		return re_pid;
	}

	public void setRe_pid(int re_pid) {
		this.re_pid = re_pid;
	}
	

	public String getCa_name() {
		return ca_name;
	}

	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}

	public String getDisplayAdress() {
		return this.pr_address2+" "+this.pr_address3;
	}

	public void setDisplayAdress(String displayAdress) {
		this.displayAdress = displayAdress;
	}

	@Override
	public String toString() {
		return "ProductVO [productDAO=" + productDAO + ", pr_pid=" + pr_pid + ", pr_ca_pid=" + pr_ca_pid + ", pr_name="
				+ pr_name + ", ca_name=" + ca_name + ", pr_content=" + pr_content + ", pr_address1=" + pr_address1
				+ ", pr_address2=" + pr_address2 + ", pr_address3=" + pr_address3 + ", displayAdress=" + displayAdress
				+ ", re_pid=" + re_pid + ", ca_pid=" + ca_pid + "]";
	}
	


}
