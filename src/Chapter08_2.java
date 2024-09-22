
public class Chapter08_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String day = "るんるんらんらん";
		//switch文：分岐処理の開始
		switch(day) {
		case "Sunday":
			System.out.println("日曜日です");
			//break：switch文を終了
			break;
		case "Monday":
			System.out.println("月曜日です");
			break;
		case "Tuesday":
			System.out.println("火曜日です");
			break;
		case "Wednesday":
			System.out.println("水曜日です");
			break;
		case "Thursday":
			System.out.println("木曜日です");
			break;
		case "Friday":
			System.out.println("金曜日です");
			break;
		case "Saturday":
			System.out.println("土曜日です");
			break;
		//default：全てのcaseの値に一致しない場合にブロックを実行
		default:
			System.out.println("曜日ではありません");
			
		}
	}

}
