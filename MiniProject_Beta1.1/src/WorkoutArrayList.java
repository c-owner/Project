import java.util.ArrayList;
import java.util.Scanner;

public class WorkoutArrayList {


		Scanner sc = new Scanner (System.in);
		
		// 생성자 정의
		private ArrayList<WorkOut> list; // 배열리스트
		
		public WorkoutArrayList() {
			list = new ArrayList<WorkOut>(); // 생성자 만들기
		}
		
		public void addWorkout(WorkOut WorkOut) { // 메서드 반환형
			list.add(WorkOut);
		}
		
		public void removeWorkout(String Name) {
			for (int i = 0; i < list.size(); i ++) {
				WorkOut Workout = list.get(i); // i번째 요소 가져오기 
				String tmpName = Workout.workName; // 
				if (tmpName.equals(Name)) { // 입력한 운동명과 같으면
					list.remove(i); // i번째 요소 삭제  
					System.out.println("["+Name+"] 삭제 되었습니다.");
					return;
				}
			}
			System.out.println(Name + " 운동이 존재하지 않습니다.\n"
					+ "조회를 통해 다시 확인 해보세요.");
			return ;
			
		}
		
		public void showAllWorkout() {
			for (WorkOut m : list ){
				System.out.println(m);
			}
		}

		
		
	}