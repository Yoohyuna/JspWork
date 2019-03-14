package calc; //1.package 최상위패키지명.하위패키지,,,;

//public class로 줘야 접근이 가능->그 클래스의 객체를 생성->멤버변수에 저장
public class CalcBean {  //CalcDTO
    
	private int num1,num2; //<%=num1+num2%>
	private String operator="";//연산자를 저장할 변수
	private int result;//연산값을 저장할 변수
	
	//+,-,*,/->계산
	public void calculate() {
		//+
		if(operator.equals("+")) {
			result=num1+num2;
		}
		//-
		if(operator.equals("-")) {
			result=num1-num2;
		}
		//*
		if(operator.equals("*")) {
			result=num1*num2;
		}
		// /
		if(operator.equals("/")) {
			result=num1/num2;
		}
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
		System.out.println("setNum1()호출됨!");
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
		System.out.println("setNum2()호출됨!");
	}
	public int getResult() {
		return result;
	}
	public void setOperator(String operator) {
		this.operator = operator;
		System.out.println("setOperator()호출됨!");
	}
}
