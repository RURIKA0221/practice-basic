package extend.human;

public class Student extends Human {
	// サブクラスで追加したフィールド
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}

	public String getStudentProfile() {
		// 親インスタンスのフィールドをsuper変数で参照
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}