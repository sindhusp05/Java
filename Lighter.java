class Lighter
{
public static void fireOn(boolean testArg)
{
System.out.println("invoked fireOn");
boolean test=testArg;
if(test)
	
	{
		System.out.println("fire on top");
	}
	System.out.println("fire in bottom");
	
}

public static void fireOff(boolean checkArg)
{
	System.out.println("invoked fireOff");
	boolean check=checkArg;
	if(check)
	{
		System.out.println("fire tunerd off");
	}
     System.out.println("no fire");
}

public static boolean light(int width)
{
	if(width>0)
	{
	System.out.println("lighter is good");
    return true;
	}
System.out.println("lighter is not good");
return false;
}
}