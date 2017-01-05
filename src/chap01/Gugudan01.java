package chap01;

public class Gugudan01 {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=9){
//			System.out.println("================");
//			int j=1; //1단 ,2단 ,,,
//			while(j<=9){
//				System.out.println(i+" * "+j+" = "+(i*j));
//				j++;
//			}
//			i++;
//			
//		}
		int i=1;
		while(i<=9){
			int j=1;
			while(j<=9){
				System.out.print(j+"*"+i+"="+(i*j));
				System.out.print("\t");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}
}

