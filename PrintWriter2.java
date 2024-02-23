//Read from Console and Write to File 
import java.io.*;
import java.util.*;
public class PrintWriter2{
	public static void main(String[] args)throws IOException{
		File f1=new File("abc2.txt");
		f1.createNewFile();
		PrintWriter pw=new PrintWriter(f1);
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++){
			pw.println(in.next());
		}
		pw.close();
		in.close();
	}
}