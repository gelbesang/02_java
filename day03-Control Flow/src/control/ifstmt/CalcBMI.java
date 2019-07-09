package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double weight;
		double height;
		double bmi;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게와 키를 입력하세요. :");
		weight = scan.nextDouble();
		height = scan.nextDouble();
		bmi = weight / (height * height);
		
		if(bmi < 15) {
			System.out.printf("병적인 멸치");
		}else if(18.5< bmi) {
			System.out.printf("멸치");			
		}else if(23 < bmi) {
			System.out.printf("휴먼");
		}else if(27.5 < bmi) {
			System.out.println("과체중");
		}else if(40 < bmi) {
			System.out.println("고래");
		}else {
			System.out.println("대왕고래");
		}
		   scan.close();

	}

}
