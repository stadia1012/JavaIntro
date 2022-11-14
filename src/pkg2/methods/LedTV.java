package pkg2.methods;

//	L26_Interface

public class LedTV implements TV{
	public void turnOn() {
		System.out.println( "LedTV를 켭니다." );
	}
	
	public void turnOff() {
		System.out.println( "LedTV를 끕니다." );
	}
	
	public void changedVolume( int volume ) {
		System.out.println( "음량을 조절합니다." );
	}
	
	public void changedChannel( int channel ) {
		System.out.println( "채널을 변경합니다." );
	}
	
	public void ledLight() {
		System.out.println( "LED TV가 빛을 발합니다." );
	}
}