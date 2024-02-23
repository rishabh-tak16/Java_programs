//exception doesn't occur
//for each try block there can be zero or more catch statement 

class TestFinallyBlock{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
/*
try{
int data=a/b;
System.out.println(data);
}
catch(NullPointerException e){System.out.println("I am handling the exception "+e);}
catch(ArithmeticException e){System.out.println("I am handling the arthmetic exception and b should not be zero ");}
catch(Exception e){System.out.println("I am handling all the exception "+e);}

finally{System.out.println("Finally block is always executed");}
*/
System.out.println("Rest of the code....");
}
}