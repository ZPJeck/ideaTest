package spring_04.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_04.dao.StudentDao;
import spring_04.entity.Student;

public class TestDruid {
    @Test
    public void testDruid1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_04\\resource\\sm.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession session = sqlSessionFactory.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = dao.queryStudentById(1715925723);
        System.out.println(student);
    }
}
