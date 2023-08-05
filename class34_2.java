package project06;

public class class34_2 extends class34_1{
	String species;
	String house;
	String toy;
	class34_2(String name, String species, int age, String house, String toy){
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
		System.out.println(name+"이(가) 산책을 갑니다.");	
	}
	void trt() {
		System.out.println(name+"이(가) 개껌을 먹습니다.");
	}
	void slp() {
		System.out.println(name+"이(가) 배를 보이며 잠을 잡니다.");
	}
	void ply2() {
		System.out.println(name+"이(가) 물놀이를 합니다.");
	}
	
}
