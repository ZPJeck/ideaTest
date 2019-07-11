package nyist.net.po;

import java.util.Date;

public class BaoXiu {
	
	private Integer BxId;
	private Date BxTime;
	private String BxReson;
	private Integer  BxDnum;
	private String BxExa;
	public String getBxExa() {
		return BxExa;
	}
	public void setBxExa(String bxExa) {
		BxExa = bxExa;
	}
	public Integer getBxId() {
		return BxId;
	}
	public void setBxId(Integer bxId) {
		BxId = bxId;
	}
	public Date getBxTime() {
		return BxTime;
	}
	public void setBxTime(Date bxTime) {
		BxTime = bxTime;
	}
	public String getBxReson() {
		return BxReson;
	}
	public void setBxReson(String bxReson) {
		BxReson = bxReson;
	}
	public Integer getBxDnum() {
		return BxDnum;
	}
	public void setBxDnum(Integer bxDnum) {
		BxDnum = bxDnum;
	}
}
