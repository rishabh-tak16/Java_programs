import java.lang.*;
import java.util.*;

public class Marks1{

public double[] average_marks(double[][] marks){
double[] best=new double[N];
for(int i=0;i<N;i++){
if(marks[i][0]<marks[i][1]<marks[i][2]){
int avg=(marks[i][1]+marks[i][2])/2;
best[i]=avg;
else if(marks[i][0]>marks[i][1]>marks[i][2]){
int avg=(marks[i][0]+marks[i][1])/2;
best[i]=avg;
}
else if(marks[i][0]>marks[i][1]<marks[i][2]){
int avg=(marks[i][0]+marks[i][2])/2;
best[i]=avg;
}
}
return best;
};

public static void main(String[] args){
Scanner s=new Scanner(System.in);
int N=s.nextInt();
double best1[]=new double[N];
double[][] marks1=new double[N][3];
for(int i=0;i<N;i++){
for(int j=0;j<3;j++){
marks1[i][j]=s.nextDouble();
}
}
}

best1=average_marks(marks1);
for(int i=0;i<N;i++){
System.out.print(best1[i]+" ");
}

}