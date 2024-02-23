import java.io.*;
class FileInputOutExample{
	public static void main(String[] args){
		FileInputStream fin;
		FileOutputStream fout;
		try{
			fin=new FileInputStream("testoutp.txt");//Byte by byte read
			fout=new FileOutputStream("sample.txt");//byte by byte write
			int i;
			while((i=fin.read())!=-1) fout.write(i);
			//fout.flush();
			//fout.close();
		}
		catch(Exception e){
			System.out.println("Exception");
		}
	}
}


