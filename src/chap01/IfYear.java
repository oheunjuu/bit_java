package chap01;

public class IfYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2000;
		
		if(year % 4 == 0){ //4로 나누어지고
			if(year % 100 == 0){ // 100으로 나누어 지고
				if(year % 400 == 0){ //400으로 나누어지면
					System.out.println(year+"년은 윤년입니다.");
				}
				else{ //400으로 나누어 지지 않으면
				System.out.println(year+"년은 윤년이 아닙니다.");
				}
			}//100으로 나눠지지 않으면
			else{
				System.out.println(year+"년은 윤년입니다.");
			}
		}
		else{ //4로 나눠지지 않으면
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
	}

}
