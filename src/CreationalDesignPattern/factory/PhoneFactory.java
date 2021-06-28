package CreationalDesignPattern.factory;

public class PhoneFactory {

	public Phone getInstance(String str) {
		if( str.equalsIgnoreCase("android") )
			return new Android();
		else if( str.equalsIgnoreCase("ios") )
			return new Ios();
		else
			return new Windows();

	}

}