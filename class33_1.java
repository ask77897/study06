package project06;

public class class33_1 {
	String name;
	int age;
	
	class33_1(){//생성자 첨부파일이 없으면 기본 생성자
		
	}
	
	class33_1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void speak() {
		System.out.println("이름: "+name+", 나이: "+age);
	}
	void run() {
		System.out.println(name+"이(가) 달려갑니다.");
	}
	void eat() {
		System.out.println(name+"이(가) 먹습니다.");
	}

}
