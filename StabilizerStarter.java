class StabilizerStarter
{
public static void main(String[] values)
{
Stabilizer stabilizer =new Stabilizer(4.2f);
System.out.println(stabilizer);
System.out.println(stabilizer.current);

Stabilizer stabilizer1 =new Stabilizer(11.1f,"vguard",2);
System.out.println(stabilizer1);
System.out.println(stabilizer1.voltage);
System.out.println(stabilizer1.tv);
System.out.println(stabilizer1.ledIndicator);

Stabilizer stabilizer2 =new Stabilizer(12.1f,"xyz",40,"blue");
System.out.println(stabilizer2);
System.out.println(stabilizer2.power);
System.out.println(stabilizer2.brand);
System.out.println(stabilizer2.capacity);
System.out.println(stabilizer2.color);

Stabilizer stabilizer3 =new Stabilizer(2,4.2f,3.5f,10.0f);
System.out.println(stabilizer3);
System.out.println(stabilizer3.light);
System.out.println(stabilizer3.length);
System.out.println(stabilizer3.width);
System.out.println(stabilizer3.weight);

Stabilizer stabilizer4 =new Stabilizer("dynamic",3,21.0f);
System.out.println(stabilizer4);
System.out.println(stabilizer4.type);
System.out.println(stabilizer4.warranty);
System.out.println(stabilizer4.temperature);





}
}