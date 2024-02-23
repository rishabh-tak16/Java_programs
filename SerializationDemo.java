import java.io.Serializable;
import java.io.*;

class MyClass implements Serializable{
	String s;
	int i;
	double d;
	public MyClass(String s,int i,double d){
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public String toString(){
		return "s="+s+"; i="+i+"; d="+d;
	}
};

public class SerializationDemo{
	public static void main(String args[]){
		try{
			MyClass object1=new MyClass("Hello",-7,2.7e10);
			//System.out.println("object1 :"+object1);
			FileOutputStream fos=new FileOutputStream("serial.txt");//write
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}
		catch(IOException e){
			System.out.println("Exception during serialization: "+e);
			System.exit(0);
		}
	}
}