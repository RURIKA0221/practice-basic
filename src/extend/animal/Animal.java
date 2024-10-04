package extend.animal;

//abstract修飾子を設定して、抽象クラスとして宣言
//親クラスだけにつけることが出来る
//抽象的なので、インスタントが作れず、実体化出来ないことが特徴
public abstract class Animal {
	protected String name;

	// 共通メソッドを記述
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}

	// サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
	public abstract void cry();
}


/*
	//抽象クラスの宣言
	アクセス修飾子 abstract class クラス名 {
	// 抽象メソッドの宣言
	アクセス修飾子 abstract 戻り値の型 メソッド名(引数);
	}
 
 */
