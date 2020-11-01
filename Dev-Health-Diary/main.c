#include <stdio.h>

#include <stdlib.h>
#include <string.h>
#include <process.h>

#define  _FILE_   "HealthDiary.dat" // 운동 기록 저장명  선언 

struct data {
   char cName[8]; //운동명 
   char cTel[16]; // 운동 
   char cAddr[32];
};

struct day {
	char cDay[6];    // 날짜
	char cTime[4]; // 시간 
};

//함수 선언 
void HealthAdd(unsigned, struct data *);//운동 추가
void HealthDel(unsigned, struct data *);//운동 삭제 
void Show(unsigned, struct data *);//운동 조회 
void MemoShow(unsigned, struct data *);//기록 조회 
void Memo(unsigned, struct data *);//기록 저장 

int Cnt_data(unsigned); //레코드 인원수를 세어주는 함수  
 
int main(int argc, char *argv[]) {
    char cBtn;
   int Lec;
   unsigned rsize = sizeof(struct data);//56 byte
   
   struct data *Heal1;   
   struct data *Heal2;
   struct day *day1;
    
    
   while(1){
          
      Lec=Cnt_data(rsize); // 운동 목록 저장 레코드  
      Lec=Day_data(rsize);  // 운동 기록 저장 레코드  
  
       Heal1 = (struct data *)malloc(1*sizeof(struct data)); 
      
       Heal2 = (struct data *)malloc(Lec*sizeof(struct data));//파일안에 여러개의 레코드를 넣을 메모리 확보
	   //   
      system("cls");
      
      printf("구조체 크기 : %d\n", rsize);
      printf("데이터 갯수 : %d\n\n", Lec);
      
      if(Lec != 0 ){  
      	printf("--------------------\n");
         printf("|| 1. 운동 추가 ||\n");
         printf("|| 2. 운동 삭제 ||\n");
         printf("|| 3. 운동 조회 ||\n");
         printf("|| 4. 기록 조회 ||\n");
         printf("|| 5. 기록 저장 ||\n");
         printf("|| 0. 종     료 ||\n");
         printf("\n  번호     선택  : ");
         scanf("%c", &cBtn);
      } else {  //제일 처음에 파일에 아무것도 없는 상태 
         cBtn='1'; 
      }
       if(cBtn == '1'){
          system("cls");
          HealthAdd(rsize, Heal1);
      }else if(cBtn == '2'){
         if(Lec == 0 ){
            printf("검색할 데이터가 없습니다 \n");
            system("pause");
         }else{
            system("cls");
            HealthDel(rsize,Heal2);
         }
      }else if(cBtn=='3'){
         if(Lec == 0) {
            printf("수정할 데이터가 없습니다 \n");
            system("pause");
         }else{
            system("cls");
            Show(rsize, Heal2);
         }
      }else if(cBtn=='4'){
         if(Lec == 0){
            printf("삭제할 데이터가 없습니다 \n");
            system("pause");
         }else{
            system("cls");
            MemoShow(rsize, Heal2);
         }
      }else if(cBtn == '5'){
         if(Lec == 0 ){
            printf("조회할 데이터가 없습니다 \n");
            system("pause");
         }else{
            system("cls");
            Memo(rsize, Heal2);
         }
         
      }else if(cBtn == '0'){
         break;
      } 
   }
   
      
   return 0;

}

//레코드 갯수 세어 주는 함수  
int Cnt_data(unsigned  rsize){ //56
   int Cnt;
   FILE *fload;//fload라는 변수는 FILE의 포인터 변수이다. 
   
   fload = fopen(_FILE_, "r");
   if(fload == NULL) {
      Cnt = 0;
   }else{
      fseek(fload, -1, SEEK_END);//fseek(파일포인터, 이동할 크기, 기준점); 성공하면 0 실패하면 -1를 반환함 
    // 
      
      Cnt = (ftell(fload)/rsize)+1;//ftell(파일포인터) 파일포인터의 현재 위치를 반환한다. 실패하면 -1를 반환한다.   
      fclose(fload);
   }
   return Cnt;
}
// 운동 저장 함수  
void HealthAdd(unsigned rsize, struct data *Heal1){
    FILE  *fsave;
    
    fflush(stdin);
    printf("\n  운동명 [8자 이내] :  ");
    gets(Heal1->cName);
    printf("\n n세트 입력 [2자] :  ");
    gets(Heal1->cTel);
    printf("\n n 초(sec)입력 [2자] :  ");
    gets(Heal1->cAddr);
    
    if(strlen(Heal1->cName) < 1 || strlen(Heal1->cTel) < 1 || strlen(Heal1 -> cAddr) < 1){
       printf("저장되지 않았습니다. 다시 시도하세요.  \n");
   }else{
     fsave = fopen(_FILE_, "a+");//append 추가    
     fwrite(Heal1, rsize, 1, fsave);
     fclose(fsave);  
   }
   system("pause");
  }
  
  // 운동 삭제 함수   
