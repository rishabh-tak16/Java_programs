class Gen1<T,V>  
{   
T ob1;   
V ob2;   
Gen1(T o,V p)   {   
ob1 =o;   ob2 =p;   
//System.out.println();   
}   
T getOb1()   {   
return ob1;   
}   
V getOb2()   {   
return ob2;   
}    
// void add(T o,V p)  
// {  
// System.out.println(o+p);  
// }     
public static void main(String[] args) {   
Gen1 <Integer,Integer>t = new Gen1<>(5,7);   
System.out.println(t.getOb1()+ t.getOb2());   
Gen1 <String,String>t1 = new Gen1<>("hello"," world");   
System.out.println(t1.getOb1()+ t1.getOb2());   
Gen1 <Integer,Double>t2 = new Gen1<>(7,8.9);   
System.out.println(t2.getOb1()+ t2.getOb2());     
}    
}