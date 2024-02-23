import java.io.*;

public class FileAppendExample{
	public static void main(String[] args){
		try{
		 	Writer w=new FileWriter("abc1.txt");
			String content="your are my heart and soul";
			w.append(content); 	
			w.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
}