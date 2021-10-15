package ex12inheritance;

//친구의 정보를 저장할 기본클래스
class MyFriendInfo_t{
	private String name;
	int age;
	
	public MyFriendInfo_t(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showMyFriendInfo_t() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo_t extends MyFriendInfo_t
{
	private String addr;
  	private String phone;

  	public MyFriendDetailInfo_t(String name, int age, String addr, String phone) {
  		super(name, age);
  		this.addr = addr;
  		this.phone = phone;
  	}
  	
	public void showMyFriendDetailInfo_t(){
		showMyFriendInfo_t();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo_t {
	public static void main(String[] args) {
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		//정보Print
		MyFriendDetailInfo_t info = 
				new MyFriendDetailInfo_t("유비", 55, "촉", "010-1234-1234");
		info.showMyFriendDetailInfo_t();
	}
}
