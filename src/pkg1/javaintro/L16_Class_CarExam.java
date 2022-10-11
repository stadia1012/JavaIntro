package pkg1.javaintro;
import pkg2.methods.*;

public class L16_Class_CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.name = "경찰차";
		car2.name = "구급차";
		
		car1.number = 1234;
		car2.number = 5678;
		
		System.out.printf( "%S의 번호는 %d\n", car1.name, car1.number );  // 경찰차의 번호는 1234
		System.out.printf( "%S의 번호는 %d\n", car2.name, car2.number );  // 구급차의 번호는 5678
	}
}
