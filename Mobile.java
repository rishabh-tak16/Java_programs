class Test01{
public static void main(String... aa){
double[] x= mylist[0];
int y=0;
for(int i=1;i<mylist.length;i++){
if(mylist[i]>x){
x=mylist[i];
y=i;
}
}
System.out.println(y);
}
}