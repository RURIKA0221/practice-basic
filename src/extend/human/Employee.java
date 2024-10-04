package extend.human;

public class Employee extends Human {
	// サブクラスで追加したフィールド
	private String department;

	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public String getEmployeeProfile() {
		// 親インスタンスのフィールドをthis変数で参照
		String profile = "年齢は" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}