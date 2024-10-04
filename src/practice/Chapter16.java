package practice;

public class Chapter16 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 5つのサブクラスのインスタンスを生成
		Human[] humans = new Human[] { 
				new Student(), 
				new Programmer(), 
				new Driver(), 
				new Teacher(), 
				new Doctor(),
		};

		for (Human h : humans) {
			// workメソッドを呼び出す
			h.work();
			// Programmerクラスの場合、studyメソッドを呼ぶ
			if(h instanceof Programmer){
				//studyメソッドを呼ぶのはわかるけど((Programmer)h)の意味が分からない
				((Programmer)h).study();
			}
		}		
		
		
	}

}
