package test;  //기능별로 분류- >반드시 패키지를 설정

/* 빈즈클래스를 만드는 조건
 * 
 * 1.반드시 public class로 작성할것 ~Bean ->~DTO(데이터 전달용도로 사용)
 * 2.멤버변수(입력받는 부분을 저장)는 반드시  private 
 * 3.Setter ,Getter Method 작성
 * 
 */
public class BeanDTO {

	private String str;
	private String addr;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
		System.out.println("setStr()호출됨!!");
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
		System.out.println("setAddr()호출됨!!");
	}
}
