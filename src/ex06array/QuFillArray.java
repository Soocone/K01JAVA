package ex06array;

import java.util.Scanner;

/*
 문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 
짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

실행결과]
1번째 정수를 입력하세요:2
2번째 정수를 입력하세요:4
3번째 정수를 입력하세요:5
4번째 정수를 입력하세요:3
5번째 정수를 입력하세요:2
6번째 정수를 입력하세요:9
7번째 정수를 입력하세요:7
8번째 정수를 입력하세요:8
9번째 정수를 입력하세요:5
10번째 정수를 입력하세요:1
순서대로입력된결과
2 4 5 3 2 9 7 8 5 1 
홀수/짝수 구분입력결과
5 3 9 7 5 1 8 2 4 2 
 */
public class QuFillArray
{
	public static void main(String[] args)
	{
		int[] normal = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0 ; i<normal.length ; i++) {
			System.out.print((i+1)+"번째 정수를 입력하세요: ");
			normal[i] = scan.nextInt();
		}
		
		System.out.println("순서대로 입력된 결과");
		for(int i=0 ; i<normal.length ; i++) {
			System.out.print(normal[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("홀수/짝수 구분입력 결과");
		int[] oddeven = new int[10];
		int temp = 0;
		
		for(int i=0 ; i<normal.length ; i++) {
			if(normal[i] % 2 != 0)
				oddeven[i-temp] = normal[i];
			else {
				oddeven[oddeven.length-temp-1] = normal[i];
				temp++;
			}
		}
		
		for(int i=0 ; i<oddeven.length ; i++) 
			System.out.print(oddeven[i]+" ");
	}
}
// 고민했던 식
//System.out.println("홀수/짝수 구분입력 결과");
//for(int i=0 ; i<normal.length ; i++) {
//	if(normal[i] % 2 !=0)
//		System.out.print(normal[i]+" ");
//}
//for(int i=0 ; i<normal.length ; i++) {
//	if(normal[i] % 2 ==0)
//		System.out.print(normal[i]+" ");
//}
