package chap01;
import java.util.*;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i=0;
		System.out.print("숫자를 입력하세요:");
		int num=scanner.nextInt();
		
		for(i=0;i<num;i++){
			System.out.println((i+1)+" : Hello World");
		}
		scanner.close();
	}

}
