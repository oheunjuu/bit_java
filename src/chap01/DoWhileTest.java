package chap01;

import java.util.Scanner;

public class DoWhileTest {
	//파일 입출력할 때 자주 사용
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		
		int sum=0;
		int value=0;
		do{
			System.out.print("숫자 입력[0 to quit] : ");
			value=scanner.nextInt();
			sum=sum+value;
			
		}while(value != 0);
		System.out.println("Sum: "+sum);
		scanner.close();
	}

}