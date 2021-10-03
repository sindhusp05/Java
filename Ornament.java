class Ornament
{
	public static String  dressing(String[] types)
	{
		System.out.println("invoked dressing");
		
	int size=types.length;
	for(int typesIndex=0; typesIndex<size; typesIndex++)
	{
		System.out.println(types[typesIndex]);
	}
	System.out.println("........");
	return types[size-1];
}
}
	
