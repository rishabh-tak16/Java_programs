public class TestThrow1{
static void validate(int age){
if(age<18) 
//throw new java.io.IOException("Not valid");//error
throw new ArithmeticException("Not valid");//Only checked exception
else System.out.println("Welcome to vote");
}
public static void main(String args[]){
validate(13);
System.out.println("Rest of the code.....");
}
}