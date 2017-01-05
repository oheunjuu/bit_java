package chap01;

public class Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술 연산자 ,관계 연산자, 논리 연산자
		int a = 10;
		int b = 3;

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println();

		// 논리 연산자 양쪽 비교 대상이 boolean type (true or false)
		System.out.println((a < b) && (a > b)); // 앞 비교 연산자가 false이면 뒷 연산자 확인할
												// 필요 없음 즉 뒷 코드를 읽을 필요 X(dead
												// code)
		System.out.println(a > b || a < b);
		System.out.println(!(a > b));

		System.out.println();

		boolean x = 7 == 9;
		// boolean x = (7==9); 괄호를 많이 사용하자. 보기 쉽다!!
		System.out.println(x);

	}

}
