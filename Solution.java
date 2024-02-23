import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        if(10<=num && num<=99){
            int p1=num % 10;
            num=num/10;
            int p2=num % 10;
            System.out.println(p1+""+p2);
        }
        else{
            System.out.println("invalid input");
        }
    }
}