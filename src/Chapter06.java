
public class Chapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long num1 = 10000000000L;
		/*「int」型の範囲外の整数をプログラムに記述する場合は、
		   数値の最後に「L」または「l（小文字のエル）」を付けて、
		  「long」型であること明示的に記述をする必要がある。*/
		System.out.println(num1);
		double num2 = 3.14;
		System.out.println(num2);
		boolean boolean1 = true;
		/*論理型を扱う型は、「boolean」型の1種類。
		  格納できる値は、真偽値の「true」と「false」の2つだけ。*/
		System.out.println(boolean1);
		Integer num3 = 100;
		System.out.println(num3);
		Float num4 = 1.4142f;
		System.out.println(num4);
		Character str1 = 'う';
		System.out.println(str1);
		/*ラッパークラスをオートボクシングで初期化して出力している。
		 「Integer」は、「int」の値で初期化している。
		 「Float」は、「f」がついた「float」の値で初期化している。
		 (明示的に「float」型を宣言する場合は、数値の最後に「F」または「f」を付ける必要がある。
		 「double」型も「D」または「d」を付けて明示的にすることも可能。)
		 「Character」は、「``」で囲まれた1文字で初期化している。*/
		int[] array1 = new int[]{ 0, 10, 20, 30, 40 };
		System.out.println(array1.length);
		
	}

}
