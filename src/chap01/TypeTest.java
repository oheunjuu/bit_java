package chap01;

public class TypeTest {
	public static void main(String[] args){
		//암시적(implicity) casting
		int i1=9999;
		long l1=(long)i1;//값이 망가질 일이 없음 long 써도 되고 안써도 됨 굳이 캐스팅 안해줘도 됨 /오른쪽이 작은 경우	
		//작은값을 큰 값으로
		
		//명시적(explicity) casting
		long l2=12345678901234L;
		int i2=(int)l2; //값이 모자라서 잘리니깐 알려줘야 함 잘라서 쓸거니깐 알아둬라~ 알려줘야 함 캐스팅 해주기 /오른쪽이 큰 경우
		//큰 값을 작은 값으로

		System.out.println(i1+" -> "+l1);
		System.out.println(l2+" -> "+i2);
	}
}
