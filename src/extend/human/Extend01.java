package extend.human;

public class Extend01 {
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本", 16);
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

		Student sato = new Student("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());

		// Employeeクラスのインスタンスを生成して、アップキャスト（※）でHumanクラスの変数に代入
		Human human = new Employee("田中", 28, "システム部");
		// スーパークラス（Humanクラス）のメソッドを呼び出し
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

		// Humanクラスには、getEmployeeProfileメソッドがないのでアクセスするとコンパイルエラー
		// System.out.println("Employeeクラスのメソッド：" + human.getEmployeeProfile());
		// Employeeクラスの変数にダウンキャスト（※）
		Employee tanaka = (Employee) human;
		// Employeeクラスの変数なので、Employeeクラスに追加したgetEmployeeProfileメソッドの呼び出しができる
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	// 引数がHumanクラスなので、Humanクラスか、そのサブクラスなら呼び出しできる
	public static void printName(Human human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}
}