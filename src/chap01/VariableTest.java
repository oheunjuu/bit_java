package chap01;

public class VariableTest {
	int number;
	
	public void test(){
		int j=number+10; //인스턴스 변수는 초기화가 된다.
	}
	public static void main(String[] args) {
		int i;
		//int i=20; //에러 변수는 식별자이다.
		//int j=i; //에러 지역변수는 반드시 초기화 되어야 한다.
		
		boolean isHoliday=false; // true or false
		
		char c= 'A'; //작은 따옴표 //문자 리터럴 (문자 그대로)
		char c1=65; //아스키 코드 값을 넣은것임
		
		byte b=10;
		short s=20;
		int k=10;
		long l=10000000;
		float f=3.14f; //에러나는 이유 -->더블로 인식하기 때문에, float로 읽으라고 표시해주면 됨 뒤에 f쓰기
		double d=3.14;
		
		int j=10;
		
		System.out.println(isHoliday);
		System.out.println(c);
		System.out.println("c : "+c1);
		System.out.println(b);
		System.out.println(s);
		System.out.println(k);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(j);
		
		
		//상수 
		final int max_speed=20; //final이 변수를 상수로 만든다.
		//max_speed=200; 뒤에서 수정 불가능 파이널이 붙은 변수는 후에 값 대입이 불가능하다.
		
		//그래서 상수는 관례적으로 대문자로 쓴다.
		final int MIN_SPEED=30;
		//final은 클래스 앞에도 붙일 수 있음
		
		//String 객체 확인
		String str= new String("hello");//배열이 생긴다
		System.out.println(str);
		
		// String 객체를 리터럴로 사용하기
		String str1="hello";
		System.out.println(str1);
		//자바에서 편의를 제공해 준다 그냥 바꿔서 쓰게 해줌 하지만 원래 형식은 위 방법
		
		
	}

}
