class check{
public static void main(String args[]){
String s = "have-fun-with-jaava";
String[] s1 = s.split("[.]",-2);
for(String x:s1){
System.out.println(x);
}
}
}