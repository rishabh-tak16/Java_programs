class MyException extends Exception
{
   MyException()
     {
	super("Exception Occured");
     }
   public String toString()
     {
	return "Problem";
     }
}

class Output10
{
   public static void main(String args[])
     {
	try {
		throw new MyException();
	    }
        catch(MyException e)
	    {
		System.out.print(e);
	    }
     }
}