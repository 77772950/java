package com.human.ex;
import java.util.Scanner;

public class BlackJack {
	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1GEnd=false; //ī�带 ���� ������ ���� 
	public static boolean isP2GEnd=false;
	public static String cardShape[]= {"�����̵�","���̾�","��Ʈ","Ŭ�ι�"};
	public static String cardNumber[]= 
		{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public static void newCard() {
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		deckIndex=52; p1DeckIndex=0; p2DeckIndex=0;
		isP1GEnd=isP2GEnd=false;
	}
	public static void mixCard() {
		for(int i=0;i<10000;i++) {
			int randomIndex=(int)(Math.random()*52);
			int temp=deck[0];
			deck[0]=deck[randomIndex];
			deck[randomIndex]=temp;
		}
	}
	public static void displayDeckCard() {
		for(int i=0;i<deckIndex;i++) {
			System.out.println(cardShape[deck[i]/13]+" "+
						cardNumber[deck[i]%13]);
		}
	}
	public static void displayP1Card() {
		System.out.println("p1Card : ");
		for(int i=0;i<p1DeckIndex;i++) {
			System.out.println(cardShape[p1Deck[i]/13]+" "+
						cardNumber[p1Deck[i]%13]+",");
		}
		System.out.println("   ���� ���� : "+p1Score());
	}
	public static void displayP2Card() {
		System.out.println("p2Card : ");
		for(int i=0;i<p2DeckIndex;i++) {
			System.out.println(cardShape[p2Deck[i]/13]+" "+
						cardNumber[p2Deck[i]%13]+",");
		}
		System.out.println("   ���� ���� : "+p2Score());
	}
	public static void getP1Card() {
		Scanner sc=new Scanner(System.in);
		//deck�迭���� p1Deck���� ī�� �ű��
		//deck�� ������ �ִ� ī����� deckIndex
		//p1Deck�� ������ �ִ� ī����� p1DeckIndex
		boolean isP1Flag=true;
		System.out.println("player1");
		while(isP1Flag) {
			System.out.println("ī��ޱ� 1.yes 2.no");
			int getCardC=sc.nextInt();
			if(getCardC==1) {
				p1Deck[p1DeckIndex]=deck[deckIndex-1];
				deckIndex--;
				p1DeckIndex++;
				displayP1Card();
				if(p1Score()>=17) {
					System.out.println("������ 17���̻��̹Ƿ� �� �̻� ī�带 ���� �� �����ϴ�.");
					isP1Flag=false;
				}
			}else {
				isP1Flag=false;
			}
		}
	}
//	public static void getCard() {// �� Ǯ��
//		Scanner sc=new Scanner(System.in);
//		//deck�迭���� p1Deck���� ī�� �ű��
//		//deck�� ������ �ִ� ī����� deckIndex
//		//p1Deck�� ������ �ִ� ī����� p1DeckIndex
//		boolean isP1Flag=true;
//		
//		while(isP1Flag) {
//			System.out.println("player1");
//			System.out.println("ī��ޱ� 1.yes 2.no");
//			int getCardC=sc.nextInt();
//			if(getCardC==1) {
//				p1Deck[p1DeckIndex]=deck[deckIndex-1];
//				deckIndex--;
//				p1DeckIndex++;
//				displayP1Card();
//				if(p1Score()>=17 && 21>=p1Score()) {
//					System.out.println("������ 17���̻��̹Ƿ� �� �̻� ī�带 ���� �� �����ϴ�.");
//					isP1Flag=false;
//				}else if(p1Score()>21) {
//					System.out.println("������ 21���� �ʰ��Ͽ� ������ ����˴ϴ�.");
//					break;
//				}
//			}else if(getCardC==2){
//				isP1Flag=false;
//			}
//			System.out.println("player2");
//			System.out.println("ī��ޱ� 1.yes 2.no");
//			getCardC=sc.nextInt();
//			if(getCardC==1) {
//				p2Deck[p2DeckIndex]=deck[deckIndex-1];
//				deckIndex--;
//				p2DeckIndex++;
//				displayP2Card();
//				if(p2Score()>=17 && 21>=p2Score()) {
//					System.out.println("������ 17���̻��̹Ƿ� �� �̻� ī�带 ���� �� �����ϴ�.");
//					isP1Flag=false;
//				}else if(p2Score()>21) {
//					System.out.println("������ 21���� �ʰ��Ͽ� ������ ����˴ϴ�.");
//					break;
//				}
//			}else if(getCardC==2){
//				isP1Flag=false;
//			}
//				
//				
//			
//		}
//	}
	public static void getP2Card() {
		//deck�迭���� p2Deck���� ī�� �ű��
		Scanner sc=new Scanner(System.in);
		boolean isP2Flag=true;
		System.out.println("player2");
		while(isP2Flag) {
			System.out.println("ī��ޱ� 1.yes 2.no");
			int getCardC=sc.nextInt();
			if(getCardC==1) {				
				p2Deck[p2DeckIndex]=deck[deckIndex-1];
				deckIndex--;
				p2DeckIndex++;
				displayP2Card();
				if(p2Score()>=17) {
					System.out.println("������ 17���̻��̹Ƿ� �� �̻� ī�带 ���� �� �����ϴ�.");
					isP2Flag=false;
				}
			}else {
				isP2Flag=false;
			}
		
		}
		
	}
	public static int p1Score() {
		int returnValue=0;
		//A 1 or 11
		//J Q K 10���� 
		//�������� �״��
		for(int i=0;i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) countNum=10;
			returnValue+=countNum;
		}
		for(int i=0;i<p1DeckIndex;i++) {
			if(p1Deck[i]%13==0) {//A�� ������
				if((returnValue+10) >21) {//A�� 11�� �����ؼ� 21���� ũ��
				}
				else {
					returnValue=returnValue+10;
				}
				break;
			}
		}
		return returnValue;
	}
	public static int p2Score() {
		int returnValue=0;
		for(int i=0;i<p2DeckIndex;i++) {
			int countNum=p2Deck[i]%13+1;
			if(countNum>10) countNum=10;
			returnValue+=countNum;
		}
		for(int i=0;i<p2DeckIndex;i++) {
			if(p2Deck[i]%13==0) {//A�� ������
				if((returnValue+10) >21) {//A�� 11�� �����ؼ� 21���� ũ��
				}
				else {
					returnValue=returnValue+10;
				}
				break;
			}
		}
		
		return returnValue;
	}
	public static void play() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			//p1ī��ޱ�
			System.out.println(i+"��° Card ������...");
			if(!isP1GEnd) {
				System.out.println("ī�带 �����ðڽ��ϱ�? 1.yer 2.no");
				int a=sc.nextInt();
				if(1==a) {
					getP1Card();
					if(p1Score()>21) break;									
				}else isP1GEnd=true;
			}			
			
