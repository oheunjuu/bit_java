package chap01;

public class NumberTriangle {

	public static void main(String[] args) {
		if(args.length ==0){
			return;
		}
		
		int number = Integer.parseInt(args[0]);
		
		System.out.println(number);
		System.out.println();
		//run as -> run configurations ->Arguments ->number 입력 ->apply
		
		for(int i=0; i<=number ; i++){
			for(int j=0; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
