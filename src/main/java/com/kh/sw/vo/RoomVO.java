package com.kh.sw.vo; 
 
import org.springframework.format.annotation.DateTimeFormat;
 
public class RoomVO { 
	private int ro_pid;
	private int pr_pid;
	private String ro_name;
	private int ro_count;
	private String ro_description;
	private int ro_min_people;
	private int ro_max_people;
	//숙박 대실 선택
	private String ro_select;
	
	//숙박
	private String ro_s_price;
	@DateTimeFormat(pattern = "HH:mm")
	private String ro_s_in_time;
	@DateTimeFormat(pattern = "HH:mm")
	private String ro_s_out_time;
	//대실
	private String ro_t_price;
	@DateTimeFormat(pattern = "HH:mm")
	private String ro_t_in_time;
	@DateTimeFormat(pattern = "HH:mm")
	private String ro_t_out_time;


	public int getRo_pid() {
		return ro_pid;
	}
	public void setRo_pid(int ro_pid) {
		this.ro_pid = ro_pid;
	}
	public int getPr_pid() {
		return pr_pid;
	}
	public void setPr_pid(int pr_pid) {
		this.pr_pid = pr_pid;
	}
	public String getRo_name() {
		return ro_name;
	}
	public void setRo_name(String ro_name) {
		this.ro_name = ro_name;
	}
	public String getRo_select() {
		return ro_select;
	}
	public void setRo_select(String ro_select) {
		this.ro_select = ro_select;
	}
	public String getRo_s_price() {
		return ro_s_price;
	}
	public void setRo_s_price(String ro_s_price) {
		this.ro_s_price = ro_s_price;
	}
	public String getRo_s_in_time() {
		return ro_s_in_time;
	}
	public void setRo_s_in_time(String ro_s_in_time) {
		this.ro_s_in_time = ro_s_in_time;
	}
	public String getRo_s_out_time() {
		return ro_s_out_time;
	}
	public void setRo_s_out_time(String ro_s_out_time) {
		this.ro_s_out_time = ro_s_out_time;
	}
	public String getRo_t_price() {
		return ro_t_price;
	}
	public void setRo_t_price(String ro_t_price) {
		this.ro_t_price = ro_t_price;
	}
	public String getRo_t_in_time() {
		return ro_t_in_time;
	}
	public void setRo_t_in_time(String ro_t_in_time) {
		this.ro_t_in_time = ro_t_in_time;
	}
	public String getRo_t_out_time() {
		return ro_t_out_time;
	}
	public void setRo_t_out_time(String ro_t_out_time) {
		this.ro_t_out_time = ro_t_out_time;
	}
	public int getRo_count() {
		return ro_count;
	}
	public void setRo_count(int ro_count) {
		this.ro_count = ro_count;
	}
	public String getRo_description() {
		return ro_description;
	}
	public void setRo_description(String ro_description) {
		this.ro_description = ro_description;
	}
	public int getRo_min_people() {
		return ro_min_people;
	}
	public void setRo_min_people(int ro_min_people) {
		this.ro_min_people = ro_min_people;
	}
	public int getRo_max_people() {
		return ro_max_people;
	}
	public void setRo_max_people(int ro_max_people) {
		this.ro_max_people = ro_max_people;
	}
	
	@Override
	public String toString() {
		return "RoomVO [ro_pid=" + ro_pid + ", pr_pid=" + pr_pid + ", ro_name=" + ro_name + ", ro_count=" + ro_count
				+ ", ro_description=" + ro_description + ", ro_min_people=" + ro_min_people + ", ro_max_people="
				+ ro_max_people + ", ro_select=" + ro_select + ", ro_s_price=" + ro_s_price + ", ro_s_in_time="
				+ ro_s_in_time + ", ro_s_out_time=" + ro_s_out_time + ", ro_t_price=" + ro_t_price + ", ro_t_in_time="
				+ ro_t_in_time + ", ro_t_out_time=" + ro_t_out_time + "]";
	}
} 
