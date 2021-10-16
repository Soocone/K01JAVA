package quiz;
/*
 Bubble Sort는 인접한 두 수를 비교하여 큰 수를 뒤로 보내는 간단한 
 정렬 알고리즘이다. 첫번째 자료와 두번째 자료를, 두번째 자료와 세번째 
 자료를...순차적으로 비교하여 교환한다. 
1회전을 수행하면 가장 큰수가 맨 뒤로 이동하므로 맨끝의 수는 제외하고 
다시 처음부터 비교한다. 다른 정렬 알고리즘에 비해 속도가 상당히 느린 
편이지만, 코드가 단순하므로 자주 사용된다. 원소의 이동이 거품이 수면으로 
올라오는 듯한 모습을 보이기 때문에 Bubble Sort라는 이름을 가지게 되었다.
 */

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		/*중복되지 않는 난수 10개(1~99)를 생성하여 크기가 10인 배열에 담는다.
		오름차순으로 버블정렬한다.(1, 2, 3 …… 10)
		버블정렬이란 모든 배열요소를 순차적으로 비교하여 스왑(교환)하는 
		알고리즘이다.
		단, 정렬되는 과정을 모두 출력해야 한다.
		위 그림은 버블정렬을 이용하여 오름차순으로 정렬하는 과정이다.
		*/
		Random random = new Random();
		int[] ran = new int[10];
		
		for(int i = 0 ; i<ran.length ; i++) {
			ran[i] =random.nextInt(100) % 99 + 1;
			System.out.print(ran[i] + " ");
		}
		System.out.println("");
		
		int temp;
		for(int j = 0 ; j<ran.length ; j++) {
			for(int k = 0 ; k<ran.length -j-1 ; k++) {
				if(ran[k] > ran[k+1]) {
					temp = ran[k];
					ran[k] = ran[k+1];
					ran[k+1] = temp;
				}
			}
			for(int n : ran) {
				System.out.print(n+ " ");
			}
			System.out.println("");
		}
		
		System.out.println("버블정렬 결과:");
		for(int m : ran) {
			System.out.print(m+ " ");
		}
	}
}
