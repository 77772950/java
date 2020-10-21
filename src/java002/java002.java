package java002;

import java.util.Scanner;

public class java002 {

	public static void main(String[] args) {
//		1004를 입력한 후 출력될때까지 반복
//		Scanner sC=new Scanner(System.in);
//		for(;;) {
//			System.out.println(">>");
//			int a=sC.nextInt();
//			if(a==1004) break;
//		}
//		System.out.println("for문 종료");
//		
//		while(true) {
//			System.out.println(">>");
//			int a=sC.nextInt();
//			if(a==1004) break;
//		}
//		System.out.println("while문 종료");
////		1.while문과 for문을 이용해서 왼쪽 순서도를 프로그램으로 구현해 보자.
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+","+b);
//		while(b<15) {
//			a+=1;
//			b+=a;
//		}
//		System.out.println(a+","+b);
//		
//		int a2=2;
//		int b2=1;
//		b2++;
//		System.out.println(a2+","+b2);
//		for(;;) {
//			if(b2<15) {
//				a2+=1;
//				b2+=a2;
//			}else break;
//		}
//		System.out.println(a2+","+b2);
		
////		2.어떤 수가 나누어 떨어지는 다른 수를 약수라고 한다. 100을 2로 나누면 0이된다. 
////		따라서, 2는 100의 약수이다. 
////		100의 모든 약수를 구하려면 100보다 크면 더 이상 나눌수 없으니 1~100사이의 모든 약수를 구하면 된다.
//		for(int i=1;i<=100;i++) {
//			if(100%i==0) {
//				System.out.println(i);
//			}else continue;
//		}
//		3.두 수를 입력받아 두수의 공통된 약수를 모두 출력해 보자. 0부터 하나씩 증가시키며 두수 모두 나눠지는 수를 출력하면 된다. 출력된 수중에서 가장 큰수를 입력받은 두수의 최대공약수라고 한다.
		Scanner sc=new Scanner(System.in);
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		for(int i=1;i<=100;i++) {
//			if(i%num1==0 && i%num2==0) {
//				System.out.println(i);
//			}
//		}
			
//		4.두수를 입력받아 두수의 최대 공약수를 구하는 프로그램을 만들어 보자.
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		for(int i=1;i<=100;i++) {
//			if(i%n1==0 && i%n2==0) {
//				if(i>90) System.out.println(i);
//			}
//		}
//		5.사용자에게 숫자를 하나 입력받아 입력한 숫자들의 합이 100이 될때까지 계속입력을 받다가 100이 넘으면 합산을 출력하는 프로그램을 구현해보자.
//		for(int i=0;i<100;) {
//			int input=sc.nextInt();
//			i+=input;
//			
//			System.out.println(i);
//		}
		
//		6.사용자에게 계속해서 숫자를 입력받아 1~10사이의 숫자를 3번 입력 할 때 까지 반복한다. 
//		입력이 끝나면 잘못 입력한 회수와 제대로 입력한 회수를 출력하고 사용자가 제대로 입력한 총합을 출력하는  프로그램을 만들어 보자.
//		int input3;
//		int sum=0;
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<3) {
//			System.out.println("값을 입력하시오.");
//			input3=sc.nextInt();
//			if(input3==1 || input3==2 || input3==3 || input3==4 || input3==5 || input3==6 || input3==7 || input3==8 || input3==9 || input3==10) {
//				k++;
//				i++;
//				sum+=input3;
//			}else {
//				j++;
//			}
//			System.out.println("잘못입력한횟수>>"+j);
//			System.out.println("제대로 입력한 횟수>>"+k);
//			System.out.println("제대로 입력한 수의 총합>>"+sum);
//		}
		
//		7.2의 배수도 되고 3의 배수도 되는 공배수는 6,12,18,24 등이 있다. 이중에서 가장 작은 수 6를 최소공배수 라고 한다. 
//		2에 어떤수를 곱해서 나온 결과가 2의 배수이므로 어떤수를 2로 나누어 0이 되면 2의 배수이다.  
//		두수를 입력 받아 공배수 중 가장 작은 배수를 최소 공배수를 출력하는 프로그램을 만들어 보자. 
//		1 부터 하나씩 증가시켜 입력 받은 두수가 모두 0으로 나누어 떨어지는 수들은 공배수 이고 이중 가장 먼저 찾은 수가 가장 작은 수이므로 처음 찾은수가 최소 공배수이다.
//		int two=sc.nextInt();
//		int three=sc.nextInt();
//		int i;
//		for(i=50;i>0;i--) {
//			if(i%two==0 && i%three==0) {
//				
//				if(i>0 && i<10) {
//					System.out.println(i);
//				}
//			}
//		}
		
//		8.3개의 수를 입력 받아 가장 작은 수와 가장 큰수를 출력하는 프로그램을 만들어 보자.
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int num3=sc.nextInt();
//		if(num1>num2&&num2>num3) {
//			System.out.println(num3+","+num1);
//		}else if(num2>num1 && num2>num3 && num1>num3) {
//			System.out.println(num3+","+num2);
//		}else if(num2>num1 && num2>num3 && num1<num3) {
//			System.out.println(num1+","+num2);
//		}else if(num1<num2&&num2<num3) {
//			System.out.println(num1+","+num3);
//		}else if(num1>num2 && num2<num3 && num1>num3) {
//			System.out.println(num2+","+num1);
//		}else if(num1>num2 && num2<num3 && num1<num3) {
//			System.out.println(num2+","+num3);
//		}
//		9.100이하의 수학과목 점수를 5번 입력받아 60이하 탈락자가 몇명인지 출력하는 프로그램을 구현해 보자.
//		int mathScore;
//		int L=0;
//		for(int i=1;i<=5;) {
//			System.out.println("점수를 입력하시오.");
//			mathScore=sc.nextInt();
//			if(mathScore>=60) {
//				i++;
//			}
//			else if(mathScore<60) {
//				i++;
//				L++;
//			}
//		}
//		System.out.println("탈락자: "+L+"명");
		
//		10. 1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 결과값을 순서대로 출력하시오. 1:1 2:3 3:6 4:10 5:15 6:21 …  100이전의 총합들을 다음과 같이 출력되면 된다.
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			sum+=i;
//			if(sum<=100) {
//				System.out.println(i+":"+sum);
//			}else {
//				break;
//			}
//			
//		}
		
//		11. 문자열과 숫자를 입력받아 입력받은 문자열을 숫자만큼 출력하는 프로그램을 만들어 보자.
//		System.out.println("문자를 입력하시오.");
//		String input=sc.nextLine();
//		System.out.println("숫자를 입력하시오.");
//		int number=sc.nextInt();
//		for(int i=0;i<number;i++) {
//			System.out.println(input);
//		}
		
//		12. 입력받은 두수 사이의 숫자들의 합을 구하는 프로그램을 만들어 보자.
//		int Number1=sc.nextInt();
//		int Number2=sc.nextInt();
//		int sum=0;
//		for(;Number1<Number2;Number1++) {
//			sum+=Number1;
//		}
//		System.out.println(sum);
		
//		13. 소수는 1과 자기 자신만으로 나누어지는 수이다. 2,3,5같은 경우 1과 본인 자신만으로 나누어지므로 소수이다. 수를 하나 입력받아 소수인지 아닌지 판별하는 프로그램을 구현하시오.
//		double s=sc.nextDouble();
//		if(s%s==0 && s%1==0) {
//			System.out.println("소수이다.");
//		}else {
//			System.out.println("소수가 아니다");
//		}
//		14. 두 수를 입력 받아 첫 번째수 부터 시작하여 하나씩 카운트하여 두번째수 수 만큼 화면에 출력 하는 프로그램을 만든다. 5 6를 입력 받으면 5부터 6개 5 6 7 8 9 10 이 화면에 출력 된다.
//		int numberInput=sc.nextInt();
//		int numberInput2=sc.nextInt();
//		for(;numberInput<=numberInput2;numberInput++) {
//			System.out.printf("%d\n",numberInput);
//		}
		
//		15. 1~9 사이의 숫자를 하나 입력받아 해당 숫자의 구구단을 출력하여 보자.
//		System.out.println("숫자를 입력하시오.");
//		int Input=sc.nextInt();
//		for(int j=1;j<10;j++) {
//			System.out.printf("%d x %d = %d\n",Input,j,Input*j);
//		}
		
//		16. 숫자를 하나 입력받아 1~1000사이에 입력받은 숫자의 배수가 몇 개인지 출력하는 프로그램을 만들어 보자.
//		System.out.println("숫자를 입력하시오.");
//		int n3=sc.nextInt();
//		int count=0;
//		for(int i=1;i<1000;i++) {
//			if(n3%i==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//		17. 사용자에게  행과 열을 입력받아 행과 열에 맞춰서 1부터 100까지 출력하는 프로그램을 구현해 보자.
		int x=sc.nextInt();
//		int[] x2=new int[x];
		int y=sc.nextInt();
//		int[] y2=new int[y];
		int count=0;
		for(int j=1;j<=x;j++) {
			for(int k=1;k<=y;k++) {
//				count++;
				System.out.println("*");
			}
			System.out.println("");
		}
			
//		18. 다음과 같이 출력 되도록 프로그램을 완성해 보자.
//		1   2   3   4   5
//		10  9   8   7   6
//		11 12  13  14  15
//		21 22  23  24  25
//		19. 해당 달의 시작 요일과 일수를 입력 받아 달력을 출력해 보자.\t 탭을 이용해서 만들어 보자.
//		20. 컴퓨터가 던진 동전이 앞면 인지 뒷면 인지 맞추는 프로그램을 구현해 보자. 맞춘 회수와 틀린 회수를 기록해서 보여주자.
//		21. 컴퓨터가 던진 주사위를 맞추는 프로그램을 구현해 보자. 맞춘 회수와 틀린 회수를 기록해서 보여 주자.


	}

}
