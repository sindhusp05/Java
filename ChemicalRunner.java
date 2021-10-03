class ChemicalRunner{
public static void main (String[] chemical)
{
	System.out.println("chemical invoked");
	int size = chemical.length; 
	System.out.println(size);
	for(int index=0; index<chemical.length;index++)
	{
		String temp=chemical[index];
		System.out.println(temp);
		
	}
	
}
}