package ex12inheritance;

class Point_t {
   	int xDot, yDot;
   	public Point_t(int x, int y) {
 		xDot=x;
 		yDot=y;
   	}
   	public void showPointInfo() {
 		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle_t{	
	//멤버변수
	int radian;//반지름
	Point_t center;
	/*
	 원을 표현하기 위해 반지름과 중심점이 필요하다.
	 중심점 Point 객체는 2개의 멤버변수를 가지고 있으므로
	 해당 Circle 클래스의 객체를 생성하기 위해 3개의 값이 필요하다.
	 */
	public Circle_t(int x, int y, int radian) {
		center = new Point_t(x, y);
		this.radian = radian;
	}
	//정보 출력용 메서드
	public void showCircleInfo() {
		System.out.println("반지름:"+radian);
		center.showPointInfo();
	}
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring_t{
	//멤버변수
	Circle_t innerCircle;//안쪽의 원
	Circle_t outerCircle;//바깥쪽의 원
	
	//2개의 Circle 클래스의 객체를 생성하는 생성자 정의
	public Ring_t(int in_x, int in_y, int in_radian, 
			int out_x, int out_y, int out_radian) {
		innerCircle = new Circle_t(in_x, in_y, in_radian);
		outerCircle = new Circle_t(out_x, out_y, out_radian);
	}
	
	//링의 정보를 출력하는 메서드
	public void showRingInfo() {
		System.out.println("안쪽원의정보:");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의정보:");
		outerCircle.showCircleInfo();
	}
}
class QuRingMake_t {
	public static void main(String[] args) {
		Ring_t c = new Ring_t(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
