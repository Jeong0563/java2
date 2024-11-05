package day8;

public class ArrayString {

	public static void main(String[] args) {
		String[] games = {"스타크래프트", "리니지", "메이플"}; 
		System.out.print("게임이름: ");
		for(int i = 0; i < games.length; i++) {
			System.out.print(games[i]+" ");
		}
		
		String[] strArr = {"프로그래밍", "완전", "너무", "싫어", "노는게", "좋아요", "별로"};
		System.out.println(strArr[0] + strArr[1] + strArr[5]);

	}

}
