package day3;

/**
 * @Auther: Zpjeck
 * @Date: 2019/5/31 21:46
 * @Description:
 */
public class TestA extends A{


    public static void main(String[] args) {
        new TestA();
        A s = new A();
        int a = '2';
        System.out.println(a);
        s.testw();
    }




}

class D {

    private static int a;
//    int a;

    public static int testA(){

        return a;
    }


}



class A {
    A(){
        System.out.println("A");
    }
     void testw(){

    }
}
class B extends A{

}
class C extends B{

}
