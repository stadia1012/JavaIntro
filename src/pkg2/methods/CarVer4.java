package pkg2.methods;
/*	 < Car ver4 클래스 >
 * Ver4 : 생성자 출력 메시지 추
*/
public class CarVer4 {
	public String name;
	public int number;
	
	public void run() {
		System.out.println( "달립니다.");
	}
	
	
//	# 생성자 오버로딩
	public CarVer4 () {
//		this.name = "이름없음";
//		this.number = 0; 이것도 되지만.
		this( "이름없음", 0 );  // 다른 생성자를 이용하는 것도 가능
	}
	
	public CarVer4 ( String name ) {
		this( name, 0 );
	}
	
	public CarVer4 ( String name, int number) {
		this.name = name;
		this.number = number;
		System.out.println( "이름 : " + this.name + ", 번호 : " + this.number );
	}
}
