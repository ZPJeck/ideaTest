package nyist.net.po;

import java.util.Date;

public class Water {

	
	private String WeId;
	private String  WeTime;
	private Integer WeMon;
	private Integer We_Dnum;
	public String getWeId() {
		return WeId;
	}
	public void setWeId(String weId) {
		WeId = weId;
	}
	public String getWeTime() {
		return WeTime;
	}
	public void setWeTime(String weTime) {
		WeTime = weTime;
	}
	public Integer getWeMon() {
		return WeMon;
	}
	public void setWeMon(Integer weMon) {
		WeMon = weMon;
	}
	public Integer getWe_Dnum() {
		return We_Dnum;
	}
	public void setWe_Dnum(Integer we_Dnum) {
		We_Dnum = we_Dnum;
	}
	@Override
	public String toString() {
		return "Water [WeId=" + WeId + ", WeTime=" + WeTime + ", WeMon="
				+ WeMon + ", We_Dnum=" + We_Dnum + "]";
	}
	
	
	
	
}
