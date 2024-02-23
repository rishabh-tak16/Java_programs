interface Doable{
default void doIt(){//public
System.out.println("Do it now");
}
//void sum(); //error
}

@FunctionalInterface
interface Sayable extends Doable{
void say(String msg); //abstract method
}

public class FunctionalInterfaceExample3 implements Sayable{
public void say(String msg){
System.out.println(msg);
}
public static void main(String[] args){
FunctionalInterfaceExample3 fie=new FunctionalInterfaceExample3();
fie.say("Hello there");
fie.doIt();
}
}