///내가 작성한 과제
package quiz;
/*
가위바위보 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오
숫자대신 문자를 입력할 경우 발생되는 예외를 처리하시오. 
(가위바위보 입력시, 재시작여부 입력시)
게임과 관련없는 숫자를 입력했을때 사용자정의 예외클래스를 통해 처리하시오.
예외처리 클래스명 : WrongNumberException
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


class WrongNumberException extends Exception {
	public WrongNumberException() {
		super("올바른 숫자를 입력해주세요.");
	}
}

public class QuRockPaperScissors_exception
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		while(true) {
			//1. 난수생성 - 컴퓨터입장에서 가위/바위/보
			int com = random.nextInt(100) % 3 + 1;
			System.out.println("컴퓨터:"+ com);
			
			//2. 사용자입력 
			int user = 0;
			try {
				System.out.println("가위바위보를 입력하세요.");
				System.out.print("가위(1), 바위(2), 보(3)=>");
				user = scanner.nextInt();
				if(user<1 || user>3) {
					WrongNumberException ex = new WrongNumberException();
					throw ex;
				}
			}
			catch(InputMismatchException e) {
				System.out.print("!!오류발생!!");
				scanner.nextLine();
				e.printStackTrace();
			}
			catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
			
			
			//3.승부판단		
			//사용자가 정상적으로 입력한 경우
			if(!(user<1 || user>3)) {
				//승부판단 로직2 : 입력한 수의 차를 이용해 승부를 판단한다. 
				System.out.printf("사용자:%s, 컴퓨터:%s ", displayRPS(user), displayRPS(com));	
				switch(user - com) {
				case 0:
					System.out.println("비겼습니다.");break;
				case 1: case -2:
					System.out.println("이겼습니다.");break;
				case 2: case -1:
					System.out.println("졌습니다.");break;
				}
				gameCount++;//게임카운트 증가
			}
			
			//4.게임재시작 여부 확인			 
			if(gameCount>=5) {
				int restart;
				while(true) {
					//0과 1을 입력해야지만 재시작 되도록 무한루프로 구성한다. 
					System.out.print("게임재시작(1), 종료(0):");
					try {
						restart = scanner.nextInt();
						if(restart==0 || restart==1) {
							//정상입력이면 루프탈출
							break;
						}
						else if (restart<0 || restart>1) {
							WrongNumberException ex = new WrongNumberException();
							throw ex;
						}
					}
					catch(InputMismatchException e) {
						System.out.print("!!오류발생!!");
						scanner.nextLine();
						e.printStackTrace();
					}
					catch(WrongNumberException e) {
						System.out.println(e.getMessage());
					}
				}
				if(restart==0) {
					//게임종료를 위해 while루프 탈출
					break;
				}
				
				else {
					System.out.println("게임 재시작^^");
					gameCount=0;
				}
			}	
		}			
	}	
		
	public static String displayRPS(int n) {
		String str = "";
		switch(n) {
		case 1: str="가위";break;
		case 2: str="바위";break;
		case 3: str="보";break;
		}
		return str;
	}	
}
