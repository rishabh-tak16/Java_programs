/*
class day29{
public static void main(String [] args){
int a=10;
System.out.println("old a="+a);
a=20;
System.out.println("new a="+a);
}
}
*/

/*
final class Parent{
void f1(){System.out.println("f1");}
}
class child extends Parent{
void f1(){System.out.println("child f1");}
public static void main(String [] args){
child c1=new child();
c1.f1();
}
}

*/

//final variable is uesd to give constant value
//cannot inherit final class
//cannot override final method

/*
class Basic1{
final int a;
//public Basic1(){a=10;}
{a=20;}
public static void main(String[] args){
final int s;
Basic1 b1=new Basic1();
System.out.println("a="+b1.a);
}
}
*/


class Demo_array{..
public static void main(String args[]){
int marks[];
marks=new int[3];
marks[0]=10;
marks[1]=35;
marks[2]=84;
double aa[][]=new double[4][5];
System.out.println("Marks of 2nd Student ="+marks[1]);
System.out.println("Marks - "+marks);
System.out.println(marks.getClass().getName());
System.out.println(aa.getClass().getName());
}
}
























































