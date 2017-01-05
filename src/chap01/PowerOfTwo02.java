package chap01;
import java.util.*;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int result=1;
		System.out.print("승수: ");
		int i=0;
		int power=scanner.nextInt();
		for(i=1;i<=power;i++){
			result=result*2;
		}
		System.out.println("2의 "+power+"제곱은 "+result+"입니다." );
		scanner.close();
	}

}
