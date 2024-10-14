package practice;

public class Chapter18_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder line = new StringBuilder();//lineの変数を設定
		for(int i = 1; i <= 100; i++) {
			line.append(i).append(",");//1,2,3,…100,を作る
		}
		line.deleteCharAt(line.length() - 1);//最後の一文字(,)を消す
		System.out.println(line);//1,2,3,…100を出力
		
		String deta = new String(line);//新しくdetaを作る
		String[] number =deta.split(",");//splitメソッドで,を目安に区切る
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			
		}

	}

}

/*
 public static void main(String[] args) {

		// 1から100までの値StringBufferに格納する
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}
		// 最後のカンマを除去
		sb.deleteCharAt(sb.length() - 1);

		// カンマ区切りの文字列を出力
		String data = new String(sb);
		System.out.println(data);

		// 文字列をカンマで分割する
		String[] dataArray = data.split(",");
		for (String d : dataArray) {//Chapter9見たらわかる
			System.out.println(d);
		}
 */
