package bokang.sub;
/*
체크카드 클래스 Ver.03
	: initMembers 초기화 메소드는 삭제처리 
	
	1.충전은 10000원 단위로만 가능하다.
	만약 5000원을 충전하면 충전불능으로 처리한다.
	
	2.잔고가 부족하면 결제불능으로 처리해야 한다.
	
	3.생성자 오버로딩 처리
		new CheckCard3(카드번호, 소유자, 잔고, 포인트);
		new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
		new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	
	4.포인트 적립율 변경
		10만원 이하결재 : 0.1%적립
		10만원 초과결재 : 0.3%적립
 */

public class CheckCard3
{
	private long cardNumver; //카드번호
	private String owner; //소유자
	private int balance; //잔액
	private int point; //포인트
	
	//기본(디폴트)생성자
	public CheckCard3() {}
	//생성자 자동완성기능 사용(인자생성자)
	public CheckCard3(long cardNumver, String owner, int balance, int point)
	{
		this.cardNumver = cardNumver;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
	public CheckCard3(long cardNumver, String owner, int balance)
	{
		this.cardNumver = cardNumver;
		this.owner = owner;
		this.balance = balance;
		this.point = 0;
	}
	
	public CheckCard3(long cardNumver, String owner)
	{
		this.cardNumver = cardNumver;
		this.owner = owner;
		this.balance = 0;
		this.point = 0;
	}
	
	public long getCardNumver()
	{
		return cardNumver;
	}
	public void setCardNumver(long cardNumver)
	{
		this.cardNumver = cardNumver;
	}
	public String getOwner()
	{
		return owner;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int getPoint()
	{
		return point;
	}
	public void setPoint(int point)
	{
		this.point = point;
	}
	
	//멤버메서드
	//충전(입금)
	public void charge(int amount) {
		if(amount%10000==0)
			this.balance += amount;
		else
			System.out.println("만원단위만 가능합니다");
	}
	
	//결제
	public void payment(int amount) {
		if(this.balance>=amount) {
			this.balance -= amount;
			savingPoint(amount);
		}
		else
			System.out.println("잔액부족");
	}
	
	//적립
	public void savingPoint(int amount) {
		if(amount>=100000) {
			double plusPoint = (amount*0.3);
			this.point += plusPoint;
		}
		else {
			double plusPoint = (amount*0.1);
			this.point += plusPoint;
		}
	}
	
	//현재상태출력
	public void showState() {
		System.out.println("카드번호:"+ this.cardNumver);
		System.out.println("소유자:"+ this.owner);
		System.out.println("잔고:"+ this.balance);
		System.out.println("포인트:"+ this.point);
	}
}
