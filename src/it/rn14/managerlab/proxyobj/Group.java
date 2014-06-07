package it.rn14.managerlab.proxyobj;

public class Group {

	private String name;
	private long code;
	private int subcamp;
	private int twinning;
	
	public Group(String name, long code) {
		super();
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public int getSubcamp() {
		return subcamp;
	}
	public void setSubcamp(int subcamp) {
		this.subcamp = subcamp;
	}
	public int getTwinning() {
		return twinning;
	}
	public void setTwinning(int twinning) {
		this.twinning = twinning;
	}

}
