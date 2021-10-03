class Speaker{
public static void volume(int level);
{
	if(level<=0)
	{
		System.out.println("on it first");
	}	
    else if(level<=3)
	{
		System.out.println("okay");
	}
	else if (level>3)
	{
		System.out.println("loud");
	}
	else if(level>5)
	{
		System.out.println("too loud");
	}
	else if(level>9)

	{
		System.out.println("call police");
		return;
	}
}
	

public static boolean turnOn()
{
	System.out.println("invoked turnOn");
	return true;
}
 
public static boolean turnOff()
{

	System.out.println("invoked turnOff");
	return false;
}
}
	
	
	
	
	
	
	
	
	
