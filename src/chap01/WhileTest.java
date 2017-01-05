package chap01;

public class WhileTest {

	public static void main(String[] args) {
		//1 - 10까지 합 구하기
		int i=0;
		//int i=1; while(i<=10) / sum=sum+i;
		int sum=0;
		
		while(i<10){
			sum=sum+(i+1);
			i++;
			
		}
		System.out.println("sum = "+sum);
	}

}
