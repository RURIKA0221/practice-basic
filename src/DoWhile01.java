
public class DoWhile01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 int number = 1;
	        // do-while文：ループ開始
	        do {
	        // ブロック：
	        // numberにnumber * 2 を代入して、numberを出力
	        number *= 2;
	            System.out.println("DoWhile01 = " + number);
	        // do-while文：
	        // numberが50未満の場合、ブロックの処理をループ実行する
	        } while (number < 50);
	}

}
	/*while文とdo-while文の違いは、
	条件式をブロックの実行前に評価するか、後に評価するかにある。
	ループ開始時点で、条件が「false」の場合、while文ではブロックが実行されないが、
	do-while文ではブロックが最初の1回目は必ず実行される。*/
