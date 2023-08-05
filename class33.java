package project06;

import java.util.Scanner;

public class class33 {

	public static void main(String[] args) {
//		class33_1 kim = new class33_1("Kim", 23);//kim.name = "Kim"; kim.age = 23;
//		class33_1 lee = new class33_1("Choi", 12);//choi.name = "Choi"; choi.age = 12;
//		class33_1 choi = new class33_1("Lee", 34);//lee.name = "Lee"; lee.age = 34;
		
//		System.out.println("이름: "+kim.name+", 나이: "+kim.age);
//		kim.speak();
//		kim.run();
//		kim.eat();
//		System.out.println("이름: "+choi.name+", 나이: "+choi.age);
//		choi.speak();
//		choi.run();
//		choi.eat();
//		System.out.println("이름: "+lee.name+", 나이: "+lee.age);
//		lee.speak();
//		lee.run();
//		lee.eat();
		
		
//		class33_2 animal1 = new class33_2("야옹이", "고양이", 3);
//		class33_2 animal2 = new class33_2("멍멍이", "강아지", 5);
//		class33_2 animal3 = new class33_2("짹짹이", "새", 2);
//		
//		animal1.speak();
//		animal1.wlk();
//		animal1.trt();
//		animal1.slp();
//		animal2.speak();
//		animal2.wlk();
//		animal2.trt();
//		animal2.slp();
//		animal3.speak();
//		animal3.wlk();
//		animal3.trt();
//		animal3.slp();
		
		class33_3 p1 = new class33_3("Seon", 1);
		class33_4 m1 = new class33_4("멧돼지", 100);
		p1.infor();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i>=0; i++) { 
			System.out.println("몬스터가 나타났습니다. 전투를 시작하겠습니까? (y, n) :");
			m1.printInfo();
			
			String fightYN = sc.next();
			
			if(fightYN.equals("y")) {
				p1.fight();
				p1.clear((int)(Math.random()*90)+10);
			} else {
				m1.attack();
				p1.avoid();
			}
		}
		
		
		
	}

}


//클래스와 객체
//클래스 -> 파일, 설계도
//객체 -> 설계도를 사용하여 만든 것.

//생성자
//생성할 때, 객체한테 값을 전달해주는 것. (객체한테 만들어질때, 첨부파일 전달)
//