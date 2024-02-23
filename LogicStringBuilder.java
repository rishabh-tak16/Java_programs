/*StringBuilder class is better version of String class.
StrigBuilder class objects are mutable(can be manipulated).code consist of methods of String class*/

class LogicStringBuilder{
void stringBuilderMethods(){

//StringBuilder sb=new StringBuilder(50);
//sb.append("Hello my students.");

StringBuilder sb=new StringBuilder("Hello my students");
sb.append("xyz");
System.out.println(sb);
System.out.println(sb.length());
System.out.println(30);

//System.out.println(sb.capacity());
System.out.println(sb.length());
System.out.println(sb);

sb.setCharAt(2,'w');
System.out.println("SetCharAt: "+sb);

sb.reverse();
System.out.println("reverse :"+sb);

sb.reverse();
sb.insert(2,'y');
System.out.println(sb);
sb.deleteCharAt(5);
System.out.println("deleteCharAt :"+sb);
sb.delete(5,10);
System.out.println("Delete: "+sb);
System.out.println(sb.substring(5));
System.out.println(sb);
System.out.println(sb.substring(5,7));
StringBuilder b1=new StringBuilder("Hello");
//StringBuilder b3="Hello";//error : String cannot convert into StringBuilder
StringBuilder b2=new StringBuilder("Hello");
System.out.println("b1 equals b2="+b1.equals(b2));//logical error reason equals do comparsion between content b1 and b2 and "hello" is not considered as String
//they are stored in non readable format.
System.out.println("b1 equals b2 toString()= "+b1.toString().equals(b2.toString()));
}
public class P19StringBuilder{
public static void main(String args[]){
LogicStringBuilder obj=new LogicStringBuilder();
obj.stringBuilderMethods();
}
}

}