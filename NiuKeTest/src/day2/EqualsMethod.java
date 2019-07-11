package day2;

/**
 * @Auther: Zpjeck
 * @Date: 2019/5/28 07:58
 * @Description:
 */
public class EqualsMethod
{
    public static void main(String[] args)
    {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.print(n1 == n2);
        System.out.print(",");
        System.out.println(n1 != n2);
    }
}