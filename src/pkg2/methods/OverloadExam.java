package pkg2.methods;

public class OverloadExam {
//		L20_MethodOverload 에서 사용되는 예시용 Method들
	
	public int plus( int x, int y ) {
		return x + y;
	}
	
	public int plus( int x, int y, int z ) {
		return x + y +z;
	}
	
	public String plus( String str1, String str2 ) {
		return str1 + str2;
	}
	
}
