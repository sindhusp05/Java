class Bottle{
public static void storing(int price,String colour,int height,String quality, String[] brands)
{
	System.out.println("invoked brands");
	System.out.println("Price:"+price);
	System.out.println("Colour:"+colour);
    System.out.println("Height:"+height);
	System.out.println("Quality:"+quality);
	for(int brandIndex=0; brandIndex<brands.lenth;){
	   String brand=brands[brandIndex];
	   System.out.println(brand);
	   brandIndex++;
            }
}