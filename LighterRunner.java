class LighterRunner
{
public static void main(String[] values)
{
 boolean test=true;
 Lighter.fireOn(test);
 
 boolean check=false;
 Lighter.fireOff(check);
 
 int width=2;
 boolean type= Lighter.light(width);
 System.out.println();
 
}
}