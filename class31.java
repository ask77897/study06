package project06;

import java.util.Scanner;

public class class31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] st = {"김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도"};
		
		
		String tr1 = sc.next();
		String b = sc.next(); 
		subway(st,tr1,b);
		
	}//main
	static void subway(String[] st, String tr1, String b) {
		if(tr1.equals("급행")) {
			fast(st,b);
		}
		else if(tr1.equals("일반")) {
			normal(st,b);
		}
	}
	
	static void normal(String[] st, String b) {
		for(int i = 0; i<st.length; i++) {
			if(b.equals(st[i])) {
				for(int j = 0; j<i+1; j++) {
					System.out.println(st[j]);
				}
			}
		}
	}
	static void fast(String[] st, String b) {
		for(int i=0; i<st.length; i++) {
			if(b.equals(st[i])) {
				for(int j = 0; j<i+1; j+=2) {
					System.out.println(st[j]);
				}
			}
		}
	}
	
	
	
	
	
}
