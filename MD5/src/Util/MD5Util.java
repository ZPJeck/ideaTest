package Util;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

public class MD5Util {

    public static String salt(){
        // 设置字符串
        char[] arr = "qwertyuiopasdfghhjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890".toCharArray();
        Random random = new Random();
        // 获取盐值
        String salt = "";
        for (int i = 0; i< 6; i++){
            salt += arr[random.nextInt(arr.length)];
        }
        return salt;
    }

    public static String getPassBySalt(String password,String salt){
        return DigestUtils.md5Hex(password+salt);
    }

    public static String getPass(String password){
        // 加密
        return DigestUtils.md5Hex(password);
    }

}
