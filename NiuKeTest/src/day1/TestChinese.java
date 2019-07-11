package day1;

/**
 * @Auther: Zpjeck
 * @Date: 2019/5/27 14:36
 * @Description:
 */
public class TestChinese {
    public static void main(String[] args) {
        Chinese c1 = Chinese.getC();
        Chinese c2 = Chinese.getC();
        System.out.println(c1 == c2);
    }
}
class Chinese{
    private static Chinese c = new Chinese();
    private Chinese(){}
    public static Chinese getC(){
        System.out.println(c);
        return c;
    }

}
class Person {
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String id) {
        super(id);
        empID = id;
    }
}

abstract class a{
    public a(){

    }
    abstract void testa();

}
class exatendA extends a{
    @Override
    void testa() {

    }
}
abstract class exatendsC extends a{
     abstract void testa();
}
abstract class b {
    abstract void testb();
}
