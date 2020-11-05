#include <stdio.h>


typedef struct Health { // 운동 구조체 
	char hName[20]; // 운동명
	unsigned int hSet, hTime; // 운동 세트와 시간
	int day, time; // 기록할  날짜와 운동한 시간
}Health;


void HealthAdd(Health *health_list, char *hName,int *hSet,int *hTime);//운동 추가
void HealthDel(Health *health_list);//운동 삭제 
void Show(Health *health_list);//운동 조회 
void MemoShow(Health *health_day);//기록 조회 
void Memo(Health *health_day, int *day, int *time);//기록 저장 

int main()
{
	int user_choice; // 유저 선택메뉴 
	int num_total_day = 0;  // 현재 운동 기록 일 수 
	
	Health *health_day;
    Health *health_list;

    printf("운동목록의 최대 보관 크기를 얼만큼 지정 하시겠습니까?\n");
    scanf_s("%d", &user_choice);
    // 동적 프로그래밍 
    health_list = (Health*)malloc(sizeof(Health) * user_choice);
    


    while (1) {

        printf("--------------------\n");
        printf("|| 1. 운동 추가 ||\n");
        printf("|| 2. 운동 삭제 ||\n");
        printf("|| 3. 운동 조회 ||\n");
        printf("|| 4. 기록 조회 ||\n");
        printf("|| 5. 기록 저장 ||\n");
        printf("|| 0. 종     료 ||\n");
        printf("\n  번호     선택  : ");
        scanf("%d", &user_choice);

        if (user_choice == 0) {
            printf("\n★★★★프로그램을 종료합니다★★★★\n");
            break;
        }
    }
}

//운동 추가
void HealthAdd(Health* health_list, char *hName, int *hSet, int *hTime) {
    printf("운동 이름 : ");
    scanf_s("%c", health_list[*hName].hName, sizeof(health_list[*hName].hName));
    printf("세트 수 설정 : ");
    scanf_s("%d", health_list[*hSet].hSet, sizeof(health_list[*hSet].hSet));
    printf("시간[sec] 설정 : ");
    scanf_s("%d", health_list[*hTime].hTime, sizeof(health_list[*hTime].hTime));

    

}
