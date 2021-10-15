package quiz;

import java.util.Scanner;

/*
 게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
 */
public class QuRockPaperScissors
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = 1;
			
		while(true) {
			
			int cumChoice = ((int)((Math.random()*100) % 3)+1);
			System.out.println("컴퓨터 선택:"+cumChoice);
			
			System.out.println("무엇을 내겠습니까?");
			int myChoice = scan.nextInt();
			
			if(myChoice >= 4 || myChoice == 0) {
				System.out.println("똑바로 내세요.");
			}
			
			else if(myChoice == cumChoice) {
				System.out.println("비겼습니다.");
				count++;
			}
				
			//////가위(1),바위(2),보(3)
			else if(myChoice == 1){
				if(cumChoice == 3)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");
				count++;
			}
				
			else if(myChoice == 2){
				if(cumChoice == 1)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");
				count++;
			}
			
			else if(myChoice == 3){
				if(cumChoice == 2)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");
				count++;
			}
			
			if(count == 6) {
				System.out.println("5번의 게임이 끝났습니다. 계속 하시겠습니까? "
						+ "재시작(1), 종료(0) :");
				Scanner scanner = new Scanner(System.in);
				int finalChoice = scanner.nextInt();
				
				while(finalChoice >=2) {
					System.out.println("올바른 숫자를 다시 입력하세요.");
					finalChoice = scanner.nextInt();
				}
				if(finalChoice == 1)
					count=1;
					
				else break;
			}
		}
	}
}
