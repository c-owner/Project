
public class DoWhile {
	
		public static void main(String[] args) {
			
		     int i = 0;
	         
		        do {
		             
		            System.out.println("Number" + i);
		             
		            i++;
		             
		        } while (i <= 10);

//		      일반 while문과 같아 보여도
//		     do while 은 조건이 맞지 않아도 무조건 1회는 실행한다.
//		   i < 0 일때 while문은 실행하지 않지만 do while은 실행을 강조
		        int j = 0;
		        do {
		        	System.out.println("NUMBER" + j);
		        	j++;
		        } while (j < 0);
		        
//		        일반 while 문은 실행을 하지 않는다. 
		        
		        int a = 0;
		        while (a < 0){
		        	System.out.println("NUMBER2" + a);
		        
		        a++;
		        }
		}
}
