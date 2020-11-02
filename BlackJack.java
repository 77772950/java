package com.human.ex;
import java.util.Scanner;

public class BlackJack {
	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1GEnd=false; //카드를 받을 것인지 여부 
	public static boolean isP2GEnd=false;
	public static String cardShape[]= {"스페이드","다이아","하트","클로버"};
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
		System.out.println("   현재 점수 : "+p1Score());
	}
	public static void displayP2Card() {
		System.out.println("p2Card : ");
		for(int i=0;i<p2DeckIndex;i++) {
			System.out.println(cardShape[p2Deck[i]/13]+" "+
						cardNumber[p2Deck[i]%13]+",");
		}
		System.out.println("   현재 점수 : "+p2Score());
	}
	public static void getP1Card() {
		Scanner sc=new Scanner(System.in);
		//deck배열에서 p1Deck으로 카드 옮기기
		//deck이 가지고 있는 카드수는 deckIndex
		//p1Deck이 가지고 있는 카드수는 p1DeckIndex
		boolean isP1Flag=true;
		System.out.println("player1");
		while(isP1Flag) {
			System.out.println("카드받기 1.yes 2.no");
			int getCardC=sc.nextInt();
			if(getCardC==1) {
				p1Deck[p1DeckIndex]=deck[deckIndex-1];
				deckIndex--;
				p1DeckIndex++;
				displayP1Card();
				if(p1Score()>=17) {
					System.out.println("점수가 17점이상이므로 더 이상 카드를 받을 수 없습니다.");
					isP1Flag=false;
				}
			}else {
				isP1Flag=false;
			}
		}
	}
//	public static void getCard() {// 내 풀이
//		Scanner sc=new Scanner(System.in);
//		//deck배열에서 p1Deck으로 카드 옮기기
//		//deck이 가지고 있는 카드수는 deckIndex
//		//p1Deck이 가지고 있는 카드수는 p1DeckIndex
//		boolean isP1Flag=true;
//		
//		while(isP1Flag) {
//			System.out.println("player1");
//			System.out.println("카드받기 1.yes 2.no");
//			int getCardC=sc.nextInt();
//			if(getCardC==1) {
//				p1Deck[p1DeckIndex]=deck[deckIndex-1];
//				deckIndex--;
//				p1DeckIndex++;
//				displayP1Card();
//				if(p1Score()>=17 && 21>=p1Score()) {
//					System.out.println("점수가 17점이상이므로 더 이상 카드를 받을 수 없습니다.");
//					isP1Flag=false;
//				}else if(p1Score()>21) {
//					System.out.println("점수가 21점을 초과하여 게임이 종료됩니다.");
//					break;
//				}
//			}else if(getCardC==2){
//				isP1Flag=false;
//			}
//			System.out.println("player2");
//			System.out.println("카드받기 1.yes 2.no");
//			getCardC=sc.nextInt();
//			if(getCardC==1) {
//				p2Deck[p2DeckIndex]=deck[deckIndex-1];
//				deckIndex--;
//				p2DeckIndex++;
//				displayP2Card();
//				if(p2Score()>=17 && 21>=p2Score()) {
//					System.out.println("점수가 17점이상이므로 더 이상 카드를 받을 수 없습니다.");
//					isP1Flag=false;
//				}else if(p2Score()>21) {
//					System.out.println("점수가 21점을 초과하여 게임이 종료됩니다.");
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
		//deck배열에서 p2Deck으로 카드 옮기기
		Scanner sc=new Scanner(System.in);
		boolean isP2Flag=true;
		System.out.println("player2");
		while(isP2Flag) {
			System.out.println("카드받기 1.yes 2.no");
			int getCardC=sc.nextInt();
			if(getCardC==1) {				
				p2Deck[p2DeckIndex]=deck[deckIndex-1];
				deckIndex--;
				p2DeckIndex++;
				displayP2Card();
				if(p2Score()>=17) {
					System.out.println("점수가 17점이상이므로 더 이상 카드를 받을 수 없습니다.");
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
		//J Q K 10으로 
		//나머지는 그대로
		for(int i=0;i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) countNum=10;
			returnValue+=countNum;
		}
		for(int i=0;i<p1DeckIndex;i++) {
			if(p1Deck[i]%13==0) {//A가 있으면
				if((returnValue+10) >21) {//A를 11로 변경해서 21보다 크면
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
			if(p2Deck[i]%13==0) {//A가 있으면
				if((returnValue+10) >21) {//A를 11로 변경해서 21보다 크면
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
			//p1카드받기
			System.out.println(i+"번째 Card 수령중...");
			if(!isP1GEnd) {
				System.out.println("카드를 받으시겠습니까? 1.yer 2.no");
				int a=sc.nextInt();
				if(1==a) {
					getP1Card();
					if(p1Score()>21) break;									
				}else isP1GEnd=true;
			}			
			
			// p2카드받기
			System.out.println(i+"번째 Card 수령중...");
			if(!isP2GEnd) {
				System.out.println("카드를 받으시겠습니까? 1.yer 2.no");
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
			result="p2가 승리하였습니다.";
		}else if(p2Score()>21) {
			result="p1이 승리하였습니다.";
		}else if(p1Score()<p2Score()) {
			result="p2가 승리하였습니다.";
		}else if(p1Score()==p2Score()) {
			result="무승부";
		}else {
			result="p1이 승리하였습니다.";
		}
		System.out.println("게임결과: "+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {//게임이 종료된 후 계속 할 것인지 여부
			//새로운 카드1벌 생성 
			newCard();
			//카드를 섞는다.
			mixCard();
			//카드보여주기
	//		displayDeckCard();
			//게임시작
			play();
			int i=sc.nextInt();
			if(i==0) break;
			//승패보여주기
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
//		else if(p1Score()==p2Score()) System.out.println("무승부");
//		System.out.println("---------------");
		
	}
	
}
