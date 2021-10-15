///내가 작성한 과제
package quiz;
/*
 게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 
제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


class NumberRangeException extends Exception {
	public NumberRangeException() {
		super("올바른 숫자를 입력해주세요.");
	}
}

public class QuUpDownGame
{
	public static void main(String[] args) 
	{
		System.out.println("UP DOWN 게임을 시작합니다.");
		try
		{
			upDownGame();
		} 
		catch (NumberRangeException ex)
		{
			System.out.println(ex.getMessage());;
		}
		System.out.println("게임이 종료되었습니다.");
	}
	
	
	public static void upDownGame() throws NumberRangeException{
		Random random = new Random();
		int com = random.nextInt(100);
		System.out.println("1~100 사이의 숫자를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		int gameCount = 0;
		
		while(true) {
			
			int user = 0;
			try {
				user = scan.nextInt();
				if(user<1 || user>100) {
					NumberFormatException ex = new NumberFormatException();
					throw ex;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("!!문자입력금지!!");
				scan.nextLine();
				e.printStackTrace();
			}
			catch(NumberFormatException ex) {
				System.out.println(ex.getMessage());
			}
			
			
			if(user<=100 && user>=1) {
				if(com > user) 
					System.out.println("UP");
				else if(com < user) 
					System.out.println("DOWN");
				else
					System.out.println("정답입니다.");
				gameCount++;
			}
			
			
			if(gameCount >= 7) {
				System.out.println("게임횟수 초과. 미션 실패입니다.");
				int finalChoice;
				while(true) {
					System.out.println("게임재시작(1), 종료(0):");
					try {
						finalChoice = scan.nextInt();
						if(finalChoice == 0 || finalChoice == 1) {
							break;
						}
						else if(user<0 || user>2) {
							NumberRangeException ex = new NumberRangeException();
							throw ex;
						}
					}
					catch(InputMismatchException e) {
						System.out.println("!!문자입력금지!!");
						scan.nextLine();
						e.printStackTrace();
					}
					catch(NumberFormatException ex) {
						System.out.println(ex.getMessage());
					}
					
				}
				if(finalChoice==0) {
					//게임종료를 위해 while루프 탈출
					break;
				}
				else {
					System.out.println("게임을 재시작합니다.");
					gameCount=0;
				}
			}
		}
	}
}
