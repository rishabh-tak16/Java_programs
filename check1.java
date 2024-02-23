interface A{
default void add(){
System.out.println("A hello");
}
}

interface B{
default void add(){
System.out.println("B hello");
}
}

class check1 implements A,B{
public static void main(String args[]){
check1 c=new check1();
c.add();2:36 PM 2/27/2023
}
}