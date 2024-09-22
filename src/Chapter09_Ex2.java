
public class Chapter09_Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 976;
		int b = 427;
		int c = a % b;
		while (c != 0) {//whileの条件式はこの条件の時にしか回さないような条件を入れる
			//a=b,b=cを先にするのは、cが0になった時点のbを出力したいから。
			a = b;//新しいaを生成
			b = c;//新しいbを生成
			c = a % b;
		}
		System.out.println(b);
	}

}
