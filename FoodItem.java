class FoodItems
{
	public static String listItems(String[] fooditems)
	{
		System.out.println("invoked listItems");
		
	int size=fooditems.length;
	for(int foodIndex=0; foodIndex<size; foodIndex++)
	{
		System.out.println(foodItems[foodIndex]);
	}
	System.out.println("........");
	return foodItems[0];
}
}
	
