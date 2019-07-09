package control.swtchstmt;

import java.util.Scanner;

/**
 * 입력 된 점수에 대한 학점을 계산
 * switch 구문을 사용
 * ----------------------------------------------
 * A : 90점 이상
 * B : 80 ~ 89점 사이
 * C : 60 ~ 79점 사이
 * D : 40 ~ 59점 사이
 * F : 40점 이하 나머지
 * ---------------------------------------------
 * printf로 출력
 * 
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0 ~ 100 사이의 정수를 입력:");
		score = scan.nextInt();

		switch(score / 10) // expr 식 
		{
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 6:
		case 7:
			grade = 'C';
			break;
		case 4:
		case 5:
			grade = 'D';
			break;
		default: 
			grade = 'F';
		}
		System.out.printf("입력값 :" + score + "은 ");
		System.out.println("점수 : " + score + "\t학점 : " + grade);

		   scan.close();

	}

}
