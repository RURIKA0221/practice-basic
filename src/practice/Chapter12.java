package practice;

import java.sql.SQLException;

public class Chapter12 {
	public static void main(String[] args) {

		try {
			int array[] = { 1, 3, 5 };
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// tryを記述
		try {
			// ・throwSQLExceptionメソッドを呼び出す
			Chapter12.throwSQLException();
		// catchを記述	
		}catch(SQLException e){
			// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
			// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		}finally{
		System.out.println("throwSQLExceptionの呼び出し終了");
		}

	System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	public static void validIndex(int[]array, int index) {
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
		if(array.length >= index) {
			System.out.println("インデックス"+index+"の要素は"+array[index]+"です");
		}
		// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
		throw new IllegalArgumentException(index + " はサイズの範囲外です");
	
}
	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}
}