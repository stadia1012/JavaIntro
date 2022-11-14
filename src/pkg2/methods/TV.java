package pkg2.methods;

//	L26_Interface

public interface TV {
	public int MAX_VOLUME =  100;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void changedVolume( int volume );
	public void changedChannel( int channel );
	
}
