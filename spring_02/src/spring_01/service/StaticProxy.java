package spring_01.service;

public class StaticProxy implements EmpService {
    private  EmpServiceImpl empService = new EmpServiceImpl();
    @Override
    public void add() {
        try{
            System.out.println("开启事务");
            empService.add();
            System.out.println("提交事务");
        }catch (Exception e){
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        try{
            System.out.println("开启事务");
            empService.delete();
            System.out.println("提交事务");
        }catch (Exception e){
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }

    @Override
    public void updata() {
        try{
            System.out.println("开启事务");
            empService.updata();
            System.out.println("提交事务");
        }catch (Exception e){
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }

    @Override
    public void query() {
        try{
            System.out.println("开启事务");
            empService.query();
            System.out.println("提交事务");
        }catch (Exception e){
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }
}
