class StringBuilderEnsureCapacity{
public static void main(String[] aa){
StringBuilder bs6=new StringBuilder();
System.out.println(bs6.capacity()); //16

StringBuilder bs5=new StringBuilder("Hello"); //16+5
System.out.println(bs5.capacity()); //21

StringBuilder bs1=new StringBuilder(7); //among 2*(7+1) and 9
System.out.println(bs1.capacity()); //7

bs1.ensureCapacity(9);
System.out.println(bs1.capacity()); //16

StringBuilder bs4=new StringBuilder(10); //among 10 and 9
bs4.ensureCapacity(9);
System.out.println(bs4.capacity());  //10

StringBuilder bs2=new StringBuilder("a"); //among 2*(17+1) and 18
bs2.append("absc");
System.out.println("bs2:="+bs2.capacity()); //17

bs2.ensureCapacity(18);
System.out.println(bs2.capacity()); //36

StringBuilder bs3=new StringBuilder(); //among 2*(16+1)=34 and 56
System.out.println(bs3.capacity()); //16
bs3.ensureCapacity(56);
System.out.println(bs3.capacity()); //56


}
}