package test;  //��ɺ��� �з�- >�ݵ�� ��Ű���� ����

/* ����Ŭ������ ����� ����
 * 
 * 1.�ݵ�� public class�� �ۼ��Ұ� ~Bean ->~DTO(������ ���޿뵵�� ���)
 * 2.�������(�Է¹޴� �κ��� ����)�� �ݵ��  private 
 * 3.Setter ,Getter Method �ۼ�
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
		System.out.println("setStr()ȣ���!!");
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
		System.out.println("setAddr()ȣ���!!");
	}
}
