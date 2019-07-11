package nyist.net.service.Impl;

import java.util.List;

import nyist.net.dao.UserMapper;
import nyist.net.po.User;
import nyist.net.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private  UserMapper userMapper;
	

	public User SelectUser(User user) {
		
		return userMapper.SelectUser(user);
		
	}

	
	public void InsertUser(User user) {
		
		userMapper.InsertUser(user);

	}


	public List<User> selectUsersByAdmin() {
		
		return userMapper.selectUsersByAdmin();
	}



}
