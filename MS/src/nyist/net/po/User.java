package nyist.net.po;

public class User {
	private Integer userID;
	private String username;
	private String password;
	private String stu;
	private String sex;
	private Integer dnum;
	private Integer bedNum;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStu() {
		return stu;
	}
	public void setStu(String stu) {
		this.stu = stu;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getDnum() {
		return dnum;
	}
	public void setDnum(Integer dnum) {
		this.dnum = dnum;
	}
	public Integer getBedNum() {
		return bedNum;
	}
	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username
				+ ", password=" + password + ", stu=" + stu + ", sex=" + sex
				+ ", dnum=" + dnum + ", bedNum=" + bedNum + "]";
	}
	
	
	
}