			// p2ī��ޱ�
			System.out.println(i+"��° Card ������...");
			if(!isP2GEnd) {
				System.out.println("ī�带 �����ðڽ��ϱ�? 1.yer 2.no");
				int a=sc.nextInt();
				if(1==a) {
					getP2Card();
					if(p2Score()>21) break;										
				}else isP2GEnd=true;				
			}			
			
			if(isP1GEnd&&isP2GEnd) break;
			displayP1Card();
			displayP2Card();
		}
	}
	public static void displayGEnd() {
		String result="";
		displayP1Card();
		displayP2Card();
		if(p1Score()>21) {
			result="p2�� �¸��Ͽ����ϴ�.";
		}else if(p2Score()>21) {
			result="p1�� �¸��Ͽ����ϴ�.";
		}else if(p1Score()<p2Score()) {
			result="p2�� �¸��Ͽ����ϴ�.";
		}else if(p1Score()==p2Score()) {
			result="���º�";
		}else {
			result="p1�� �¸��Ͽ����ϴ�.";
		}
		System.out.println("���Ӱ��: "+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {//������ ����� �� ��� �� ������ ����
			//���ο� ī��1�� ���� 
			newCard();
			//ī�带 ���´�.
			mixCard();
			//ī�庸���ֱ�
	//		displayDeckCard();
			//���ӽ���
			play();
			int i=sc.nextInt();
			if(i==0) break;
			//���к����ֱ�
			displayGEnd();
		}
			
		
//		getCard();
//		System.out.println("---------------");
//		displayP1Card();
//		displayP2Card();
//		System.out.println("player1: "+p1Score());
//		System.out.println("player2: "+p2Score());
//		if(p1Score()<21 && p2Score()<21 && p1Score()>p2Score()) 
//			System.out.println("player1 *Win*");
//		else if(p1Score()<=21 && p2Score()<=21 && p2Score()>p1Score()) 
//			System.out.println("player2 *Win*");
//		else if(p1Score()>21) System.out.println("player2 *Win*");
//		else if(p2Score()>21) System.out.println("player1 *Win*");
//		else if(p1Score()==p2Score()) System.out.println("���º�");
//		System.out.println("---------------");
		
	}
	
}
