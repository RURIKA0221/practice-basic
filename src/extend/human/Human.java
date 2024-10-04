package extend.human;

public class Human {//全てのクラス
	private String name;//自身のクラスのみアクセス可能
	protected int age;//自身と、自分と同じパッケージに属するクラス、および自分を継承したクラスがアクセス可能

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}
