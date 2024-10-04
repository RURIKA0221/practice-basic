package extend.phone;

//Cameraインターフェースの宣言
//interfaceは定数と抽象メソッドだけを持つクラスのようなもの
//interfaceは約束をとりつけるイメージ。クラスではなく、二つの作業を同時に行いたい時に等に用いる
public interface Camera {

	// public abstractが自動で追加される（抽象メソッド）
	public void takePicture();
}