import java.util.Date;//explicit class import 
import java.sql.*;//implicit class import
class DateExample{
public static void main(String [] rk){
Date d=new Date();
System.out.println(d.getClass().getName());
}
}

// explicit > current > util.......