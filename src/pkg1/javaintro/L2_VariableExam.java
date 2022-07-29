package pkg1.javaintro;

public class L2_VariableExam {
//				< 변수 >
	public static void main(String[] args) {
		int count;
		count = 10;
		count = 20;
		
		System.out.println(count);  // 20
		
		// count = 12.3;  -> int에 실수를 담아 Error 발생
		// JS와 다르게 정해진 형에 맞는 값을 넣어야 한다
		
		double avg = 12.3;
		String name = "stadia";
		
		System.out.println( count + "살의 " + name );  // 20살의 stadia
	}

}
