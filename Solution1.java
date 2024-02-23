import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        double[][] arr=new double[N][];
        for(int i=0;i<N;i++){
            int ca=s.nextInt();
            for(int j=0;j<ca;j++){
                double marks=s.nextDouble();
                arr[i][j]=marks;
            }
        }
        double sum=0;
        int sub=s.nextInt();
        for(int i=0;i<arr[sub-1].length;i++){
            sum+=arr[sub-1][i];
        }
        double avg=sum/sub;
        System.out.println("Average in Subject-"+sub+" is "+avg);
        
    }
}