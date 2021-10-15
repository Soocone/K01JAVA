package ex05method;

import java.util.Scanner;

/*
 문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
 */
public class QuTemperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("섭씨(°C)를 입력: ");
		int cel = scanner.nextInt();
		System.out.print("화씨(°F)를 입력: ");
		int fah = scanner.nextInt();
		
		temperature(cel, fah);
	}
	
	
	static void temperature(int celsius, int fahrenheit) {

		double resultCelsius = ((fahrenheit - 32) / 1.8);
		
		double resultFahrenheit = (1.8 * celsius + 32);
		
		System.out.printf("섭씨를 화씨로 변환: %.1f°F\n", resultFahrenheit);
		System.out.printf("화씨를 섭씨로 변환: %.1f°C", resultCelsius);
	}
}
