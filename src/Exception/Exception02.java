package Exception;

import java.io.IOException;//入出力処理中の例外を管理するクラス
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exception02 {
	public static void main(String[] args) {
		try {
			// tryブロック：例外が発生する可能性がある処理を記述
			String allData = Files.readString(Paths.get("c:\\temp\\memo.txt"));
			System.out.println(allData);
		} // IOExceptionが発生した場合の例外処理
			catch (IOException e) {
			System.out.println("例外が発生");
		} // 例外発生しても、しなくても、処理を実行
			finally {
			System.out.println("プログラム終了");
		}
	}
}

/*
 	try {
	tryブロック（例外が発生する可能性がある処理）
	} catch (例外クラス 変数名) {
	catchブロック（例外が発生した時に実行する処理）
	} catch (例外クラス 変数名) {
	catchブロック（例外が発生した時に実行する処理）
	} finally {
	finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
	}
 */
 