package overload;

import extend.phone.Phone;
import practice.Flying;

public class FlyingPhone implements Phone, Flying {
	// プログラムを作成
	private int minute;
	
	public FlyingPhone(int minute) {
		this.minute = minute;
		
	}
	
	//スーパークラスのメソッドをサブクラスで上書きして再定義する
	//サブクラス側のメソッドの直前の行に @Overrideと書くことで、
	//上記すべてを満たしていることをコンパイル時に保証できます。
	//スーパークラスのメゾッドを用いる上で、サブクラスで改変するものに使いがち(個人的感想)
	@Override
	public void fly() {
		System.out.println(minute + "分間、飛びます");
	}

	@Override
	// Phoneインターフェースのメソッドを実装
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	@Override
	public void powerOff() {
		Flying.super.powerOff();
	}
}