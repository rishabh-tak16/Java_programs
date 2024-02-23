//outer class
class OuterClass
{
//static member
static int outer_x=10;

//insatnce(non-static) member
int outer_y=20;

//private member
private static int outer_private=30;

//static nested class
static class StaticNestedClass//void add()
{
static void display(){
OuterClass obj1=new OuterClass();

//can access static member of outer class
System.out.println("outer_x="+outer_x);
//can access display private static member of outer class
System.out.println("outer_private"+ outer_private);
//The following statement will give compilation error
//as static nested class cannot directly access non-static members
System.out.println("outer_y="+ obj1.outer_y);
}
}
}

//Driver class
public class StaticNestedClassDemo{
public static void main(String[] args){
//accessing a static nested class
//OuterClass.StaticNestedClass nestedObject=new OuterClass.StaticNestedClass();
//nestedObject.display();
OuterClass.StaticNestedClass.display();
}
}