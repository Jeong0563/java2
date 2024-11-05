package day8;

public class Starvuks {

	public static void main(String[] args) {
//		int[] coffee = new int[7];
		int hap = 0;
		int[] coffee = {12,33,44,100,66,77,55};
		for(int i = 0; i < coffee.length; i++) {
			hap = hap +  coffee[i];
		}
		System.out.println("총 판매잔수: " + hap);
		System.out.println("판매금액" + hap*2000);
		
	}

}
