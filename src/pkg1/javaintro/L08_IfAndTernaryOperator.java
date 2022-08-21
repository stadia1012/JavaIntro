package pkg1.javaintro;

public class L08_IfAndTernaryOperator {
//              < if문과 삼항연산자 >
	public static void main(String[] args) {
		int x = 50;
		int y = 60;  // 내용 변경으로 인한 commit 방지 default : 60으로 하기
		
		if ( x > y ) {
			System.out.println("x는 y보다 크다.");
		} else if( x < y ) {
			System.out.println("x는 y보다 작다.");
		} else {
			System.out.println("해당 없음");
		}
		
//		# 실습1 : if문, 3의 배수이면 출력하기
		int i1 = 12;  // default : 12
		
		if ( i1 % 3 == 0 ) {
			System.out.printf("%d는 3의 배수가 맞습니다.\n", i1);
		} else {
			System.out.printf("%d는 3의 배수가 아닙니다.\n", i1);
		}
		
//		# 3항연산자
//		if문으로 대체 가능해 일반적으로 미사용
		int i2 = (5 < 4) ? 50 : 40;
		System.out.println(i2);  // 40
//		괄호가 true이면 50, false면 40
		
//		# 실습2 : 3항연산자
//		hour가 12보다 작으면 AM, 그렇지 않으면 PM를 ampm에 저장
		int hour = 14;
		String ampm = (hour < 12) ? "AM" : "PM";
		System.out.println(ampm);  // PM
	}
}
