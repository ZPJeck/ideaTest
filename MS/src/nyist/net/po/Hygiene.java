package nyist.net.po;

import java.util.Date;

public class Hygiene {
	
	private Integer HId;
	private Date HTime;
	private Integer score;
	private String Remarks;
	private Integer HDnum;
	public Integer getHId() {
		return HId;
	}
	public void setHId(Integer hId) {
		HId = hId;
	}
	public Date getHTime() {
		return HTime;
	}
	public void setHTime(Date hTime) {
		HTime = hTime;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public Integer getHDnum() {
		return HDnum;
	}
	public void setHDnum(Integer hDnum) {
		HDnum = hDnum;
	}
}
