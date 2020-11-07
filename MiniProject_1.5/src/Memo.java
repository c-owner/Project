import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Memo {
	// 기록 클래스 운동을 상속받아 운동 리스트를 호출할 예정
	Scanner sc = new Scanner(System.in);
	int day,time; // 날짜와 운동한 시간이 필요  

	public Memo() {
		super();
	}
	//	--------------------------------------------------------------
	public void memo1() {  // mac 버전 

		String txt;     // 기록용 변수 선언
		System.out.print("기록하실 내용을 입력하세요 : ");
		txt = sc.nextLine(); // 기록을 하기 위한 입력값
		String fileName = "/Users/iyu/Desktop/GitHub Project/DiaryMac.txt";
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
		String fileName = ("C:\\hoon\\WorkOut_Diary.txt");

		System.out.print("기록하실 내용을 입력하세요 : ");
		txt = sc.nextLine(); // 기록을 하기 위한 입력값
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
	//	--------------------------------------------------------------
	public void folderMac() { // 폴더 확인 함수
		String path = "/Users/iyu/Desktop/GitHub Project/"; // 폴더 경로 선언
		File Folder = new File(path);// 해당 디렉토리가 없을경우 디렉토리를 생성
		if (!Folder.exists()) {
			try {
				Folder.mkdirs(); // 폴더 생성 midir은 써보니까 마지막 폴더를 가기위한 폴더가 이미 있어야함
				//			     mkdirs는 그 폴더를 가기위한 모든 폴더를 만들어줌
				System.out.println("현재 디렉토리가 옳바르지 않아 새로운 폴더가 생성되었습니다.");
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
		}
		// 폴더가 제대로 있는지 판별부터 하고 난 뒤, 기록을 진행
	}

	public void folderWindows() { // 폴더 확인 함수
		String path = "C:\\hoon\\"; // 폴더 경로 선언
		File Folder = new File(path);// 해당 디렉토리가 없을경우 디렉토리를 생성
		if (!Folder.exists()) {
			try {
				Folder.mkdirs();
				System.out.println("현재 디렉토리가 옳바르지 않아 새로운 폴더가 생성되었습니다.");
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
		}
	}
	//	--------------------------------------------------------------
	public void memoView1() { // mac 조회  
		System.out.println("--------MAC Diary OPEN-------");
		try{ // 예외 처리
			//파일 객체 생성
			File file = new File("/Users/iyu/Desktop/GitHub Project/DiaryMac.txt"); // MAC버전
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
			File file2 = new File("C:\\hoon\\WorkOut_Diary.txt"); // windows 버전          
			System.out.println("Directory = C:\\hoon\\WorkOut_Diary.txt");
			//스캐너로 파일 조회  
			Scanner scan = new Scanner(file2);
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}	
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		}
	}
	//	---------------------------------------------------------------
	public void memoDeleteMac() { // Mac
		System.out.println("--------MAC TXT DELETE --------");
		File file = new File("/Users/iyu/Desktop/GitHub Project/DiaryMac.txt"); 
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
			} if(file.delete()) {  // 파일이 삭제 됐다면 
				System.out.println("파일 삭제 성공"); 
			} else { 
				System.out.println("ERROR ** 파일 삭제 실패"); 
			} 
		} else { 
			System.out.println("파일이 존재하지 않습니다."); 
		}
		System.out.println("-------- DELETE END --------");
	}
	// File의 Delete() 메소드를 이용하여 해당위치 파일을 삭제 시켜 버리기
	public void memoDeleteWin()   { // Windows 
		System.out.println("--------Windows TXT DELETE --------");
		File file = new File("C:\\hoon\\WorkOut_Diary.txt"); 
		if( file.exists() ) {  // 파일이 존재하는가~~ 
			if(file.isDirectory()) { // 파일 경로 맞는지 확인  
				File[] files = file.listFiles(); 
				for( int i=0; i<files.length; i++) {  // 
					if( files[i].delete() ) {  // 
						System.out.println(files[i].getName()+" 삭제 성공"); 
					} else { 
						System.out.println(files[i].getName()+" 삭제 실패"); 
					} 
				} 
			} if(file.delete()) {  // 파일이 삭제 됐다면 
				System.out.println("파일 삭제 성공"); 
			} else { 
				System.out.println("ERROR ** 파일 삭제 실패"); 
			} 
		} else { 
			System.out.println("파일이 존재하지 않습니다."); 
		}
		System.out.println("-------- DELETE END --------");
	}
	//	--------------------------------------------------------------
// public void memoDeleteWin() {
//	File file = new File("C:\\hoon\\WorkOut_Diary.txt");
//	System.out.println("--------Windows TXT DELETE --------");
//    //파일이 삭제될때 까지 반복 (반복횟수 100번)
//	System.out.println("파일 삭제를 진행합니다. 상황에 따라 시간이 지연 될 수 있습니다.");
//    for(int i=0; i<100; i++) { 
//        if(file.delete()) {
//            System.out.println("파일 삭제를 성공적으로 마쳤습니다.");
//            break;
//        } else {
//            System.out.println("파일 삭제를 실패 하였습니다.. 삭제 시도를 다시 시도 합니다.");
//            //파일 삭제를 실패한 경우 1초후 다시 실행
//            try {
//                Thread.sleep(1000); // 쓰레드 슬립 , 상태제어, 주어진 시간동안 일시정지 
//            } catch(InterruptedException e) {
//                e.printStackTrace(); 
//            }
//        }
//    }
//    System.out.println("-------- DELETE END --------");
//  }
}
	
