package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller3;

//구매자를 추상화한 클래스
public class FruitBuyer3{
	int myMoney;  //보유한 금액
	int numOfApple;  //구매한 사과의 갯수
	
	//초기화 메서드 선언
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	//FruitSeller3타입의 seller참조변수 사용(주소값 하나가 seller라고 전달된것일뿐임)
	public void buyApple(FruitSeller3 seller, int money) { 
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}