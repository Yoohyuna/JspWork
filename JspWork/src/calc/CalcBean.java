package calc; //1.package �ֻ�����Ű����.������Ű��,,,;

//public class�� ��� ������ ����->�� Ŭ������ ��ü�� ����->��������� ����
public class CalcBean {  //CalcDTO
    
	private int num1,num2; //<%=num1+num2%>
	private String operator="";//�����ڸ� ������ ����
	private int result;//���갪�� ������ ����
	
	//+,-,*,/->���
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
		System.out.println("setNum1()ȣ���!");
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
		System.out.println("setNum2()ȣ���!");
	}
	public int getResult() {
		return result;
	}
	public void setOperator(String operator) {
		this.operator = operator;
		System.out.println("setOperator()ȣ���!");
	}
}
