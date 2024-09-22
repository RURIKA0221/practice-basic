
public class Chapter09_Ex2_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 12;
		int b = 18;
		int c = 0;//とりまcを初期化。
		for(int i = a; i >= 1; i--) {
			if( a % i == 0) {
				if(b % i == 0) {
					c = i;
					break;
				}
			}
			
		}
		System.out.println(c);
	}

	
}
