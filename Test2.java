class Parent{
int a=20;
}

class child extends Parent{
int a=30;
void display(){
System.out.println(a);
System.out.println(super.a);
}
}

class Test2{
public static void main(String args[]){

child c1=new child();
Parent c2=new child();

System.out.println(c2.a);
System.out.println(c1.a);

System.out.println();

c1.display();

}
}