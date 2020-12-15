My_Project
----------

<!-- [Corner's Blog](https://iu-corner.tistory.com)의 사이트입니다.  --> 
<!-- [Corner 헬스 프로젝트](https://github.com/Eight-Corner/mine/tree/master/DB_Sign3_forMac)의 소스코드입니다.  -->
<!-- p.s 도움이 될지 모르겠지만 제 경우 DB를 이용하였기 때문에, 프로그램이 정상 구동되지 않을 것입니다. --> :seedling: :blush: 

:seedling:
----------

![mineLogo](https://www.jonesday.com/-/media/files/publications/2019/05/when-coding-is-criminal/when-coding-is-criminal.jpg?h=800&w=1600&la=en&hash=5522AA91198A168017C511FCBE77E201)

---

Mac JDK 환경변수 설정입니다.  
- vi ~/.bash_profile - export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home  
- export PATH=${PATH}:$JAVA_HOME/bin  
- source ~/.bash_profile - echo $PATH

---

### :seedling: Updated Patch Note - 2020 - 12 - 13

#### DB Sign3 작업중

-	Table간 컬럼 연동의 부분에 대한 이해 필요

#### DB Sign2 작업완료

-	로그인 화면 프레임 구현

-	BMI 기록 입력 & 측정할 때 입력할 회원으로 로그인해야 다음으로 넘어가지도록 기능 구현

-	BMI에서 기록을 입력하고 [저장]버튼 누르면 menuDAO (신체기록) 데이터베이스 테이블에 저장

	---

	### :seedling: Updated Patch Note - 2020 - 12 - 12

	#### DB Sign3 작업중....

-	Database Table 컬럼 구성

-	Database Table SQL 문 작성

-	회원가입 시 아이디 비번 (필수) 정보 없이 빈 칸 가입 되었던 버그 수정

---

### :seedling: Updated Patch Note - 2020-12-10 ()

#### : DB_Sign2 - new Mac OS x ver

:: foriegn key ::

=======================

### Update Patch Note - 2020-12-08(Tuesday)

#### : DB_Sign_for Mac Os : ver 0.1i

-	-	0.1i ver :: BMI 측정 프레임 건설 완료, Main Frame 버튼 추가

	-	예정 - > BMI DB연동
	-	0.1h ver :: Table Data 추가 => Inbody Check ==> 체중 측정까지만\*:: 추가 예정 — 인바디 기록 서비스 홈 -> 기록버튼 생성 : 기록에서 패널을 열고 id,pw를 입력받기

		키와
		----

		### Update Patch Note - 2020-12-06

		#### : DB_Sign UP for Mac OS : ver 0.1g
-	메뉴 화면 추가 (메뉴 : 회원별 기록 조회, 서비스 변경, 회원 출입관리 대장)

-	bugFix => 회원 수정시 생일,이용기간 구분자 버그 수정 완료

---

### Update Patch Note - 2020 - 12 - 05

#### : DB_Sign Up for Mac OS : ver 0.1f

-	bug fix ------------------ +Update Patch note - 2020-12-04  
	: Database Sign Up :
-	version update 0.1e
-	Database Insert Bug Fix!
-	birth,date varchar(8) -> (10) :: "/"+"/"
-	jframe class insertMember();  
	updateMember() -> insertMember(); fix

-	Create & Update success

-	Bug Find => Thread Exception .....

	"AWT-EventQueue-0" \<\<< error
	------------------------------

	Update Patch Note: Corner_Beat_Windows :

-	jlayer dir edit

: 0.1d - bug fix - SQL Syntax; - DB 로딩 문제 수정

-------예정-------- - 회원가입 저장 문제수정 예정
