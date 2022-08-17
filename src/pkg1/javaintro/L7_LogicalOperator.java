package pkg1.javaintro;

public class L7_LogicalOperator {
//		< 논리연산자 및 연산자 우선순위 >
/*
 	**연산자 우선순위 순서**
 	최우선연산자  .  []  () 
	단항연산자 (++  --  !  ~  +/-)  -> 부정, bit변환 > 부호 > 증감
	산술연산자 ( *, /, %, +, -, shift)  -> 시프트연산자 ( >>, <<, >>>)
	비교연산자 ( >, <, >=, <=, ==, != )
	비트연산자 ( &, |, ~ )
	논리연산자 (&& , || , !)
	삼항연산자 (조건식) ? :
	대입연산자 =, *=, /=, %=, +=, -=
 */
	public static void main(String[] args) {
		int i1 = 2;
		int i2 = 3;
		int i3 = 5;
		
		System.out.println( i1 + i2 * i3 );  // 17  -> 괄호 및 사칙연산의 우선순위가 적용
		System.out.println( i1 > i2 || i1 < i3 );  // true
		System.out.println( i1 > i2 && i1 < i3 );  // false
//		->> 논리연산자 우선순위가 더 낮음
		
		
		System.out.println( "\n배타적 논리합(XOR)" );
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println( b1^b2 );  // true    -> 두 값이 다른 경우만 true 
		System.out.println( b1^b3 );  // false   -> 둘 다 true 이면 false
		
		System.out.println("\n부정연산자 !");
		System.out.println(!b1);  // false
		
//		실습
//		int형 변수 age가 19 이하거나 60 이상이라면 isDiscount에 true를, 아니라면 isDiscount에 false를 저장
		int age = 0;
	}

}
