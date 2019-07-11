package day6;

public class Test {

    public static void main (String args[]) {
        A a = new A();
        B b = new B();
        System.out.println(a.get());
        System.out.println(b.get());
    }
}
class A{
    public Integer get(){
        System.out.println("AAAAAAAAAAAAAAAAAA");
        return 5;
    }
}
class B extends A{
    public Integer get(){
        System.out.println("BBBBBBBBBBBBBBBBBB");
         for (int i= 0  ;i<100;i++){
            break  ;
        }
        return 6;
    }
    public String get(int a){
        char aa = '中';
        return "";
    }
}
abstract class C{
    public String a(){

        return "";
    }
}