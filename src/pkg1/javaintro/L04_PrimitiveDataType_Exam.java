package pkg1.javaintro;

public class L04_PrimitiveDataType_Exam {
/*           < 기본형[원시형] 타입 >
	논리형_boolean : 1byte
	문자형_char : 2byte
	정수형 : byte(1), short(2), char(2), int(4), long(8)
	실수형 : float(4), double(8)
*/
	public static void main(String[] args) {
		boolean isFun = true;  // true/false 이외 값 입력 시 오류
		System.out.println(isFun);  // true
		
		char c = 'a';  // 'ff' 등 한자리 초과 입력 시 오류
		long bing = 199610121122l;  // Long형은 끝에 반드시 L/l 입력해야.
		float f = 3.15f;  // 반드시 끝에 F/f 입력
		double d = 31415926535.5;  // **d 안붙여도 됨
		short s = 12;  // 

//		long, float은 l, f를 붙여줘야 한다.
	}

}
