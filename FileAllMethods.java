//Various methods that work with files
import java.io.*;
class FileAllMethods{
	public static void main(String...ag)throws IOException{
		File f=new File("abc.txt");//for parent:E//LPU//abc.txt
		f.createNewFile();
		System.out.println("=========================================");
		System.out.println("List of various methods work with file:\n\n");
		System.out.println("File name : "+f.getName());
		System.out.println("Path: "+f.getPath());
		System.out.println("last Modified: "+new java.util.Date(f.lastModified()));
		System.out.println("Absolute path: "+f.getAbsolutePath());
		System.out.println("Canonical path: "+f.getCanonicalPath());
		System.out.println("parent: "+f.getParent());
		System.out.println("Exists: "+f.exists());
		if(f.exists()){
			System.out.println("Is writeable: "+f.canWrite());
			System.out.println("Is readable: "+f.canRead());
			System.out.println("Is a directory :"+f.isDirectory());
			System.out.println("Is a file: "+f.isFile());
			System.out.println("File size in bytes "+f.length());
		}
	}
}