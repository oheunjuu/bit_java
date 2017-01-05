package chap01;

public class Swap {

	public static void main(String[] args) {
		
		//n1이 항상 큰 값이 되도록
		
		int n1=10;
		int n2=30;
		int temp;
		
		if(n1>n2){
			System.out.println("n1 : "+n1);
			System.out.println("n2 : "+n2);
		}
		else if (n1<n2){
			temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("n1 : "+n1);
			System.out.println("n2 : "+n2);
		}
		
		System.out.println();
		
		//최대값을 판별하는 조건을 완성하라
		
		int a1=10;
		int a2=70;
		int a3=50;
		int max_num;
		
		
		if(a1>=a2 && a1>a3){
			max_num=a1;
			System.out.println("최대값은 "+max_num+"입니다.");
		} else if (a2>=a1 && a2>=a3){
			max_num=a2;
			System.out.println("최대값은 "+max_num+"입니다.");
		} else{
			max_num=a3;
			System.out.println("최대값은 "+max_num+"입니다.");
		}
		
		
		if(a1>=a2){
			if(a1>=a3){
				max_num=a1;
				System.out.println("최대값은 "+max_num+"입니다.");
			}
			else{
				max_num=a3;
				System.out.println("최대값은 "+max_num+"입니다.");
			}
		}
		else if(a2>=a3){
			max_num=a2;
			System.out.println("최대값은 "+max_num+"입니다.");
		}else{
			max_num=a3;
			System.out.println("최대값은 "+max_num+"입니다.");
		}
		
		
		
//		if(a1>=a2){
//			if(a1>=a3){
//				max_num=a1;
//				System.out.println("최대값은 "+max_num+"입니다.");
//			}else{
//				max_num=a3;
//				System.out.println("최대값은 "+max_num+"입니다.");
//			}
//		}
		
	}		
}
