interface A{
static void add(){
System.out.println("A hello");
}
}

interface B{
static void add(){
System.out.println("B hello");
}
}

class check2 implements A,B{
public static void main(String args[]){
A c=new check2();
c.add();
}
}