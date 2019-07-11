package day4;

public class Demo{
    static final int i = 1;
    public static void main(String[] args){
        System.out.print(getNumber(0));
        System.out.print(getNumber(1));
        System.out.print(getNumber(2));
        System.out.print(getNumber(4));
        String a = "asdasd";
        a = ""+"";

    }

    public static int getNumber(int num){

        try{
            int result = 2 / num;
            return result;
        }catch (Exception exception){
            return 0;
        }finally{
            if(num == 0){
                return -1;
            }
            if(num == 1){
                return 1;
            }else{
                return 6;
            }
        }
    }
}
abstract class A {
    public abstract void testA();
}

class B{

    static  int a ;

}