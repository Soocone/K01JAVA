package quiz;

/*
 게임설명 : 야구게임을 메소드를 이용하여 구현한다.
중복되지 않는 3개의 정수를 생성한다.(1~9)
사용자는 3개의 숫자를 입력한다.
생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
3 strike 가 되면 게임은 종료된다.
시도한 횟수를 표시한다.
계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들은 아래와 같이 생성하여 구현해본다.
   int com1, com2, com3;
   int user1, user2, user3;
아니면 
   int[] com = new int[3];
   int[] user = new int[3];
와 같이 배열을 사용해도 된다.

 */

import java.util.Random;
import java.util.Scanner;


public class QuBaseballGame
{
	public static void baseBallGameStart() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int strikeCount = 0;
		int ballCount = 0;
		int gameCount = 0;
		
		
		int[] com = new int[3];
		for(int i=0 ; i<com.length ; i++) {
			com[i] = (int) ((Math.random()*9) +1);
			for(int j=0 ; j<i ; j++) {
				if(com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.print("컴퓨터 선택: ");
		for(int k=0 ; k<com.length ; k++) {
			System.out.print(com[k]+ " ");
		}
		
		System.out.print("\n1~9 사이 3개의 숫자를 입력하세요");
		int[] user = new int[3];
		
		
		while(true) {
			
			strikeCount = 0;
			ballCount = 0;
			for(int j=0 ; j<user.length ; j++) {
				int userNum = scanner.nextInt();
				user[j] = userNum;
			}
			for(int i=0 ; i<com.length ; i++) {
				for(int j=0 ; j<user.length ; j++) {
					if(com[i] == user[j] && i==j) {
						strikeCount++;
					}
					else if(com[i] == user[j] && i!=j) {
						ballCount++;
					}
				}
			}
			System.out.println(strikeCount+"스트라이크 "+ballCount+"볼");
			gameCount++;
			
			
			if(strikeCount >=3) {
				System.out.println("게임 오버");
				System.out.println("게임 진행 횟수: "+gameCount);
				int restart;
				System.out.println("게임 재시작(1), 종료(0)");
				System.out.print("재시작 여부를 입력:");
				restart = scanner.nextInt();
				if(restart == 1) {
					break;
				}
				else if(restart == 0)
					return;
				else
					System.out.println("올바른 숫자를 입력하세요");
			}	
		}
	}
	
	
	public static void main(String[] args)
	{
		baseBallGameStart();
	}
}
