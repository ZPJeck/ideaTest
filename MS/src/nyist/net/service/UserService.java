package nyist.net.service;

import java.util.List;

import nyist.net.po.User;

public interface UserService {
	
	/*
	 * 学生用户登录
	 */
	public User SelectUser(User user);
	/*
	 * 管理员查找所有的学生 
	 */
	public List<User> selectUsersByAdmin();
	/*
	 * 学生信息录入
	 */
	public void InsertUser(User user);
}
