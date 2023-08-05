package project06;

public class class33_3 {
	String name;//인스턴스 변수
	int level;//인스턴스 변수
	int exp;//인스턴스 변수
	
	
	class33_3(String name){//생성자
		this.name = name;
		this.level = 1;
		this.exp = 0;
	}
			
	class33_3(String name, int level) {//생성자
		this.name = name;
		this.level = level;
		this.exp = 0;
	}
	class33_3(String name, int level, int exp){//생성자
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	void infor() {
		System.out.println("캐릭터명 : " + name + ". level : " + level);
	}
	
	void fight() {
		System.out.println(name + "이(가) 전투를 시작했습니다.");
	}
	
	void clear(int exp1) {
		System.out.println("전투를 성공적으로 클리어하였습니다.");
		System.out.println(exp1 + "의 경험치를 획득했습니다.");
		getExp(exp1);
	}
	
	void getExp(int exp) {
		this.exp += exp;
		if(this.exp >= 100) {
			System.out.println(name + "의 레벨이 상승합니다." );
			System.out.println("현재 " + name + "의 레벨은 " + (++level) + "입니다.");
			this.exp -= 100;
		}
	}
	
	void avoid() {
		System.out.println("전투에서 도망쳤습니다. 나약한 녀석!!!");
	}
}
