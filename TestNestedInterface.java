interface Outer{
void show();
interface inner{
void show1();
}
}

//class TestNestedInterface implements Outer
class TestNestedInterface implements Outer.inner{
public void show(){
System.out.println("Show method");
}
public void show1(){
System.out.println("Show1 method");
}
public static void main(String...aa){
//TestNestedInterface obj=new TestNestedInterface();
//Outer obj=new TestNestedInterface(); //error in show1
Outer.inner obj=new TestNestedInterface(); //error in show
//obj.show();
obj.show1();
}
}