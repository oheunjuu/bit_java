package chap01;

public class ArrayTest3 {

	public static void main(String[] args) {
		//배열의 초기화 (리터럴 대입)
		
		int[] a= {10,20,30,40,50};
		int[] b= new int[]{10,20,30,40}; //비추
//		
//		int[] a=new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		
		//error
//		int[] c;
//		c={10,20,30,40}; 
		
		
	}

}
