
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		int num[];
		int korEng[][];
		int sum[];
		int rank[];
		int[] notJoin;
		do {
			System.out.print("인원수를 입력하세요. 1~10명 >");
			cnt = sc.nextInt();
			if ( cnt == 0 ) {
				cnt = 5; // default 초기인원 값
			}
		} while (cnt < 1 || cnt > 10);
		// 메모리 할당
		num = new int[cnt];
		korEng = new int[cnt][3];
		sum = new int[cnt];
		 notJoin = new int[cnt]; // 결석횟수
		rank = new int[cnt]; 
		int total[] = new int[6];
		int avg[] = new int[6];
		char ox[] = new char [cnt];
		char[] grade1 = new char [cnt]; // 학점
		String[] title = { "국어", "영어", "수학" };
		// 국어와 영어라는 메뉴 (for문에서 써먹을용)

		while(true) {
			System.out.println("메뉴 입력 ");
			System.out.println("1. 성적 입력하기 / 2. 전체 성적 출력 / 3. 장학금 대상자 / 4. 종료 ");
			int act = sc.nextInt();
			if(act == 1) {
				for (int i = 0; i < cnt; i++) {
					System.out.print("번호 입력 >");
					num[i] = sc.nextInt();
					for (int j = 0; j < 3; j++) { // 국어와 영어를 입력 할 것이기 때문에 2번 반복
						System.out.print(title[j] + " 점수 입력 :");
						korEng[i][j] = sc.nextInt();
						
						sum[i] += korEng[i][j]; // 총점계산
						total[0] += korEng[i][0]; // 국어 합계
						total[1] += korEng[i][1]; //영어 합계
						total[2] += korEng[i][2]; // 수학 합계
						total[4] += sum[i]; // 모든 합계
						total[5] += sum[i]/cnt; // 모든 평균 합계
						avg[0] = total[0]/cnt; // 국어
						avg[1] = total[1]/cnt; // 영어
						avg[2] = total[2]/cnt; // 수학
						avg[4] = total[4]/cnt; // 합계 평균
						avg[5] = total[5]/cnt; // 전체 평균
						if(sum[i] >= 250) {
							ox[i] = 'O';
							grade1[i] = 'A';
						} else if (sum[i] <= 249){
							ox[i] = 'X';
							grade1[i] = 'B';
						} else if (sum[i] < 200){
							ox[i] = 'X';
							grade1[i] = 'C';
						} else if (sum[i] < 150 ) {
							ox[i] = 'X';
							grade1[i] = 'F';
						}
						
					}
				}
				for(int i = 0; i < cnt; i ++ ) {
					System.out.print(i+1+"번째의 학생의 결석 횟수 입력 >");
					for(int j = 0; j < 1; j++) {
						notJoin[i] = sc.nextInt();
						total[3] += notJoin[i];
					}
				}
				for (int i = 0; i < cnt; i++) {
					rank[i] = 1; // 랭크를 1로 초기화 시켜놓고 밑에서 비교했을 때 낮은 점수는 랭크를 ++
				}
				// 석차계산
				for (int i = 0; i < cnt - 1; i++) { 
					for (int j = i + 1; j < cnt; j++) { // 자신 다음의 인덱스와 비교하기 위한 초기식
						if (sum[i] > sum[j]) { 
							rank[j]++; 
						} else if (sum[i] < sum[j]) { 
							rank[i]++;
						}
					}
				}
			}
			else if ( act == 2 ) {
				System.out.println("Show All");
				System.out.println("학번\t국어\t영어\t수학\t결석횟수\t  합계\t평균\t석차\t학점\t장학금여부");
				for (int i = 0; i < cnt; i++) {
					System.out.print(num[i]+"\t"); //
					for (int j = 0; j < 3; j++) {
						System.out.printf("%5d\t",korEng[i][j]);
					}
					System.out.printf("%5d\t",notJoin[i]);
					System.out.printf("%5d\t%d\t%5d\t", sum[i], sum[i] / 2, rank[i]);
					System.out.printf("%c\t%c",grade1[i],ox[i]);
					System.out.println();
				}
				System.out.print("\n합계: ");
				for (int i = 0; i < total.length; i++) {
				System.out.print(" \t  "+total[i]);
				}
				System.out.print("\n평균: ");
				for(int i = 0; i < avg.length; i++) {
					System.out.print("  \t  "+avg[i]);
				}
				System.out.println();
			}
			else if ( act == 3 ) {
				for(int i = 0; i < cnt; i ++ ) {
					if(grade1[i] == 'A') {
						System.out.println("장학금 대상자 : "+num[i]);
					}
				}
			}
		

			
			if(act == 4) {
				System.out.println("좋은 하루 였습니다.");
				break;
			}
		}
	}

}
