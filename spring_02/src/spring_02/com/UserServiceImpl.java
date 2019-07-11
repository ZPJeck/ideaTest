package spring_02.com;

public class UserServiceImpl implements UserService {
    @Override
    public void add(String name) {
        System.out.println("调用add(String name)   name:"+name);
    }

    @Override
    public String query() {
        System.out.println("调用query( )!!!");
        return "发疯";
    }
}
