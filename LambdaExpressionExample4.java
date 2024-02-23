@FunctionalInterface
interface Sayable{
public String say(String name);
}

public class LambdaExpressionExample4{
public static void main(String[] args){
//Lambda expression with single parameter.
Sayable s1=(name)->{
return "Hello, "+name;
};

System.out.println(s1.say("Sonoo"));

//You can omit function parentheses
Sayable s2=name->{
return "Bye "+name;
};

System.out.println(s2.say("Sonoo"));

System.out.println("Statement1");
System.out.println("Statement2");

System.out.println(s2.say("Sonoo"));
}
}