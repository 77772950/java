package java002;

import java.util.Scanner;

public class java002 {

	public static void main(String[] args) {
//		1004�� �Է��� �� ��µɶ����� �ݺ�
//		Scanner sC=new Scanner(System.in);
//		for(;;) {
//			System.out.println(">>");
//			int a=sC.nextInt();
//			if(a==1004) break;
//		}
//		System.out.println("for�� ����");
//		
//		while(true) {
//			System.out.println(">>");
//			int a=sC.nextInt();
//			if(a==1004) break;
//		}
//		System.out.println("while�� ����");
////		1.while���� for���� �̿��ؼ� ���� �������� ���α׷����� ������ ����.
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
		
////		2.� ���� ������ �������� �ٸ� ���� ������ �Ѵ�. 100�� 2�� ������ 0�̵ȴ�. 
////		����, 2�� 100�� ����̴�. 
////		100�� ��� ����� ���Ϸ��� 100���� ũ�� �� �̻� ������ ������ 1~100������ ��� ����� ���ϸ� �ȴ�.
//		for(int i=1;i<=100;i++) {
//			if(100%i==0) {
//				System.out.println(i);
//			}else continue;
//		}
//		3.�� ���� �Է¹޾� �μ��� ����� ����� ��� ����� ����. 0���� �ϳ��� ������Ű�� �μ� ��� �������� ���� ����ϸ� �ȴ�. ��µ� ���߿��� ���� ū���� �Է¹��� �μ��� �ִ�������� �Ѵ�.
		Scanner sc=new Scanner(System.in);
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		for(int i=1;i<=100;i++) {
//			if(i%num1==0 && i%num2==0) {
//				System.out.println(i);
//			}
//		}
			
//		4.�μ��� �Է¹޾� �μ��� �ִ� ������� ���ϴ� ���α׷��� ����� ����.
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		for(int i=1;i<=100;i++) {
//			if(i%n1==0 && i%n2==0) {
//				if(i>90) System.out.println(i);
//			}
//		}
//		5.����ڿ��� ���ڸ� �ϳ� �Է¹޾� �Է��� ���ڵ��� ���� 100�� �ɶ����� ����Է��� �޴ٰ� 100�� ������ �ջ��� ����ϴ� ���α׷��� �����غ���.
//		for(int i=0;i<100;) {
//			int input=sc.nextInt();
//			i+=input;
//			
//			System.out.println(i);
//		}
		
//		6.����ڿ��� ����ؼ� ���ڸ� �Է¹޾� 1~10������ ���ڸ� 3�� �Է� �� �� ���� �ݺ��Ѵ�. 
//		�Է��� ������ �߸� �Է��� ȸ���� ����� �Է��� ȸ���� ����ϰ� ����ڰ� ����� �Է��� ������ ����ϴ�  ���α׷��� ����� ����.
//		int input3;
//		int sum=0;
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<3) {
//			System.out.println("���� �Է��Ͻÿ�.");
//			input3=sc.nextInt();
//			if(input3==1 || input3==2 || input3==3 || input3==4 || input3==5 || input3==6 || input3==7 || input3==8 || input3==9 || input3==10) {
//				k++;
//				i++;
//				sum+=input3;
//			}else {
//				j++;
//			}
//			System.out.println("�߸��Է���Ƚ��>>"+j);
//			System.out.println("����� �Է��� Ƚ��>>"+k);
//			System.out.println("����� �Է��� ���� ����>>"+sum);
//		}
		
//		7.2�� ����� �ǰ� 3�� ����� �Ǵ� ������� 6,12,18,24 ���� �ִ�. ���߿��� ���� ���� �� 6�� �ּҰ���� ��� �Ѵ�. 
//		2�� ����� ���ؼ� ���� ����� 2�� ����̹Ƿ� ����� 2�� ������ 0�� �Ǹ� 2�� ����̴�.  
//		�μ��� �Է� �޾� ����� �� ���� ���� ����� �ּ� ������� ����ϴ� ���α׷��� ����� ����. 
//		1 ���� �ϳ��� �������� �Է� ���� �μ��� ��� 0���� ������ �������� ������ ����� �̰� ���� ���� ���� ã�� ���� ���� ���� ���̹Ƿ� ó�� ã������ �ּ� ������̴�.
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
		
//		8.3���� ���� �Է� �޾� ���� ���� ���� ���� ū���� ����ϴ� ���α׷��� ����� ����.
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
//		9.100������ ���а��� ������ 5�� �Է¹޾� 60���� Ż���ڰ� ������� ����ϴ� ���α׷��� ������ ����.
//		int mathScore;
//		int L=0;
//		for(int i=1;i<=5;) {
//			System.out.println("������ �Է��Ͻÿ�.");
//			mathScore=sc.nextInt();
//			if(mathScore>=60) {
//				i++;
//			}
//			else if(mathScore<60) {
//				i++;
//				L++;
//			}
//		}
//		System.out.println("Ż����: "+L+"��");
		
//		10. 1���� ���ʴ�� ���� ������ ���� 100�� �ѱ� �������� ������ ������� ������� ����Ͻÿ�. 1:1 2:3 3:6 4:10 5:15 6:21 ��  100������ ���յ��� ������ ���� ��µǸ� �ȴ�.
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
		
//		11. ���ڿ��� ���ڸ� �Է¹޾� �Է¹��� ���ڿ��� ���ڸ�ŭ ����ϴ� ���α׷��� ����� ����.
//		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		String input=sc.nextLine();
//		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		int number=sc.nextInt();
//		for(int i=0;i<number;i++) {
//			System.out.println(input);
//		}
		
//		12. �Է¹��� �μ� ������ ���ڵ��� ���� ���ϴ� ���α׷��� ����� ����.
//		int Number1=sc.nextInt();
//		int Number2=sc.nextInt();
//		int sum=0;
//		for(;Number1<Number2;Number1++) {
//			sum+=Number1;
//		}
//		System.out.println(sum);
		
//		13. �Ҽ��� 1�� �ڱ� �ڽŸ����� ���������� ���̴�. 2,3,5���� ��� 1�� ���� �ڽŸ����� ���������Ƿ� �Ҽ��̴�. ���� �ϳ� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷��� �����Ͻÿ�.
//		double s=sc.nextDouble();
//		if(s%s==0 && s%1==0) {
//			System.out.println("�Ҽ��̴�.");
//		}else {
//			System.out.println("�Ҽ��� �ƴϴ�");
//		}
//		14. �� ���� �Է� �޾� ù ��°�� ���� �����Ͽ� �ϳ��� ī��Ʈ�Ͽ� �ι�°�� �� ��ŭ ȭ�鿡 ��� �ϴ� ���α׷��� �����. 5 6�� �Է� ������ 5���� 6�� 5 6 7 8 9 10 �� ȭ�鿡 ��� �ȴ�.
//		int numberInput=sc.nextInt();
//		int numberInput2=sc.nextInt();
//		for(;numberInput<=numberInput2;numberInput++) {
//			System.out.printf("%d\n",numberInput);
//		}
		
//		15. 1~9 ������ ���ڸ� �ϳ� �Է¹޾� �ش� ������ �������� ����Ͽ� ����.
//		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		int Input=sc.nextInt();
//		for(int j=1;j<10;j++) {
//			System.out.printf("%d x %d = %d\n",Input,j,Input*j);
//		}
		
//		16. ���ڸ� �ϳ� �Է¹޾� 1~1000���̿� �Է¹��� ������ ����� �� ������ ����ϴ� ���α׷��� ����� ����.
//		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		int n3=sc.nextInt();
//		int count=0;
//		for(int i=1;i<1000;i++) {
//			if(n3%i==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//		17. ����ڿ���  ��� ���� �Է¹޾� ��� ���� ���缭 1���� 100���� ����ϴ� ���α׷��� ������ ����.
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
			
//		18. ������ ���� ��� �ǵ��� ���α׷��� �ϼ��� ����.
//		1   2   3   4   5
//		10  9   8   7   6
//		11 12  13  14  15
//		21 22  23  24  25
//		19. �ش� ���� ���� ���ϰ� �ϼ��� �Է� �޾� �޷��� ����� ����.\t ���� �̿��ؼ� ����� ����.
//		20. ��ǻ�Ͱ� ���� ������ �ո� ���� �޸� ���� ���ߴ� ���α׷��� ������ ����. ���� ȸ���� Ʋ�� ȸ���� ����ؼ� ��������.
//		21. ��ǻ�Ͱ� ���� �ֻ����� ���ߴ� ���α׷��� ������ ����. ���� ȸ���� Ʋ�� ȸ���� ����ؼ� ���� ����.


	}

}
