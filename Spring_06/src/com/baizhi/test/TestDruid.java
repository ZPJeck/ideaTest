package com.baizhi.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;

public class TestDruid {
	
	public static void main(String[] args) {
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("resources/sm.xml");


		UserDao dao = (UserDao) context.getBean("userDao");
		
		User user = dao.queryUserById(1);
		
		System.out.println(user);
		
	}
	
}
