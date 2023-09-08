package kr.s04.operator;

public class OperatorMain05 {
	public static void main(String[] args) {
		java.util.Scanner input =
				new java.util.Scanner(System.in); //입력작업 시작
		
		System.out.print("국어:");
		//입력된 정수를 변수에 대입
		int korean = input.nextInt();
		
		System.out.print("영어:");
		int english = input.nextInt();
		
		
		System.out.print("수학:");
		int math = input.nextInt();
		
		//총점 구하기
		int sum = korean + english + math;
		//평균 구하기
		double avg = sum / 3.0; //3 으로 나누면 정수 / 정수 라서 값이 틀려짐
								//double 데이터로 만들고 싶으면 하나라도 실수로 만들어야 된다.
		
		
		System.out.printf("국어 = %d%n" , korean);
		System.out.printf("영어 = %d%n" , english);
		System.out.printf("수학 = %d%n" , math);
		System.out.printf("총점 = %d%n" , sum);
		System.out.printf("평균 = %.2f%n" , avg);
		
		
		input.close();  // 입력작업 끝
		
		
	}
}
