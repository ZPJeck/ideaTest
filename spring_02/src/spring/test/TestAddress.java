package spring.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.AddressDao;

public class TestAddress {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/source/Address.xml");
        AddressDao dao = (AddressDao) context.getBean("addressDao");
        AddressDao dao1 = (AddressDao) context.getBean("addressDao");
        AddressDao dao2= (AddressDao) context.getBean("addressDao");
        System.out.println(dao);
        System.out.println(dao1);
        System.out.println(dao2);
        /*context.close();*/

		/*AddressDao dao = (AddressDao) Class.forName("dao.AddressDaolmpl").newInstance();
		System.out.println(dao);*/
    }
}
