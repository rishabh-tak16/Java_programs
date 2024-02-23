class Parent{
int a=20;
void f1(){
System.out.println("Parent");
}
}

class Child extends Parent{
int a=30;
void f1(){
System.out.println("Child");
}
}

class Program2{
public static void main(String args[]){
Parent p1=new Child();
System.out.println(p1.a);
p1.f1();
}
}