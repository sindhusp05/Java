class StateRunner{
public static void main (String[] state)
{
	System.out.println("state invoked");
	int size = state.length; 
	System.out.println(size);
	for(int index=0; index<state.length;index++)
	{
		String temp=state[index];
		System.out.println(temp);
		
	}
	
}
}