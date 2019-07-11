package spring_02.aop;

public class EmpServiceImpl implements  EmpService{
    @Override
    public void add() {
        System.out.println("处理业务逻辑   调用dao方法~~");
    }

    @Override
    public void delete() {
        System.out.println("处理业务逻辑   调用dao方法~~");
    }

    @Override
    public void update() {
        System.out.println("处理业务逻辑   调用dao方法~~");
    }

    @Override
    public void query() {
        System.out.println("处理业务逻辑   调用dao方法~~");
    }
}
