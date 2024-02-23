import java.io.*;

public class DeSerializationDemo{
	public static void main(String args[]){
		try{
			MyClass object2;
			FileInputStream fis= new FileInputStream("serial.txt");
			ObjectInputStream ois=new ObjectInputStream(fis); //read
			object2=(MyClass)ois.readObject();
			ois.close();
			System.out.println("object2: "+object2);
		}
		catch(Exception e){
			System.out.println("Exception during deserialization: "+e);
			System.exit(0);
		}
	}
}