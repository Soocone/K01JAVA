package ex15usefulclass;

class MyClass{
	int data;
	public MyClass(int data) {
		this.data = data;
	}
	
	/*
	 toString(): 실제 저장된 데이터가 반환되도록 Object 클래스로부터
	 	상속받아 오버라이딩한 메서드
	 */
	@Override
	public String toString() //반환타입 String
	{
		return String.valueOf(data); 
	}
	
	/*
	 MyClass형의 객체의 비교를 위해 오버라이딩한 메서드. 객체가 가지고 있는
	 멤버변수의 비교를 통해 동일여부를 판단한다.
	 */
	@Override
	public boolean equals(Object obj)
	{
		/*
		 매개변수로 전달된 객체를 Object형으로 받은 후 MyClass의 인스턴스인지
		 먼저 판단한다. Instanceof 연산자는 해당 객체와 상속관계가 있는지를
		 판단한다.
		 */
		if(obj instanceof MyClass) {
			/*
			 매개변수가 MyClass타입이 맞다면 비교를 위해 MyClass 타입으로
			 형변환(다운캐스팅)한다.
			 */
			MyClass mc = (MyClass)obj;
			//두 객체의 멤버변수의 값을 실제로 비교한다.
			if(mc.data == this.data) {
				System.out.println("MyClass-멤버동일함");
				return true; //값이 일치하면 true 반환
			}
			else {
				System.out.println("MyClass-멤버다름");
				return false; //일치하지 않으면 false 반환
			}
		}
		else {
			/*
			 매개변수로 전달된 객체가 MyClass의 인스턴스가 아니라면
			 비교의 대상이 될 수 없으므로 false 반환
			 */
			System.out.println("MyClass 객체아님");
			return false;
		}
	}
}

class Point{
	
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 객체 1, 2의 x, y 값을 동시에 비교해서 둘 다 동일할 때 같은 객체로 판단한다.
	 만약 하나의 값만 비교하고 싶다면 조건을 수정하면 된다.
	 */
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Point) {
			Point pos = (Point)obj;
			if(this.x==pos.x && this.y==pos.y)
				return true;
			else
				return false;
		}
		else {
			System.out.println("다른 객체는 비교대상이 아님");
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return "x="+ String.valueOf(x) +", y="+ String.valueOf(y);
	}
}


public class E04Object3Equals
{

	public static void main(String[] args)
	{
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("[두 객체를 equals() 메소드로 비교]");
		
		if(mc1 == mc2)
			System.out.println("인스턴스 참조값(주소값)이 같다");
		else
			System.out.println("인스턴스 참조값(주소값)이 다르다");
	
	
		System.out.println(mc1.equals(mc2) ? "같다" : "다르다");  //같다
		/*
		 println()은 출력전 항상 객체의 toString() 메서드를 자동으로 
		 호출하므로 아래 출력결과는 동일하다.
		 */
		System.out.println("[두 객체의 toString()메소드 호출]");
		//서로 다른 객체이므로 비교의 대상이 될 수 없음
		System.out.println("mc1.toString()=>"+mc1.toString());
		System.out.println("mc2.toString()=>"+mc2.toString());
	
		Point pos1 = new Point(10,20);
		Point pos2 = new Point(10,30);
		System.out.println("두 점의 비교결과:");
		//둘다 Point객체이므로 비교가능함
		System.out.println(pos1.equals(pos2) ? "같다" : "다르다");
	
		//아래 출력결과는 동일하다
		System.out.println("pos1.toString()=>" + pos1.toString());
		System.out.println("pos2.toString()=>" + pos2.toString());
		System.out.println(pos1);
		System.out.println(pos2);
	}
}
