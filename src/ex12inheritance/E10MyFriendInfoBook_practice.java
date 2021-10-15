package ex12inheritance;

import java.util.Scanner;

class Friend_p{
	String name;
	String phone;
	String addr;
	
	public Friend_p(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
	public void showAllData() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phone);
		System.out.println("주소:"+addr);
	}
	
	public void showBasicInfo() {}
}

class HighFriend_p extends Friend_p{
	String nickname;
	
	public HighFriend_p(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	
	@Override
	public void showAllData()
	{
		System.out.println("==고딩친구 전체 정보==");
		super.showAllData();
		System.out.println("별명:"+nickname);
	}
	
	@Override
	public void showBasicInfo()
	{
		System.out.println("==고딩친구==");
		System.out.println("별명:"+nickname);
		System.out.println("전번:"+phone);
	}
}

class UnivFriend_p extends Friend_p{
	String major;
	
	public UnivFriend_p(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	
	@Override
	public void showAllData()
	{
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공:"+major);
	}
	@Override
	public void showBasicInfo()
	{
		System.out.println("==대딩친구==");
		System.out.println("이름:"+name);
		System.out.println("전번:"+phone);
	}
}

class FriendInfoHandler_p{
	private Friend_p[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler_p(int num) {
		myFriends = new Friend_p[num];
		numOfFriends = 0;
	}
	
	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		
		System.out.print("이름:");iName = scan.nextLine();
		System.out.print("전화번호:");iPhone = scan.nextLine();
		System.out.print("주소:");iAddr = scan.nextLine();
		
		if(choice ==1) {
			System.out.println("별명:");iNickname = scan.nextLine();
			HighFriend_p high = new HighFriend_p(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++]= high;
		}
		else if(choice ==2) {
			System.out.println("전공:");iMajor = scan.nextLine();
			myFriends[numOfFriends++]= new UnivFriend_p(iName, iPhone, iAddr, iMajor);
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	}
	
	public void showAllData() {
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체 정보가 출력되었습니다==");
	}
	
	public void showSimpleData() {
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showBasicInfo();
		}
		System.out.println("==간략 정보가 출력되었습니다==");
	}
	
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요");
		String searchName = scan.nextLine();
		
		for(int i=0 ; i<numOfFriends ; i++) {
			if(searchName.compareTo(myFriends[i].name)==0) {
				myFriends[i].showAllData();
				isFind = true;
			}
		}
		if(isFind = false)
			System.out.println("**찾는 정보가 없습니다.**");
	}
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
		
		int deleteIndex = -1;
		for(int i=0 ; i<numOfFriends ; i++) {
			if(deleteName.compareTo(myFriends[i].name)==0) {
				myFriends[i] = null;
				deleteIndex = i; 
				numOfFriends--;
				break;
			}
		}
		if(deleteIndex == -1) {
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else {
			for(int i=deleteIndex ; i<numOfFriends ; i++) {
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터("+ deleteIndex +"번)가 삭제되었습니다==");
		}
	}
}

public class E10MyFriendInfoBook_practice
{
	public static void menuShow() {
		System.out.println("### 메뉴를 입력하세요 ###");
		System.out.print("1.고딩친구 입력 ");
		System.out.println("2.대딩친구 입력");
		System.out.print("3.전체정보 출력 ");
		System.out.println("4.간략정보 출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		FriendInfoHandler_p handler = new FriendInfoHandler_p(100);
		
		while(true) {
			menuShow();
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램 종료");
				return;
			}
		}
	} ////main 끝
}
