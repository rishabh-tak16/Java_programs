/*
class SumVariableLengthArgs { 
static void fun(int...  a) 
{ 
System.out.println("Number of arguments: "+ a.length); 
int sum= 0; 
for (int i : a) 
sum=sum+i; 
System.out.println("sum = "+sum); 
} 
 
// Driver code 
public static void main(String... args) 
{ 
fun(100); 
fun(1, 2, 3, 4); 
fun(); 
} 
}
*/

enum Mobile{
Samsung(400),Nokia(250),Motorola(325);
int price;
Mobile(int p){
price = p;
}
int showPrice(){
return price;
}
}

public class EnumDemo1{
public static void main(String args[]){
System.out.println("CellPhone List :");
for(Mobile m: Mobile.values()){
System.out.println(m + " costs " + m.showPrice() + " dollars");
}

Mobile ret;
ret=Mobile.valueOf("Samsung");//cpnvert string into enum object
System.out.println("Selected : "+ret);
}
}



















