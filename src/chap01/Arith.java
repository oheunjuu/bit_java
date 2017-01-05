package chap01;

public class Arith {

   public static void main(String[] args) {
      int a = 7;
      int b = 3;
      
      System.out.println( a + b );
      System.out.println( a - b );
      System.out.println( a * b );
      System.out.println( a / b );

   
      a = a + 1;
      System.out.println(a);
       
      a += 1;
      System.out.println(a);
      
      a++;
      System.out.println(a);
      
      a--;
      System.out.println(a);
      
      --a;
      System.out.println(a);
      
      System.out.println(a--); //후위연산자, 현재의 a 값은 8그대로
      System.out.println(a); //현재의 a값은 -1이되어 7이다
      
      //*나눗셈
      System.out.println(10/3); //결과값이 int형으로 나옴
      System.out.println(10); //결과값이 소수점까지 표현됨 
      
      //*int형과 double형의 사칙연산 결과는 double형이다(double두개도 double이다)
      System.out.println(10./3.);
      System.out.println(10./3);
      
      //*주의
      System.out.println((double)10/3);
      System.out.println((double)(10/3));
      
      //*나머지
      System.out.println(44%3);
      System.out.println(-7%3);
      System.out.println(7%-3);
      System.out.println(-7%-3);
      
      
      
      
   }
   
   
   
   
   
   

}