package com.itheima.domain;
public class User {
	private Integer id;
	private String username;
	private String paswword;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPaswword() {
		return paswword;
	}
	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", paswword=" + paswword + "]";
	}
	
	

}
