package pkg3.etcstudy;
import java.util.Properties;
import java.io.FileNotFoundException;  // 예외 처리
import java.io.IOException;  // 예외 처리
import java.io.FileInputStream;

public class PropertiesExam {

	public static void main(String[] args) throws IOException {
		
		String resource = "src/pkg3/etcstudy/properties_exam.properties";
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream( resource );
        properties.load(new java.io.BufferedInputStream(fis));
		
		String str1 = properties.getProperty( "message" );
		System.out.println( str1 );  // Hi
		
		System.out.println( properties.getProperty( "message2" ) );  // Hi2
	}
}