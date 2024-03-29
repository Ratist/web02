package spring.test12;

import java.util.Date;
import java.util.Properties;
import java.util.Map.Entry;

public class Tire {
	String maker;
	Properties spec;
	Date createdDate;

	public Tire() {
	}

	public Tire(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[타이어:" + maker + ",\n");

		if (spec != null) {
			for (Entry<Object, Object> entry : spec.entrySet()) {
				buf.append("   >" + entry.getKey() + ":" + entry.getValue() + "\n");
			}
		}

		buf.append("   ");
		buf.append((createdDate != null) ? createdDate.toString() : "");
		buf.append("\n]");
		return buf.toString();
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public Properties getSpec() {
		return spec;
	}

	public void setSpec(Properties spec) {
		this.spec = spec;
	}

	public Date getCreateDate() {
		return createdDate;
	}

	public void setCreateDate(Date createDate) {
		this.createdDate = createDate;
	}
	
	

}
