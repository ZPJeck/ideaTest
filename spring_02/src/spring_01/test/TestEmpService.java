package spring_01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_01.service.EmpService;


public class TestEmpService {
    @Test
    public void testserviceimpl(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_01/resource/spring_01.xml");
        EmpService service = (EmpService) context.getBean("staticProxy");
        service.add();
    }
}
