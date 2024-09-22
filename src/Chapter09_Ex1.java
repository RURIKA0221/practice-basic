
public class Chapter09_Ex1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				int c = a * b;
				System.out.print(a + "*" + b + "=" + c + " ");//改行せずに出力
			}
			System.out.println();// 九九の一段ごとに改行を出力

		}

	}

}

/*「System.out.println」は改行をして出力される
  「System.out.print」は改行をせずに出力される*/
