package project06;

public class class34 {

	public static void main(String[] args) {
		class34_2 dog1 = new class34_2("멍멍이", "강아지", 2, "방석", "막대기");
		class34_3 cat1 = new class34_3("삼색이", "고양이", 4, "캣타워", "쥐인형");
		class34_4 brd1 = new class34_4("앵무", "새", 1, "새장", "장난감");
		class34_4 brd2 = new class34_4("앵무mk2", "새", "새장");
		class34_4 brd3 = new class34_4("짹", 2, true);
		class34_4 brd4 = new class34_4("잭", 3, false);
		
		dog1.speak(); dog1.rst(); dog1.ply(); dog1.ply2();
		dog1.wlk();	dog1.trt();	dog1.slp();dog1.drnk();
		
		cat1.speak(); cat1.rst(); cat1.ply();cat1.ply2();
		cat1.wlk(); cat1.trt();	cat1.slp();cat1.drnk();
		
		brd1.speak(); brd1.rst(); brd1.ply(); brd1.ply2();
		brd1.wlk(); brd1.trt();	brd1.slp();brd1.drnk();
		
		brd2.speak(); brd2.rst(); brd2.ply(); brd2.ply2();
		brd2.wlk(); brd2.trt();	brd2.slp();brd2.drnk();
		brd2.a(brd1.name);
		
		brd3.b(brd4.name, brd4.age, brd4.wings);
		brd3.aa(brd4);
		
		

	}

}


//상속 -> 클래스 간의 관계(상하관계)
//내가 가지고 있는 속성(인스턴스 변수), 행동(메소드)이 다른 클래스에도 이미 있다면?
//똑같이 생긴 설계도를 또 만들어야되네?
//다른 설계도를 베껴올 수 있었으면 좋겠다.

//부모 클래스(이미 만들어져 있는 설계도)
//자식 클래스(베껴서 새로 작성할 설계도)