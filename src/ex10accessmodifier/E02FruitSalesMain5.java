package ex10accessmodifier;

/*
 세번째 버전에서는 초기화 메서드를 생성자로 변경해본다.
  */
//과일 판매자를 추상화한 클래스
class FruitSeller3{
	//멤버변수
	public int numOfApple;  //판매자가 보유한 사과 갯수
	public int myMoney;  //판매수익
	public final int APPLE_PRICE; //사과의 단가

	
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	//멤버메서드
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재 상태를 출력한다
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

// 구매자를 추상화한 클래스
class FruitBuyer3{
	public int myMoney;  //보유한 금액
	public int numOfApple;  //구매한 사과의 갯수
	
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

//프로그램의 출발점이 되는 메인 클래스
public class E02FruitSalesMain5
{
	public static void main(String[] args)
	{
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		

		////////////////////////////////////////////////////////////////
		/*
		 아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한 사과의
		 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
		 즉, 코드(메서드)로 구현한 규칙이 완전히 무너지게 된다.
		 객체지향 프로그래밍에서는 이런 오류를 막기 위해 멤버변수에 대한
		 "정보은닉"을 하도록 규정하고 있다.
		 */
		seller1.myMoney += 1000;  //판매자 1에게 1000원을 지불하고
		seller1.numOfApple -= 50; //사과 50개를 구매한다.
		buyer.numOfApple += 50;   //구매자는 50개가 증가하였다.
		
		seller2.myMoney += 1000;  //판매자 3에게 1000원을 지불하고
		seller2.numOfApple -= 70; //사과 70개를 구매한다.
		buyer.numOfApple += 70;   //구매자는 70개가 증가하였다.
		                          //하지만 구매자의 금액은 차감되지 않는다.
		
		System.out.println("구매행위가 일어난 후의 상태2");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();		
		
		
		
		
		
		
		
	}
}
