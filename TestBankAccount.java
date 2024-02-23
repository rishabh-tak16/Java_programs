import java.util.Scanner;
class BankAccount{
int balance=0;
int deposit(int amt){
balance+=amt;
return balance;
}
int withdraw(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the amount to withdraw :");
int N=s.nextInt();
return (balance-N);
}
}
class TestBankAccount{
static void main(String [] rk){
BankAccount a=new BankAccount();
int a1=a.deposit(12);
int a2=a.withdraw();
System.out.println(a1);
System.out.println(a2);
}
} 