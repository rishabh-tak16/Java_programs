import java.util.Scanner;
class marks{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int sum=0;
System.out.println("Enter the number of subjects : ");
int n=s.nextInt();
int[] sub=new int[n];
System.out.println("Enter marks now....");
for(int i=0;i<n;i++){
int x=s.nextInt();
sub[i]=x;
sum+=x;
}
double per=(sum*100)/((n-1)*100);
System.out.println("Percentage : "+per);
}
}