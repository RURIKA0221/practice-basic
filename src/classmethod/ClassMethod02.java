//パッケージ宣言
package classmethod;

//インポート文
//クラスclassmethod.human.Human02を参照できるよう、インポート文を記述する
//この記述がない場合、 new classmethod.human.Human02() という風に毎度パッケージの指定が必要
import classmethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02(); // Human02クラスのインスタンスを生成
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human02 sato = new Human02("佐藤", 25); // Human02クラスのインスタンスを生成
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
