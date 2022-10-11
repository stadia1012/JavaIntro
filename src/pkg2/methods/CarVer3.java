package pkg2.methods;
/*	 < Car ver3 클래스 >
 * Ver3 : 생성자 오버로딩
*/
public class CarVer3 {
	public String name;
	public int number;
	
//	# 생성자 오버로딩
	public CarVer3 () {
//		this.name = "이름없음";
//		this.number = 0; 이것도 되지만.
		this( "이름없음", 0 );  // 다른 생성자를 이용하는 것도 가능
	}
	
	public CarVer3 ( String name ) {
		this( name, 0 );
	}
	
	public CarVer3 ( String name, int number) {
		this.name = name;
		this.number = number;
	}
}
