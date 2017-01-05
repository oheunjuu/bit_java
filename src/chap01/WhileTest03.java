package chap01;
import java.util.*;

public class WhileTest03 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		
		int sum=0;
		int value=-1; //첫번째 루프 진입을 위해 -1 초기화
		
		while(value !=0){ //입력값이 0이 아니면
			System.out.print("숫자입력[0 to quit]: ");
			value=scanner.nextInt();
			
			sum=sum+value;
			
		}
		System.out.println("Sum: "+sum);
		scanner.close();
	}

}
