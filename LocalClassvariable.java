class LocalClassvariable{
void f1(){
//Note the local variable(a) must be final till JDK 7
//Hence this code will work only in JDK 8
int a=10;
class local{
int a=20;
//a=20//error
void display(){
int a=30;
LocalClassvariable a1=new LocalClassvariable();
System.out.println("Value="+a+" "+this.a);
//+f1().a);
}
}
local l1=new local();
l1.display();
}
public static void main(String... aa){
LocalClassvariable obj=new LocalClassvariable();
obj.f1();
}
}