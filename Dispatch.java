class A{
void callme(){
System.out.println("Inside A's callme method.");
}
}

class B extends A{
void callme(){
System.out.println("Inside B's callme method.");
}
}

class C extends A{
void callme(){
System.out.println("Inside C's callme method.");
}
}

class Dispatch{
public static void main(String args[]){

A a=new A(); //object of type A
B b=new B(); //object of type B
C c=new C(); //object of type C

A r; //obtain a reference of type A

r=a; //calls A's version of callme()
r.callme(); // call A's version of callme()

r=b; 
r.callme();

r=c;  // r refers to a C onject means A r=new C()
r.callme(); //call C's version of callme()

}
}

