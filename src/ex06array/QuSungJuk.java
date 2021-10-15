package ex06array;

import java.util.Scanner;

import ex01start.E02SystemOutPrintln;

/*
 문제1) 파일명 : QuSungJuk.java
다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

 */
public class QuSungJuk
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요.");
		int person = scan.nextInt();
		System.out.println("학생수: "+person);
		
		int[][] score = new int[person][3];
		for(int i=0 ; i<score.length ; i++) {
				System.out.println((i+1)+"번째 학생의 점수 입력");
				System.out.print("국어 점수 입력?");
				score[i][0] = scan.nextInt();
				System.out.print("영어 점수 입력?");
				score[i][1] = scan.nextInt();
				System.out.print("수학 점수 입력?");
				score[i][2] = scan.nextInt();
		}
		System.out.printf("==========================\n");
		
		System.out.println("NO KOR ENG MAT TOT AVG");
		
		for(int i=0; i<score.length ; i++) {
			int sum = score[i][0]+score[i][1]+score[i][2];
			System.out.printf("%2d %3d %3d %3d %3d %.1f",
					(i+1), score[i][0], score[i][1], score[i][2],
					sum, (sum/3.0));
			System.out.println();
		}
		System.out.printf("==========================\n");
	}
}
