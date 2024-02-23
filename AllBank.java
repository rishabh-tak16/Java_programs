abstract class Bank{
void rules(){ System.out.println("Rules are same."); }
abstract void ROI();
}

class SBI extends Bank{
void ROI(){ System.out.println("its SBI's intrest"); }
}


abstract class ICICI extends Bank{
}

abstract class ICICI1 extends ICICI{
}

class ICICI2 extends ICICI1{
void ROI(){System.out.println("this grand grand child...");}
}

class AllBank{
public static void main(String args[]){

Bank b1=new ICICI2();
b1.ROI();

}
}