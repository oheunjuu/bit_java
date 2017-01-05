package chap01;
import java.util.*;

public class SumToTotal {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num=scanner.nextInt();
		
		for(i=1;i<=num;i++){
			sum=sum+i;
		}
		System.out.println("0부터 "+num+"까지의 합: "+sum);
		
		scanner.close();
	}

}
