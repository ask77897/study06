package project06;

public class class33_2 {
	String name;
	String species;
	int age;
	
	
	class33_2(){
		
	}
	
	class33_2(String name, String species, int age){
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	void speak() {
		System.out.println("얘는 " +species+" "+name+"이고, "+age+"살이야.");
	}
	
	void wlk() {
		if(species.equals("강아지")) {
			System.out.println(name+"이(가) 산책을 갑니다.");			
		}
		else if(species.equals("고양이")) {
			System.out.println(name+"이(가) 높은 곳에 올라갑니다.");
		}
		else if(species.equals("새")) {
			System.out.println(name+"이(가) 종이를 뜯어 몸을 치장합니다.");
		}
	}
	void slp() {
		if(species.equals("강아지")) {
			System.out.println(name+"이(가) 배를 보이며 잠을 잡니다.");
		}
		else if(species.equals("고양이")) {
			System.out.println(name+"이(가) 웅크리고 잠을 잡니다.");
		}
		else if(species.equals("새")) {
			System.out.println(name+"이(가) 횟대에서 잠을 잡니다.");
		}
	}
	void trt() {
		if(species.equals("강아지")) {
			System.out.println(name+"이(가) 개껌을 먹습니다.");
		}
		else if(species.equals("고양이")) {
			System.out.println(name+"이(가) 츄르를 먹습니다.");
		}
		else if(species.equals("새")) {
			System.out.println(name+"이(가) 모이를 먹습니다.");
		}
	}
}
