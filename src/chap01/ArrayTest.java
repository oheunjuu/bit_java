package chap01;

public class ArrayTest {

	public static void main(String[] args) {
		Student s1=new Student();
		
		Student[] students=new Student[3];
		
		for(Student s:students){
			System.out.println(s);
		}
		
		System.out.println("===========");
		//흔히 하는 실수
		//students[0].name="둘리";
		
		
		students[0]=new Student();
		students[0].name="둘리";
		
		for(Student s:students){
			if(s!=null){
				System.out.println(s.name);
			}
		}		
	}

}
