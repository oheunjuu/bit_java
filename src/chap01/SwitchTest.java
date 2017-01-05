package chap01;

public class SwitchTest {
	
	//가독성을 높이자!!
	//case가 끝나면 꼭 break를 달아주자!
	//case는 equal관계일때만 사용가능!
	
	public static void main(String[] args) {
		int month = 10;
		int days=0;
	
		//if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
		//	days=31;
		//}else if(month==2){
		//	days=28;
		//}else{
		//	days=30;
		//}
		
		//switch
		//equal관계에서만 사용이 가능하다.
		switch( month ){
		case 1:{
			days=31;
			break;
		}
		case 2:{	
			days=28;
			break;
		}
		case 3:{	
			days=31;
			break;
		}
		case 4:{	
			days=30;
			break;
		}
		case 5:{	
			days=31;
			break;
		}
		case 6:{	
			days=30;
			break;
		}
		case 7:{	
			days=31;
			break;
		}
		case 8:{	
			days=31;
			break;
		}
		case 9:{	
			days=30;
			break;
		}
		case 10:{	
			days=31;
			break;
		}
		case 11:{	
			days=30;
			break;
		}
		case 12:{	
			days=31;
			break;
		}
		default :{
			System.out.println("해당 월이 없습니다.");
			break;
		}
		}
		
		System.out.println(month+"월은 "+days+"일까지 있습니다.");
	}
}

//브레이크를 안쓸때도 있다 (일부러)
//케이스 결과가 같은 애들끼리 모아준다 
//1,3,5,7,8,10,12월 한번에 쓰고 나머지 내용 밑에 쓰기 
//case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//{ days=31;
//break;
//}
//구문을 줄일 수 있다.