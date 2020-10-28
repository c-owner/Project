//입력하는 수가 소수인지 아닌지 판별
// , 소수, 완전수, 약수, 파보니치(수열) 

// 소수는 1과 자기 자신으로만 나누어질 때만 가능한 수
// ex) 6 = 2x3, 3x2, 6x1가 가능하지만 5 = 5x1 처럼 1과 자기자신만 가능함

// 완전수 = 약수의 합이 되는 수. 
// ex) 10의 약수는 1+2+5=8  => 10이 아니므로 불완전수.
// ex) 6, 28, 496, 8128 는 완전수 

// 파보니치 피보나치 수열이란 n번째 숫자와 n1번째 숫자를 더한 값이 n2번째 숫자로 나타내는 수열이며
// 기본 생성 규칙은 처음 두항의 숫자는 1. 그래서 세번째항은 기본적으로 1+1의 값인 2가 됨.
// 이러한 루트로 0 1 1 2 3 5 8 13 21 . . . 앞 두 항을 더한 수가 다음 차례로 이어짐.

public class Number {

	public static void main(String[] args) {
		// for문 (반복문)을 이용해 1~100 범위 소수 구하기
		  int count=0;
		  System.out.println("1~100 범위내 소수 구하기 ");
          for(int i=2; i<=100; i++) // 1은 소수가 아니므로 2부터 시작
          {
              for(int j=2; j<=i; j++)
              {
                   if(i%j ==0) // 자기자신과 나눠지면 소수로 판별해 카운트
                   {
                        count ++;
                   }    
              }
              
              // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
              if(count==1)
              {
                   System.out.print(i+" ");
              }
              count=0;
          }
	System.out.println("\n1~1000까지의 완전수 구하기");
          int a;
          int sum=0;
          for(int i=1; i<=1000; i++) { 
              a = i;
              for(int j=1; j<=i; j++) {
                  //약수를 구하기 위한 조건식
                  if(a%j==0) {
                      //약수를 sum에 모두 더하기
                      sum = sum + j;
                  }
              }
              //약수를 더할때 자기 자신도 더해지기 때문에 자기 자신을 빼준다
              if((sum-i)==i) {
                  System.out.println(i + "\t");
              }
              sum=0;
          }
          
          System.out.println("\n -----파보니치 수열-----");
          int a1 = 1;
          int a2 = 1;
          int a3;
          
          System.out.println(a1);
          System.out.println(a2);
          
          for(int i=1; i<=10; i++){ // 10번째 항까지 구하기.
              a3=a1+a2;
              System.out.println(a3);
              a1=a2;
              a2=a3;
          }      

	} // public
} // public
