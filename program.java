public class program{
static {
System.out.println("static block");
}
{
System.out.println("initial block");
}
program(){
System.out.println("constructor block");
}
public static void main(String [] aa){
System.out.println("Hello");
program p1=new program();
program p2=new program();
System.out.println("main block");
}
}
