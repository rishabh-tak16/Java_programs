class Student{
int id;//field or data member or instance variable
String name;
public static void main(String args[]){
Student s1;//creating the reference variable
s1=new Student();//creating reference to object of Student
System.out.println(s1.id);//accessing member through variable
System.out.println(s1.name);
}
}