interface Doable{
default void doIt(){
System.out.println("Do it now");
}
}

@FunctionalInterface
interface Sayable extends Doable{
void say(String msg);
}

public class Functional_Interface implements Sayable{
public void say(String msg){
System.out.println(msg);
}
public static void main(String args[]){
Functional_Interface obj=new Functional_Interface();
obj.say("Hello there");
obj.doIt();
}
}