package chap01;

public class TypeCast02 {

	public static void main(String[] args) {
		byte b=25;
		short s=b;
		int i=s;
		long l=i;
		float f=i;
		double d=f;
		byte b1=(byte)256;
		
		System.out.println("b1 : "+b1);
	}

}
