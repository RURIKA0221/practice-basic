package practice;

import java.util.Scanner;

public class Chapter18_1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);//入力処理を行う
    	StringBuilder sb = new StringBuilder();//sbの変数を作る
    	while(true) {//無限ループ
    		String line = sc.nextLine();//一行全体の入力を読み取る
    		if(line.equals("exit")) {//exitが入力されたら
    			break;//このループ抜け出す
    		}
    		sb.append(line);//lineの内容を付け加える
    	}
    	System.out.println( sb.toString());//sbの内容を出力
        sc.close();//クローズする
    }
}

//StringBuilderの書き方
//String s = new StringBuilder().append("Java").append("勉強中").toString();
