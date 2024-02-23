// Read from File and Write to console
import java.io.*;
import java.util.*;
public class PrintWriter1{
  public static void main(String[] args)throws IOException{
	PrintWriter pw=new PrintWriter(System.out);
	File f1=new File("abc1.txt");
	Scanner in=new Scanner(f1);
	while(in.hasNext()){
		pw.println(in.next());
	}
	pw.close();
	in.close();
	}
}