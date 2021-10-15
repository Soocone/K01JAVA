package ex04controlstatement;

public class E01If03Practice {

	public static void main(String[] args) {
		int kor=99, eng=70, math=64;
		
		double avg = (kor+eng+math) / 3.0;
		System.out.printf("평균: %f%n", avg);
		System.out.printf("평균(소수점2자리): %.2f%n", avg);
		
		if(avg>=90)
			System.out.println("A학점");
		else if(avg>=80)
			System.out.println("B학점");
		else if(avg>=70)
			System.out.println("C학점");
		else if(avg>=60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
	}
}


