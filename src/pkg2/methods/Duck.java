package pkg2.methods;

public class Duck extends Bird {
	@Override
	public void sing() {		// 상속받은 추상클래스의 추상메서드( sing() )는 반드시 구현해야한다.
		System.out.println( "꽥꽥" );
	}
	
	public Duck( String name ) {
		this.name = name;
	}
}