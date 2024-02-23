import java.util.Scanner;
class day31{
public static void main(String args[]){
System.out.println("Enter the rows: ");
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int arr[][]=new int[r][];
System.out.println("Enter the columns for "+r+" rows: ");
for(int i=0;i<r;i++){
int x=s.nextInt();
arr[0]=new int[x];
}
System.out.println("Array length :"+arr.length);
}
}