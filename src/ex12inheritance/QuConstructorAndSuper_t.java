package ex12inheritance;


 class Car_t
{
   	int gasoline;
   	public Car_t(int g) {
   		gasoline = g;
   		System.out.println("Car 생성자 호출");
   	}
}
 
class HybridCar_t extends Car
{
   	int electric;
//생성자는 클래스명과 동일하고 반환 타입이 없다.
//접근지정자는 큰 이유가 없다면 무조건  public으로 지정한다
   	public HybridCar_t(int g, int e) {
   		super(g);
   		electric = e;
   		System.out.println("HybridCar 생성자 호출");
   	}
}

class HybridWaterCar_t extends HybridCar
{
   	int water;
   	
   	public HybridWaterCar_t(int g, int e, int w) {
   		//부모클래스의 인자 생성자 호출
   		super(g, e);
   		water = w;
   		System.out.println("HybridWaterCar 생성자 호출");
   	}
   	
   	
   	public void showNowGauge()
   	{
     	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}
public class QuConstructorAndSuper_t {

	public static void main(String[] args)
	{
		HybridWaterCar_t hcar = new HybridWaterCar_t(10,20,30);
		hcar.showNowGauge();
	}
}
