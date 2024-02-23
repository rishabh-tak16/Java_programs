class test12 {
public static void main(String args[]){
String s = "KAMAL";

char b[] = new char [10];             

b[0] ='L';              b[1] ='A';

b[2] ='M';     b[3] ='A';

s.getChars(0, 4, b, 4);

System.out.println(b);


}
}