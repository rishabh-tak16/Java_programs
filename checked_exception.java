import java.io.IOException;
public class checked_exception{
void m()throws IOException{
throw new IOException("Device error");
}
void n() throws IOException{m();}
void p(){
try{n();}
catch(Exception e){System.out.println("Exception handled");}
}
public static void main(String[] args){
checked_exception obj=new checked_exception();
obj.p();
System.out.println("Normal flow");
}
}