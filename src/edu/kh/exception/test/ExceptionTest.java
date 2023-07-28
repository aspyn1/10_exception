package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력(0입력 시 종료) :");
			int input = sc.nextInt();
			
			// 컴파일 에러 -> 개발자가 코드 잘못쓴것
			// 자료형이 맞지않아 연산을 못해서 "컴파일 에러"가 발생. 코드틀림
//			int a = 00.9;
			int a = (int)00.9; // 코드로 수정 가능
			
			if(input == 0) {
				break;
			}
			
		}
		
		
		// 런타임에러 예제
		// 런타임 에러 : 프로그램 수행 중 발생하는 에러
		// 				주로 if문으로 처리가 가능하다.
		
		int[] arr = new int[3]; 
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;
		// java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		
		if(3 >= arr.length) {// 배열 인댁스 범위 초과 시
			System.out.println("배열 범위를 초과했습니다");
		}else {
			arr[3] = 40;
		}
	}

}
