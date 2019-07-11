package nyist.net.service;

import nyist.net.po.Admin;

public interface AdminService {
	/*
	 * 验证用户登录  
	 */
	public Admin SelectAdmin(Admin admin);
}
