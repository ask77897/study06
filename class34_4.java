package project06;

public class class34_4 extends class34_1{
	String species;
	String house;
	String toy;
	boolean wings;
	class34_4(String name, String species, int age, String house, String toy){
		super(name, age);
		this.species = species;
		this.toy = toy;
		this.house = house;
	}
	class34_4(String name, String species, String house){
		super(name);
		this.species = species;
		this.house = house;
		toy = "없음";
	}
	class34_4(String name, int age, boolean wings){
		super(name, age);
		this.wings = wings;
	}
	
	void speak() {
		super.speak(species);
	}
	void ply() {
		super.ply(toy);
	}
	void rst() {
		super.rst(house);
	}
	void wlk() {
		System.out.println(name+"이(가) 종이를 뜯어 몸을 치장합니다.");
	}
	void trt() {
		System.out.println(name+"이(가) 간식을 먹습니다.");
	}
	void slp() {
		System.out.println(name+"이(가) 횟대에서 잠을 잡니다.");
	}
	void ply2() {
		System.out.println(name+"이(가) 날아다닙니다.");
	}
	void a(String name) {
		System.out.println(this.name+ "와 " +name+ "이(가) 같이부른다.");
	}
	void b(String name, int age, boolean wings) {
		c(name, age, wings);
		c(this.name, this.age, this.wings);
		
	}
	void x(class34_4 brd3) {
		c(brd3.name, brd3.age, brd3.wings);
		c(this.name, this.age, this.wings);
	}
	void aa(class34_4 brd3) {
		y(brd3);
		y(this);
	}
	void y(class34_4 brd3) {
		System.out.println("이름: "+brd3.name+", 나이: "+brd3.age);
		if(brd3.wings) {
			System.out.println("저는 날 수 있습니다.");
		}
		else {
			System.out.println("저는 날 수 없습니다.");
		}
	}
	void c(String name, int age, boolean wings) {
		System.out.println("이름: "+name+", 나이: "+age);
		if(wings) {
			System.out.println("저는 날 수 있습니다.");
		}
		else {
			System.out.println("저는 날 수 없습니다.");
		}
	}
	
	
	
	
	
	
}
