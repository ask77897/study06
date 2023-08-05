package project06;

import java.util.Scanner;

public class class32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cardGame = {"거지", "시민", "귀족", "왕"};
		int score = 0;
		int hr1 = 0;
		
		for(int i=0; i<4; i++) {
			int player1 = Set(1);
			int player2 = Set(2);
			score += Play(player1, player2);
			if(score > 10||score < -10) {
				break;
			}
			
		}
		printSC(score);

	}//main

	static int Set(int player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("카드: {1.거지, 2.시민, 3.귀족, 4.왕}");
		System.out.print("플레이어"+player+" 차례 : ");
		player = sc.nextInt();
		return player;
	}
	
	static int Play(int player1, int player2) {
		if((player1 == 1 && player2 == 4) || (player1 == 4 && player2 == 1)) {
			System.out.println("거지와 왕이 만났습니다.");
			if(player1 == 1) {
				return 100;
			}else if(player2 == 1) {
				return -100;
			}
			
		}
		if(player1 > player2) {
			return 1;
			
		}else if(player2 > player1) {
			return -1;
		}
		return 0;
	}
	
	static void printSC(int score) {
//		System.out.println("Player1의 점수는 " + score1 + " 입니다.");
//		System.out.println("Player2의 점수는 " + score2 + " 입니다.");
		if(score > 10) {
			System.out.println("Player1이 히든 룰로 승리!");
		}else if(score <- 10) {
			System.out.println("Player2이 히든 룰로 승리!");
		}else if(score > 0) {
			System.out.println("Player1 이 승리하였습니다.");
		}else if(0 > score) {
			System.out.println("Player2 가 승리하였습니다.");
		}else {
			System.out.println("무승부입니다.");
		}
	}
}

//지역변수 -> 특정 지역에서만 사용가능
//전역변수 -> 전지역에서 사용가능

//전역변수로 작성하게 되면, 장점 : 모든 곳에서 접근이 가능하다. 단점 : 모든 곳에서 접근이 가능하다.(보안성이 취약)
//
//지역변수 할 때, 함수 안과 밖 구분이 어려워요.
//변수가 선언된 위치 <- 어디의 지역변수
//지역의 구분은 항상 {} 사이
//변수 선언 -> 1. {} 사이, 2. () 사이 -> 옆에 보면 {}
