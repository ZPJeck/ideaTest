package nyist.net.dao;

import nyist.net.po.Admin;

public interface AdminMapper {
	/*
	 * 验证用户登录  
	 */
	public Admin SelectAdmin(Admin admin);
}
