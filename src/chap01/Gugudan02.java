package chap01;

public class Gugudan02 {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		for(i=1;i<=9;i++){
			for(j=1;j<=9;j++){
				System.out.print(j+" * "+i+" = "+(i*j));
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
