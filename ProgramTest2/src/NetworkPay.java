import java.util.Scanner;

public class NetworkPay {
	Scanner sc = new Scanner(System.in);
	Company[] gradeArr = new Company[10];
	 int i = 0;
	
	// ----------------------Method-----------
	public void inputScan() { // 반복 입력
		double tmp = 0; // 교환용
		Company c = new Company();
			System.out.print("고객명을 입력 > ");
			c.name = sc.next();
			System.out.print("등급코드를 입력 > ");
			c.code = sc.next();
			//c code가 A,b,c,d라면 그때 new 저장 하기로..
			if (c.code.equals("A")) {
				Company a = new A();
				a.name = c.name; 
				a.code = c.code; // 위에 입력한 값들을 A등급 속성에 대입해줬어!!
				System.out.print("사용시간 입력 >");
				a.useTime = sc.nextInt();
				// 교환 형변환
				tmp = 10000 * 0.1; // 할인은 기본요금 10%
				a.discount = (int) tmp;
				a.monthPay = 104*a.useTime + 15000-a.discount;
				
		Company ca = new A(a.name, a.code, 86, 10000, a.useTime, a.discount, a.monthPay);
		gradeArr[i++] = ca;
				
			} else if (c.code.equals("B")) {
				Company b = new B();
				b.name = c.name; b.code = c.code;
				System.out.print("사용시간 입력 >");
				b.useTime = sc.nextInt();
				
				// 교환 형변환
				tmp = 12000 * 0.1; // 할인은 기본요금 10%
				b.discount = (int) tmp;
				b.monthPay = 104*b.useTime + 15000-b.discount;
				b = new B(b.name, b.code, 81, 12000, b.useTime, b.discount, b.monthPay);
				gradeArr[i++] = b;
			} else if (c.code.equals("C")) {
				Company c1 = new C();
				c1.name = c.name; c1.code = c.code;
				System.out.print("사용시간 입력 >");
				c1.useTime = sc.nextInt();
				
				// 교환 형변환
				tmp = 15000 * 0.1; // 할인은 기본요금 10%
				c1.discount = (int) tmp;
				c1.monthPay = 104*c1.useTime + 15000-c1.discount;
				c1 = new C(c1.name, c1.code, 104, 15000, c1.useTime, c1.discount, c1.monthPay);
				gradeArr[i++] = c1;
			} else if (c.code.equals("D")) {
				Company d = new D();
				d.name = c.name; d.code = c.code;
				System.out.print("사용시간 입력 >");
				d.useTime = sc.nextInt();

				// 교환 형변환
				tmp = 20000 * 0.1; // 할인은 기본요금 10%
				d.discount = (int) tmp;
				d.monthPay = 104*d.useTime + 15000-d.discount;
				d = new D(d.name, d.code, 52, 20000, d.useTime, d.discount, d.monthPay);
				gradeArr[i++] = d;
			} else {
				System.out.println("다시 입력- 저장 안됨 -");
			}
	}
	public void show(Company[] strArr) {
		System.out.println("고객명\t등급코드\t시간당단가\t기본요금\t사용시간\t할인요금\t이번달통신요금");
		for(int j = 0; j < strArr.length; j++ ) {
			if(strArr[j] == null) break;
			System.out.println(strArr[j].name+"\t"+strArr[j].code+"\t"+strArr[j].bal+"\t"+strArr[j].defMoney+"\t"+strArr[j].useTime+""
				+"\t"+strArr[j].discount+"\t"+strArr[j].monthPay);
		}
	}

}

