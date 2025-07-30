package Lec_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reading_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("demo.txt");
		
		FileReader fr=new FileReader(f);
//		
//		int c=1;
//		
//		int ch=fr.read();     // returns asci value of cahr and retunrns -1 when there is nothing to read
//		while(ch!=-1) {
//			System.out.print((char)(ch));
//			ch=fr.read();
//			c++;
//		}
//		System.out.println(c);
//	
		
//		BufferedReader br=new BufferedReader(fr);
//		
//		String s=br.readLine();
//		int c=0;
//		while(s!=null) {
//			System.out.println(s);
//			s=br.readLine();
//			c++;
//		}
//		System.out.println(c);
		
		
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			if(sc.hasNextBoolean()) {
				boolean b=sc.nextBoolean();
				System.out.println(b);
			}
			if(sc.hasNextInt()) {
				int i=sc.nextInt();
				System.out.println(i);
			}
			String s=sc.nextLine();
//			System.out.println(s);
		}
		
	}

}
