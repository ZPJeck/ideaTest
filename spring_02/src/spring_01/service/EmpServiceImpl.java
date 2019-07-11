package spring_01.service;

public class EmpServiceImpl implements EmpService {
    @Override
    public void add() {
        System.out.println("处理业务逻辑-------调用add（）方法--------");
    }

    @Override
    public void delete() {
        System.out.println("处理业务逻辑--------调用delete()方法----------");
    }

    @Override
    public void updata() {
        System.out.println("处理业务逻辑---------调用updata()方法--------");
    }

    @Override
    public void query() {
        System.out.println("处理业务逻辑---------调用query()方法---------");
    }
}
