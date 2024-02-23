import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Sol
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String bin = in.nextLine();
		int dec = Integer.parseInt(bin,2);
		if(dec<91 && dec>64)
		{
			char C = (char)dec;
			System.out.println(C);
		}
		else
		{
			System.out.println("INVALID PAPER CODE");
		}
	}
}