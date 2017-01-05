package chap01;
import java.util.*;

public class NHelloWorld01 {

	public static void main(String[] args) {
		
		//ln은 line의 약자
		
//		System.out.println("Hello World");
//		System.out.print("Hello World");
//		System.out.println("Hello World");
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
//		System.out.println("word: ");
//		String str1=scanner.nextLine();
		
		int count=scanner.nextInt();
		int i=0;
		
		while(i<count){
			System.out.println((i+1) + ": Hello World");
			i++;
		}
//		System.out.println(str1);
		scanner.close();
		
	}

}
