package ex17collection;

/*
 문제1) QuArrayList.java 
사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 
알아내서 해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 
정보(이름,나이,학번)를 출력하여라.

 */

import java.util.LinkedList;
import java.util.Scanner;
import common.Student;
public class QuArrayList
{

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요.");
		String name = scan.nextLine();
		
		
		//2.확장for문으로 컬렉션 전체를 접근
		int index = -1;
		for(Student std : list) {
			if(name.equals(std.getName()))
				index = list.indexOf(std);
		}
		
		
		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		if(index != -1) {
			System.out.println("[검색되었습니다]");
			System.out.println("[삭제후 정보출력]");
			list.remove(index);
		}
		
		//검색결과 없을때...검색결과가 없다고 출력
		else
			System.out.println("검색 결과가 없습니다.");
		
		
		//4.전체정보 출력
		for(Student std : list) {
			std.showInfo();
		}
	}
}
