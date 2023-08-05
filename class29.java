package project06;

public class class29 {

	public static void main(String[] args) {
		int[][] arr = new int[8][8];
		
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				if((i>=8/2&&i%2==1)||(j>=8/2&&j%2==1)) {
					arr[i][j] = 8*i+j+1;
				}
				else if((i<8/2&&i%2==0)||(j<8/2&&j%2==0)){
					arr[i][j] = 8*i+j+1;							
				}
				else {
					arr[i][j] = 0;
				}
				if(i > 0||j > 0 ||i<arr.length-1||j<arr.length-1) {
					if((i==1&&(j==2||j==5))||i==2||i==5||i==6) {
						arr[i][j] = 0;
					}
				}
			}
		}
		
		for(int i =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.printf(arr[i][j]+" ");
			}
			System.out.println();
		}

	}//main

}
