import java.lang.*;
public class CmdInput{
public static void main(String args[]){
System.out.println("length is :"+args.length);
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
//System.out.println(Integer.parseInt(args[0]+args[1]));
int a=Integer.parseInt(args[1]);
double b=Double.parseDouble(args[2]);
//Double b=Double.valueof(args[2]);
double c=a+b;
System.out.println(c);
}
}