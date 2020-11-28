package p1;

import java.util.Scanner;

public class Business {
	
	DeliveryClass[] dc = {new Gangdong(),new Gangseo(), new Gangnam(), new Gangbook()};
	
	   Scanner sc = new Scanner(System.in);
	   void start() {
		   menuDisplay();//메뉴 보이게 하기
	   }
	   void menuDisplay() {
		   
		   boolean flag = true;
		   int choice=1;
		   while(flag) {
			   System.out.println("-----------------------");
			   System.out.println("1.입력/n2.출력/n3.종료  ");
			   System.out.println("-----------------------");
			   System.out.print("선택할 번호를 입력해주세요. ");
			   choice = sc.nextInt();
			   switch(choice) {
			      case 1:input();
			             break;
			      case 2:output();
			              break;
			      case 3: System.out.println("종료되었습니다.");flag = false; break;
			   }
		   }
	   }//end menuDisplay()
	   void input() {
		   System.out.println("배달지구를 입력해주세요./n Ex)강동 , 강서 , 강남, 강북");
		   String place=sc.next();
		   System.out.println("배달소요시간");
		   int time=sc.nextInt();
		   System.out.println("배달할 주문량");
		   int volume=sc.nextInt();
		   switch(place) {
		   
		   case "강동": dc[0].input(time,  volume); break;
		  
		   case "강서": dc[1].input(time,  volume); break;
		   
		   case "강남": dc[2].input(time,  volume); break;
		   
		   case "강북": dc[3].input(time,  volume); break;
		   default : break;
			         
		   }
	   }//end input()
	   void output() {
		   System.out.println("------------------------------------------------------");
		   System.out.println("배달지구|	배달담당|	배달소요시간|	배달량|	총배달요금|	");
		   System.out.println("------------------------------------------------------");
		   dc[0].output();
		   dc[1].output();
		   dc[2].output();
		   dc[3].output();
		   
	   }
	}


