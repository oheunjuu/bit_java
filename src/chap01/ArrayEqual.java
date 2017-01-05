package chap01;

public class ArrayEqual {

	public static void main(String[] args) { //static함수는 static함수만 부를 수 있다. 
		int[] a = {10,20,30};
		int[] b = {10,20,30};
		
		boolean result=equals(a,b);
		
		System.out.println(result);
		
	}
	public static boolean equals(int[] arr1, int[] arr2){ //여기서도 static 적어줬다. 
		if(arr1==null){
			return false;
		}
		
		if(arr2==null){
			return false;
		}
		
		if(arr1.length != arr2.length){
			return false;
		}
		
		//여기까지 왔다는 건 arr1.length == arr2.length가 같다는 말이기 때문에 arr1 or arr2선택 가능.
		for(int i=0;i<arr1.length;i++){ 
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		
		return true;
	}

}
