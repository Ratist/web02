package spring.test06;

import java.util.Date;

public class Tire {
	String   maker;
	String   spec;
	Date   createdDate;
	
	public Tire() {}
	
	public Tire(String maker, String spec){
		this.maker = maker;
		this.spec = spec;
	}

	@Override
	public String toString() {
	  return "[타이어:" + maker + "," + spec + "," +
	      ((createdDate != null) ? createdDate.toString() : "") + "]";
	}
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Date getCreateDate() {
		return createdDate;
	}

	public void setCreateDate(Date createDate) {
		this.createdDate = createDate;
	}
	
	
	
}
