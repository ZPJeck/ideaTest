package spring_03.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_03.service.StudentService;

public class TestStudentService {
    @Test
    public void testStu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_03/resource/student.xml");
        StudentService stu = (StudentService) context.getBean("stuService");
        System.out.println(stu.getClass());
        stu.add();
        System.out.println("----------111----------");
        stu.add();
        System.out.println("----------222----------");
        stu.delete();
    }
}
