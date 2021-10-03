class SpeakerRunner{
public static void main(String[] values)
{   int level=5;
	Speaker.volume(level);
	String spkr=speaker.volume(level);
	System.out.println(spkr);
	Speaker.turnOn();
	boolean test=Speaker.turnOn();
	System.out.println(type);
	Speaker.turnOff();
	boolean check=Speaker.turnOff();
	System.out.println(check);
}
}