void HealthDel(unsigned rsize, struct data *Heal2){
      int i, j=0;
   int nNum;
   char cYN;
   int Cnt = Cnt_data(rsize);
   FILE *fsave;//쓰기용  
   FILE *fload;//읽기용 
   
   printf("총 %d개의 운동 데이터가 있습니다 \n", Cnt);
   
   if(Cnt == 1) {
      printf("1개의 데이터만 존재합니다. \n");
      fflush(stdin);
      printf("모두 삭제하시겠습니까?(Y/N)");
      cYN = getchar(); //scanf("%c", &cYN);
      if(cYN == 'Y' || cYN == 'y'){
         _unlink(_FILE_);
    }else{
     printf("취소되었습니다. ") ;    
    }
   } else {
       while(1) {
            printf("몇번째 데이터를 삭제하시겠습니까? ");
            fload = fopen(_FILE_, "r+"); 
  			 fread(Heal2, rsize, Cnt, fload);
   			for(i=0;i<Cnt;i++){ //i=0, 1
     		  //2-1 == 0 2-1 == 1
            printf("\n %d번째 데이터 \n", i+1);
            printf("운 동 명 : %s\n", (Heal2+i)->cName);
            printf("세 트 수 : %s \n", (Heal2+i)->cTel);
            printf("시    간 : %s \n", (Heal2+i)->cAddr);
 			  }
            scanf("%d", &nNum);
            if(nNum <= Cnt) break;   // 2 <= 3           
     } 
      fload = fopen(_FILE_, "r+");
      fread(Heal2, rsize, Cnt, fload);
      for(i=0;i<Cnt;i++){
         if( i != nNum-1) { // 0 != 1
               if(j==0) fsave = fopen(_FILE_,"w+");
               else fsave = fopen(_FILE_, "a+");
               fwrite(Heal2 + i, rsize, 1, fsave);
               fclose(fsave);
               j++;
         }
      }
         printf("선택하신 운동이 삭제되었습니다.\n");
         fclose(fload);
         } 
         system("pause");
}
    
 //운동 조회 함수 
void Show(unsigned rsize, struct data *Heal2){
   
   	int nNum,i;
   FILE *fload;
   int Cnt = Cnt_data(rsize);//데이터(레코드) 개수 세주는 함수 호출  
   printf("총 %d개의 데이터가 있습니다.\n ", Cnt);//ex) 3
   printf("몇 번째 데이터를 조회하시겠습니까? ");//ex) 5번 조회  
   scanf("%d", &nNum);//2
   
   fload = fopen(_FILE_, "r+"); 
   fread(Heal2, rsize, Cnt, fload);
   for(i=0;i<Cnt;i++){ //i=0, 1
       if(nNum-1 == i){ //2-1 == 0 2-1 == 1
            printf("\n %d번째 데이터 \n", i+1);
            printf("운 동 명 : %s\n", (Heal2+i)->cName);
            printf("세 트 수 : %s \n", (Heal2+i)->cTel);
            printf("시    간 : %s \n", (Heal2+i)->cAddr);
      }
   }
   fclose(fload);
   system("pause");
   
 } 
  //기록 조회 함수 
void MemoShow(unsigned rsize, struct data *Heal2){
	int nNum,i;
   FILE *fload;
   int Cnt = Cnt_data(rsize); 
   printf("총 %d개의 데이터가 있습니다.\n ", Cnt);
   printf("몇 번째 데이터를 조회하시겠습니까? ");
   scanf("%d", &nNum);
   
   fload = fopen(_FILE_, "r+"); 
   fread(Heal2, rsize, Cnt, fload);
   for(i=0;i<Cnt;i++){ //i=0, 1
       if(nNum-1 == i){ //2-1 == 0 2-1 == 1
            printf("\n %d번째 데이터 \n", i+1);
            printf("운 동 명 : %s\n", (Heal2+i)->cName);
            printf("세 트 수 : %s \n", (Heal2+i)->cTel);
            printf("시    간 : %s \n", (Heal2+i)->cAddr);
      }
   }
   fclose(fload);
   system("pause");
 }
// 기록 저장 함수 
void Memo(unsigned rsize, struct data *Heal2){
  int i;
  int Cnt = Cnt_data(rsize);
  FILE *fload;
  
  printf("총 %d개의 데이터가 있습니다. ", Cnt);
  fload = fopen(_FILE_, "r+");
  fread(Heal2, rsize, Cnt, fload);
  for(i=0;i<Cnt; i++){
     printf("\n %d번째 데이터 \n", i+1);
     printf("날    짜 : %s\n", (Heal2+i)->cName);
     printf("시    간 : %s \n", (Heal2+i)->cTel);
     printf("운 동 명 : %s \n", (Heal2+i)->cAddr);
  }
  fclose(fload);
  system("pause");
}
  
