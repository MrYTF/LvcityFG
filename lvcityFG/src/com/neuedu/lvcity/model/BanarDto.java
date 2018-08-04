package com.neuedu.lvcity.model;
/**
 * Banar实体类
 * @author LiQi
 *
 */
public class BanarDto {
	private int banarid;
	private String image;
	private int state;
	public int getBanarid() {
		return banarid;
	}
	public void setBanarid(int banarid) {
		this.banarid = banarid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public BanarDto(int banarid, String image, int state) {
		super();
		this.banarid = banarid;
		this.image = image;
		this.state = state;
	}
	
	public BanarDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BanarDto [banarid=" + banarid + ", image=" + image + ", state=" + state + "]";
	}
	
}
