public class demo6
{
private demo6(int x);
{
System.out.print(x);
}
public static demo6()
{
System.out.print(100);
}
public static void main(String stt[])
{
demo6 d=new demo6(7);
}
}