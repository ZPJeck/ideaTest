package day2;

import java.io.*;

public class test1 {
	public static void main(String[] args) throws Exception {

		/*OutputStream out = new FileOutputStream("a.txt",true);
		
		out.write('B');
		out.write('A');
		
		out.close();*/
		
		InputStream in = new FileInputStream("a.txt");
		byte[] bs = new byte[10];
		while(true){
			int len = in.read(bs,3,6);
			if(len == -1)  break;
			System.out.print(len+":");
			for (int i= 3; i < bs.length; i++ ){
				System.out.print((char)bs[i] + "");
			}
			System.out.println();
		}
		in.close();
	}

}