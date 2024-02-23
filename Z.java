abstract class A{
abstract int add(int a,int b);
int a=10;
}

interface X{
void test();
default void demo();
static void show();
};

interface Y{
void test();
default void demo();
int a=30;
};

class Z extends A implements X,Y{
public static void main(String args[]){

int add(int a,int b){
return a+b;
}

public void test(){
System.out.println("test method");
}

public void demo(){
System.out.println("demo method");
};

//System.out.println(A.a);
//System.out.println(Y.a);

}
} 