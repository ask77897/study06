package project06;

public class class34_1 {
	String name;
	String species;
	int age;
	
	class34_1(String name, int age){
		this.name = name;
		this.age = age;
	}
	class34_1 (String name){
		this.name = name;
		age = 0;	
	}
	class34_1(int age){
		this.age = age;
		name = "???";
	}
	
	void speak(String species) {
		if(age==0) {
			System.out.println("얘는 " +species+" "+name+"이야");
		}else {
			System.out.println("얘는 " +species+" "+name+"이고, "+age+"살이야.");
		}
	}
	void drnk() {
		System.out.println(name + "이(가) 물을 마십니다.");
	}
	void ply(String toy) {
		if(toy.equals("없음")) {
			System.out.println(name + "은(는) 장난감이 없습니다.");
		}else {
			System.out.println(name + "이(가) "+toy+"을(를) 가지고 놉니다.");
		}
	}
	void rst(String house) {
		System.out.println(name+"이(가) 자기 "+house+"에서 휴식합니다.");
	}
	void wlk() {
		
	}
	void slp() {
		
	}
	void trt() {
		
	}
}
