package pkg1.javaintro;
import java.util.Calendar;

public class L09_Switch {
//			< switch 문 >
	public static void main(String[] args) {
//		# switch문에 문자열도 가능
		String str1 = "A1";
		
		switch(str1) {
		case "C1" :
			System.out.println("C1");
			break;
		case "B1" :
			System.out.println("B1");
			break;
		case "A1" :
			System.out.println("A1");
			break;
		case "Z1" :
			System.out.println("Z1");
			break;
		default :
			System.out.println("Error1");
		}  // A1
		
		
//		#실습1 : month엔 현재 달이 저장됨. 어떤 계절인지 출력하게 만들기
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		String season = "";
		
		switch(month) {
		case 12 : case 1 : case 2 :
			season = "Winter";
			break;
		case 3 : case 4 : case 5 :
			season = "Spring";
			break;
		case 6 : case 7 : case 8 :
			season = "Summer";
			break;
		case 9 : case 10 : case 11 :
			season = "Fall";
			break;
		}
		System.out.printf("\n지금은 %d월이고, %s입니다.", month, season);
//		지금은 8월이고, SUMMER입니다.
	}

}
