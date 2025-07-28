package lec_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("demo.txt");
		f.createNewFile();
//		f.delete();
		
//		FileWriter fr=new FileWriter(f);   // by default append will be false
		FileWriter fr=new FileWriter(f,true);   // append will get true now file writer will append data in file   
//		fr.write(99);
//		fr.write('a');
//		fr.write("  abcd   \n");
//		
//		fr.write(1234 +" \n");
//		char[] arr= {'a','b','c','d','e','f'};
//		fr.write(arr);
//		
//		
//		fr.flush();    // clears stream forcefully
//		fr.close();    // closes file writer and saves changes done by file writer
//		
//		BufferedWriter br=new BufferedWriter(fr);
//		
//		br.write(99);
//		br.write('a');
//		br.write("  abcd   \n");
//		
//		br.write(1234 +" \n");
//		char[] arr= {'a','b','c','d','e','f'};
//		br.write(arr);
//		br.newLine();
//		
//		br.flush();
//		br.close();
		
		
		PrintWriter pr=new PrintWriter(fr);
//		PrintWriter pr=new PrintWriter(f,true);
		pr.println(false);
		pr.println('c');
		pr.println(99);
		pr.println(Long.MAX_VALUE);
		
		pr.flush();
 		pr.close();
 		
 		
	}

}
