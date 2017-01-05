package chap01;

public class SumToInput2 {

	public static void main(String[] args) {
		
		
		if(args.length == 0){
			System.out.println("usage : java SumtoInput2 [number]");
			return;
		}
		
		
		System.out.println(args[0]);
		
		//String -> Integer
		int number=Integer.parseInt(args[0]); //스트링을 인티져로 바꿀 때 parseInt사용 
		
		//Integer ->String
		
		int n=10;
//		String s=""+n; //+는 스트링에서 사용 -->n이 스트링으로 바뀜
		
		String s1=String.valueOf(n);
		
		
		
		int sum=0;
		
		for(int i=0;i<=number;i++){
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		
	}

}
