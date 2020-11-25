// 회사를 부모 - 등급은 상속
public class Company {
	
	String name,code; // 고객명과 등급 코드
	// 시간당 단가는 등급마다 다르다.
	int bal,defMoney; // 시간당 단가와 기본요금
	int useTime; // 사용시간
	int discount; // 할인요금
	int monthPay; // 이번달 통신요금
	public Company() {	}
	public Company(String name,String code,int bal,int defMoney,int useTime,int discount, int monthPay) {
		this.name = name; this.code = code; this.bal=bal; this.defMoney=defMoney;
		this.useTime=useTime;this.discount=discount; this.monthPay=monthPay;
	}
}

class A extends Company{
	public A() {}
	public A(String name,String code,int bal,int defMoney,int useTime,int discount, int monthPay) {
	super(name,"A", 86, 10000, useTime, discount, monthPay);
	}
	
}
class B extends Company{
	public B() {}
	public B(String name,String code,int bal,int defMoney,int useTime,int discount, int monthPay) {
		super(name,"B",  81, 12000, useTime, discount, monthPay);
	}
}
class C extends Company{
	public C() {}
	public C(String name,String code,int bal,int defMoney,int useTime,int discount, int monthPay) {
		super(name,"C",  104, 15000, useTime, discount, monthPay);
	}
}

class D extends Company{
	public D() {}
	public D(String name,String code,int bal,int defMoney,int useTime,int discount, int monthPay) {
		super(name,"D",  52, 20000, useTime, discount, monthPay);
	}
}
