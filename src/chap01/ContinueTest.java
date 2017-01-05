package chap01;

public class ContinueTest {

	public static void main(String[] args) {
		for(int i=0;i<=20;i++){
//			if(i % 2 != 0){
//				System.out.println(i);
//			}
			
			if(i % 2 == 0){
				continue; //다시 위로 올라감 (루프 다시 시작)
			}
			
			if(i % 3 == 0){
				continue;
			}
			
			System.out.println(i);
			
		}
	}

}
