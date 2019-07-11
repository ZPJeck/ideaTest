import Util.MD5Util;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String pass = MD5Util.getPass("123456");
        String salt = MD5Util.salt();
        String passBySalt = MD5Util.getPassBySalt("123456", salt);
        System.out.println(pass);
        System.out.println(passBySalt);
    }
}
