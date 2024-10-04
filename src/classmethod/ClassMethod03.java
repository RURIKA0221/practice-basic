package classmethod;

import classmethod.human.Human03;

public class ClassMethod03 {
	public static void main(String[] args) {
		/*
		 Human01: 変数の型名（intとかと同じ）
		 yamada: 変数名
		 new: 今からインスタンスを作るよ（設計図を元に部品を組み立てて実体化するよ）という宣言
		 Human01: 何のインスタンスを作るのかの宣言
		 (): 何のコンストラクタを使ってインスタンスを作るのかの宣言
		「Human03型の変数yamadaを作ります。
		 yamadaには引数なしのコンストラクタを使って作ったHuman03のインスタンスを代入します」
		 */
		Human03 yamada = new Human03();

		System.out.println("私の名前は、" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");

		yamada.greet("田辺");
		yamada.greet(null);
	}
}