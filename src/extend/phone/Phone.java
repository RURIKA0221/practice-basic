package extend.phone;
/*
//Phoneインターフェースの宣言
public interface Phone {
	// フィールドの宣言（定数）
	int MAX_NUMBER_DIGITS = 11;

	// public abstractが自動で追加される（抽象メソッド）
	public void call(String number);
}
*/

public interface Phone {
	final int MAX_NUMBER_DIGITS = 11;

	void call(String number);

	// defaultメソッドの宣言
	default void powerOff() {
		System.out.println("電源を切ります。");
	}
}