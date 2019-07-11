package spring.dao;

public class AddressDaoImpl implements AddressDao {

    public void init(){
        System.out.println("初始化对象");
    }
    @Override
    public void save() {
        System.out.println("调用save()方法");
    }
    public void destory(){
        System.out.println("销毁对象");
    }
}
