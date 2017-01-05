package chap01;
import java.util.*;

public class WhileTest02 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int sum=0;
		//변수를 줄이자! value는 while안에서만 쓰도록 하면 좋은 함수
		while(true){
			System.out.print("숫자입력[0 to quit]: ");
			int value=scanner.nextInt();
			
			if(value==0){
				break;
			}
			
			sum=sum+value;
			
		}
		System.out.println("Sum: "+sum);
		scanner.close();
	}

}
