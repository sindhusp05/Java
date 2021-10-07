class TestRunner
{
public static void main(String[] values)
{
System.out.println(" Main invoked ");
Fish fish=new Fish();
System.out.println(fish.name);
System.out.println(fish.color);
System.out.println(fish.length);
System.out.println(fish.weight);
System.out.println(fish.shape);

fish.name="angel";
fish.color="grey";
fish.length=6.0f;
fish.weight=2.0f;
fish.shape="cylindrical";
System.out.println(fish.name);
System.out.println(fish.color);
System.out.println(fish.length);
System.out.println(fish.weight);
System.out.println(fish.shape);

System.out.println("....................");

Train train=new Train();
System.out.println(train.color);
System.out.println(train.num);
System.out.println(train.name);
System.out.println(train.length);
System.out.println(train.speed);

train.color="blue";
train.num=12430;
train.name="shatabdi";
train.speed=80;
System.out.println(train.color);
System.out.println(train.num);
System.out.println(train.name);
System.out.println(train.length);
System.out.println(train.speed);

System.out.println("........");



 Charger charger=new Charger();
 System.out.println(charger.brand);
 System.out.println(charger.color);
 System.out.println(charger.capacity);
   System.out.println(charger.price);
    System.out.println(charger.type);

	charger.brand="onePlus";
	charger.color="white";
	charger.capacity=2000;
	charger.price=600;
	charger.type="C";
	
	System.out.println(charger.brand);
 System.out.println(charger.color);
 System.out.println(charger.capacity);
   System.out.println(charger.price);
    System.out.println(charger.type);
	
}
}


