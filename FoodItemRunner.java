class FoodItemRunner
{
public static void main (String[] values)
{
String[] items={"cake", "donuts","pizza", "choclate","milkshake"};
String address=FoodItems.listItems(items);

System.out.println(address);
}
}