class ProductStarter{

public static void main(String[] args)
{

Product product=new Product();
product.displayDetails();
product.name="Mobile";
product.price=11.0;
product.quality=true;
product.quantity=4;
product.isiMark=true;
product.displayDetails();

Product product1=new Product();
product1.displayDetails();
product1.name="TV";
product1.price=35.0;
product1.quality=true;
product1.quantity=4;
product1.isiMark=true;
product1.displayDetails();

Product product2=new Product();
product2.displayDetails();
product2.name="Ironbox";
product2.price=20.0;
product2.quality=true;
product2.quantity=2;
product2.isiMark=true;
product2.displayDetails();

Product product3=new Product();
product3.displayDetails();
product3.name="Bottle";
product3.price=10.0;
product3.quality=true;
product3.quantity=6;
product3.isiMark=true;
product3.displayDetails();

Product product4=new Product();
product4.displayDetails();
product4.name="Fridge";
product4.price=40.0;
product4.quality=true;
product4.quantity=1;
product4.isiMark=true;
product4.displayDetails();

product.displayTotalPrice();
product1.displayTotalPrice();
product2.displayTotalPrice();
product3.displayTotalPrice();
product4.displayTotalPrice();

}
}