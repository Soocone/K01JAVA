package quiz;

import java.util.Random;

public class SelectionSort
{
	public static void main(String[] args)
	{
		Random ran = new Random();
		int[] arr = new int[10];
		
		//난수 생성 및 중복 체크
		while(true) {
			for(int i=0 ; i<arr.length ; i++) {
				arr[i] = ran.nextInt(100)+1;
			}
			
			boolean checkBool = false;
			for(int i=0 ; i<arr.length ; i++) {
				for(int j=0 ; j<arr.length ; j++) {
					if(arr[i]==arr[j] && i!=j) {
						checkBool = true;
					}
				}
			}
			if(checkBool==false) break;
		}
		
		//난수 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//선택정렬
		int temp;
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			int minindex = i;
			for(int j=i+1 ; j<(arr.length) ; j++) {
				if(arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			temp= arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
			
			
			for(int k=0 ; k<arr.length ; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
			
		//최종 정렬 결과 
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
