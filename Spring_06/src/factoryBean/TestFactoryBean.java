package factoryBean;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new
				ClassPathXmlApplicationContext("factoryBean/factorybean.xml");
		
		Connection connection = (Connection) context.getBean("connectionFactoryBean");
		
		System.out.println(connection);
		
//		SqlSessionFactory sqlSessionFactory =
//				(SqlSessionFactory) context.getBean("connectionFactoryBean");
//		//connectionFactoryBean
//		//connectionFactoryBean
////		SqlSessionFactory sqlSessionFactory1 =
////				(SqlSessionFactory) context.getBean("sqlSessionFactoryBean");
////		System.out.println(sqlSessionFactory1);
//		System.out.println(sqlSessionFactory);
//
	}
	
}
