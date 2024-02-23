import java.util.Scanner;
class ExampleInput1{
public static void main(String[] args){
//throws IOExpection{
byte b;
short s;
int i;
long l;
float f;
double d;
boolean bo;
//String c;
//String s1;
char c1;
Scanner in=new Scanner(System.in);
System.out.println("Enter a Byte : ");
b=in.nextByte();
System.out.println("Byte :"+b);
System.out.println("Enter a short : ");
s=in.nextShort();
System.out.println("Short :"+s);
System.out.println("Enter a integer : ");
i=in.nextInt();
System.out.println("Integer :"+i);
System.out.println("Enter a long : ");
l=in.nextLong();
System.out.println("Long :"+l);
System.out.println("Enter a float : ");
f=in.nextFloat();
System.out.println("Float :"+f);
System.out.println("Enter a double : ");
d=in.nextDouble();
System.out.println("Double :"+d);
System.out.println("Enter a boolean : ");
bo=in.nextBoolean();
System.out.println("Boolean :"+bo);
//xSystem.out.println("Enter a char : ");
//c1=in.nextChar();
//System.out.println("Char :"+c1);

}
}