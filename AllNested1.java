class AllNested1{
//Static Nested Class
static class nestedstatic{
int a=10;
static int b=20; 
void display(){
System.out.println("non-static a="+a);
System.out.println("static b="+b);
}
}
//Inner Class or non static nested class
class inner{
int a=10;
final static int b=20;
//static int b=20;
//Error: modifier static is only allowed in constant variable deddlarations
void display(){
System.out.println("static b="+b);
int a=10;//effectively final
System.out.println("inner a="+a);
//Local class
class localclass{
int b;
//a=20;//error: because a is effectively final
void show(){
System.out.println("local a="+a);
}
}
localclass obj3=new localclass();
obj3.show();
}
}
public static void main(String args[]){
//anaonymous class which define its own method
new AllNested1(){
void display(){
System.out.println("Hello");
}
}.display();
//create insatnce of nested static class
AllNested1.nestedstatic obj=new AllNested1.nestedstatic();
obj.display();
//create instance of nested nonstatic class
AllNested1 obj2=new AllNested1();
AllNested1.inner obj1=obj2.new inner();
obj1.display();
}
}








