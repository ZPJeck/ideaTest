package spring_04.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestFactoryBean {
    @Test
    public void Test1(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring_04/factoryBrean/factorybean.xml");
        /*Connection connection = (Connection) context.getBean("connectionFactoryBean");
        System.out.println(connection.getClass());*/
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.
                getBean("connectionFactoryBean");
        System.out.println(sqlSessionFactory);
    }
}
