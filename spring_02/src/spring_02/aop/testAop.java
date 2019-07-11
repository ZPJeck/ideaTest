package spring_02.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAop {
    @Test
    public void testAop1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_02/aop/aop.xml");
        //empService 此时是动态代理对象
        EmpService empService = (EmpService) context.getBean("empService");
        System.out.println(empService.getClass());

        empService.add();
        empService.add();
        System.out.println("=======================");
        empService.delete();
        System.out.println("=======================");
        empService.update();
        System.out.println("=======================");
        empService.query();
    }
}
