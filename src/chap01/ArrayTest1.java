package chap01;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] a= new int[4];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		int sum=0;
		int length=a.length;
		for(int i=0;i<4;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		
		//확장 for문(for-each)
		for(int value:a){
			System.out.println(value);
		}
	}

}
