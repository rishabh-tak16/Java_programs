//Read from File and write to File
import java.io.*;
import java.util.*;
public class PrintWriter3{
	public static void main(String[] args)throws IOException{
		File f1=new File("abc1.txt");
		File f2=new File("abc3.txt");
		f2.createNewFile();
		PrintWriter pw=new PrintWriter(f2);
		Scanner in=new Scanner(f1);
		while(in.hasNext()){
			pw.println(in.next());
		}
		pw.close();
		in.close();
	}
}