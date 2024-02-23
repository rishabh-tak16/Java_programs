//Read from console and write to console
import java.io.*;
import java.util.*;
public class PrintWriterDemoFlush{
	public static void main(String[] args)throws IOException{
		PrintWriter pw=new PrintWriter(System.out);
		Scanner in=new Scanner(System.in);//read
		for(int i=0;i<5;i++){
			pw.println(in.next());
		}
		//pw.flush();
		pw.close();
		
	}
}