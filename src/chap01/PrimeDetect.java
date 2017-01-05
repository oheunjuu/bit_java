package chap01;
import java.util.*;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("판단할 숫자: ");
		int num = scanner.nextInt();
		
		int divi=2;
		boolean isPrime=true;
		
		while(divi<num){
			
			if(num % divi == 0 ){
				isPrime=true;
				break;
			}
			else{
				isPrime=false;
				divi++;
			}
		}
		
		if(isPrime==true){
			System.out.println(num+"는 소수입니다.");
		}else{
			System.out.println(num+"는 소수가 아닙니다.");
		}
		
		scanner.close();
	}

}
