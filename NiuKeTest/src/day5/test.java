package day5;

/**
 * @Auther: Zpjeck
 * @Date: 2019/6/22 13:03
 * @Description:
 */
public class test {
}

interface A{
    void eat(int b);
}
interface B{
    void eat(int c,int a);
}
class C implements A,B{
    @Override
    public void eat(int a,int cc) {

    }

    @Override
    public void eat(int b) {

    }
}
abstract class F{


    abstract void aVoid();
}
