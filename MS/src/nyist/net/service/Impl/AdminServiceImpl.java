package nyist.net.service.Impl;

import nyist.net.dao.AdminMapper;
import nyist.net.po.Admin;
import nyist.net.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	  private AdminMapper adminMapper;
	public Admin SelectAdmin(Admin admin) {
		
		return adminMapper.SelectAdmin(admin);
	}
}
