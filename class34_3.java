package project06;

public class class34_3 extends class34_1{
	String species;
	String house;
	String toy;
	class34_3(String name, String species, int age, String house, String toy){
		super(name, age);
		this.species = species;
		this.toy = toy;
		this.house = house;
	}
	
	void speak() {
		super.speak(this.species);
	}
	void drnk() {
		super.drnk();
	}
	void ply() {
		super.ply(toy);
	}
	void rst() {
		super.rst(house);
	}
	void wlk() {
		System.out.println(name+"이(가) "+house+"에 올라갑니다.");
	}
	void trt() {
		System.out.println(name+"이(가) 츄르를 먹습니다.");
	}
	void slp() {
		System.out.println(name+"이(가) 웅크리고 잠을 잡니다.");
	}
	void ply2() {
		System.out.println(name+"이(가) 스크래쳐를 긁습니다.");
	}
}
