import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Memo {
	 // 기록 클래스 운동을 상속받아 운동 리스트를 호출할 예정
		Scanner sc = new Scanner(System.in);
		int day,time; // 날짜와 운동한 시간이 필요  

		 public Memo() {
			 super();
		}
	public void memo1() {  // mac 버전 
			
			String txt;     // 기록용 변수 선언
			   System.out.print("기록하실 내용을 입력하세요 : ");
				 txt = sc.nextLine(); // 기록을 하기 위한 입력값
			    String fileName = "/Users/iyu/Desktop/GitHub Project/Project//DiaryMemo.txt";
			        try{
			            // BufferedWriter / FileWriter를 조합 사용 (속도 향상)
			            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
			            fw.write(txt);
			            fw.write("\r"); // 줄바꿈 !! 중요!★
			            fw.flush(); // stream에 남아있는 데이터를 강제로 내보내기 
	// ex) 수도꼭지 잠그면 호스에 물이 고여있는 것을 빼내기 위해 들어올리는 작업같은 느낌
			            fw.close();
			        } catch(Exception e){
			            e.printStackTrace();
			        } 
			        System.out.println();
		}
	public void memo2() {  // windows 버전 
			
			String txt;     // 기록용 변수 선언
			   System.out.print("기록하실 내용을 입력하세요 : ");
				 txt = sc.nextLine(); // 기록을 하기 위한 입력값
				 String fileName = ("C:\\hoon\\Project\\WorkOut_Diary.txt");
//			    String fileName = ("D:\\hoon\\WorkOut_Beta.txt");
			    // 무조건 memoView2 함수도 경로 변경 해줄것
			        try{
			            // BufferedWriter / FileWriter를 조합 사용 (속도 향상)
			            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
			            fw.write(txt);
			            fw.write("\r"); // 줄바꿈 !!
			            fw.flush(); // stream에 남아있는 데이터를 강제로 내보내기 
	// ex) 수도꼭지 잠그면 호스에 물이 고여있는 것을 빼내기 위해 들어올리는 작업같은 느낌
			            fw.close();
			        } catch(Exception e){
			            e.printStackTrace();
			        } 
			        System.out.println();
		}

		public void memoView1() { // mac 조회  
			System.out.println("--------MAC Diary OPEN-------");
		 try{ // 예외 처리
	         //파일 객체 생성
	         File file = new File("/Users/iyu/Desktop/GitHub Project/Project//DiaryMemo.txt"); // MAC버전
//	        File file = new File("C:\\Users\\Desktop\\WorkOut_Beta.txt"); // windows 버전          
	         
	         //스캐너로 파일 읽기
	         Scanner scan = new Scanner(file);
	         while(scan.hasNextLine()){
	             System.out.println(scan.nextLine());
	         }
	     }catch (FileNotFoundException e) {
	         // TODO: handle exception
	     }
	 
		 
		}
		public void memoView2() { // Windows
			System.out.println("--------Windows Diary OPEN-------");
			 try{ // 예외 처리
		         //파일 객체 생성
		        File file2 = new File("C:\\hoon\\Project\\WorkOut_Diary.txt"); // windows 버전          
//		        File file2 = new File("D:\\hoon\\WorkOut_Beta.txt");
		         // 무조건 memo2 함수도 경로 변경 해줄것
		        
		         //스캐너로 파일 조회  
		         Scanner scan = new Scanner(file2);
		         while(scan.hasNextLine()){
		             System.out.println(scan.nextLine());
		         }
		     }catch (FileNotFoundException e) {
		         // TODO: handle exception
		     }
			}
		public void memoDeleteMac() { // Mac
			System.out.println("--------MAC TXT DELETE --------");
			File file = new File("/Users/iyu/Desktop/GitHub Project/Project//DiaryMemo.txt"); 
			if( file.exists() ) {  // 파일이 존재하는가~~ 
				if(file.isDirectory()) { // 파일 경로 맞는지 확인  
					File[] files = file.listFiles(); 
					for( int i=0; i<files.length; i++) { 
						if( files[i].delete() ) { 
							System.out.println(files[i].getName()+" 삭제 성공"); 
							} else { 
								System.out.println(files[i].getName()+" 삭제 실패"); 
							} 
						} 
					} if(file.delete()) { 
						System.out.println("파일 삭제 성공"); 
					} else { 
						System.out.println("파일 삭제 실패"); 
						} 
					} else { 
						System.out.println("파일이 존재하지 않습니다."); 
					}
			System.out.println("-------- DELETE END --------");
				}
		// File의 Delete() 메소드를 이용하여 해당위치 파일을 삭제 시켜버린다.
		public void memoDeleteWin() { // Windows 
			System.out.println("--------Windows TXT DELETE --------");
			File file = new File("C:\\hoon\\Project\\WorkOut_Diary.txt"); 
			if( file.exists() ) {  // 파일이 존재하는가~~ 
				if(file.isDirectory()) { // 파일 경로 맞는지 확인  
					File[] files = file.listFiles(); 
					for( int i=0; i<files.length; i++) { 
						if( files[i].delete() ) {  // 
							System.out.println(files[i].getName()+" 삭제 성공"); 
							} else { 
								System.out.println(files[i].getName()+" 삭제 실패"); 
							} 
						} 
					} if(file.delete()) {  // 파일이 삭제 됐다면 
						System.out.println("파일 삭제 성공"); 
					} else { 
						System.out.println("파일 삭제 실패"); 
						} 
					} else { 
						System.out.println("파일이 존재하지 않습니다."); 
					}
			System.out.println("-------- DELETE END --------");
				}
		}
