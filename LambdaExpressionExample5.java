import java.util.*;

@FunctionalInterface
interface StringSum
{
	public String sum(String a,String b);
}

@FunctionalInterface
interface IntSum
{
	public int sum(int a,int b);
}

@FunctionalInterface
interface IntMul
{
	public int sum(int a,int b);
}

public class LambdaExpressionExample5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 digits");
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println("Enter 2 Strings");
		in.nextLine();
		String p = in.nextLine();
		String q = in.nextLine();
		IntSum intsum = (a,b)->
		{
			return a+b;
		};
		StringSum strsum = (a,b)->
		{
			return a+" "+b;
		};
		IntMul intmul = (a,b)->
		{
			return a*b;
		};
		System.out.println(intsum.sum(x,y));
		System.out.println(strsum.sum(p,q));
		System.out.println(intmul.sum(x,y));
	}
}