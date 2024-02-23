class parent{
public parent(int a){
System.out.println("Parent class");
} 
}
class parent2 extends parent{
public parent2(){
super(7);
System.out.println("Parent2 class");
}
}
class child extends parent2{
public child(){
System.out.println("child class");
}
public static void main(String [] args){
child c=new child();
}
}