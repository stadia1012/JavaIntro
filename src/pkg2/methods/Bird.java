package pkg2.methods;

//	< 추상 클래스 Bird >

public abstract class Bird {
	public String name;
	public abstract void sing();  // 추상 메서드 : 추상 클래스는 미완성의 추상 메서드를 포함할 수 있다.
	
	public void fly() {
		System.out.println( this.name + "이(가) 납니다." );
	}
}
