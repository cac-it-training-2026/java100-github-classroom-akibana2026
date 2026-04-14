/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		//個数を確認
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		System.out.println("シトロン　　　");

		//BufferedReaderオブジェクトを呼び出し、変数readerとして宣言
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//シトロンの個数を取得
		String sitoron = reader.readLine();

		//ショコラの個数を取得
		System.out.println("ショコラ　　　");
		String chocolat = reader.readLine();

		//ピスターシュの個数を取得
		System.out.println("ピスターシュ　");
		String pista = reader.readLine();

		//各項目の個数を表示
		System.out.println("シトロン　　　" + sitoron + "個");
		System.out.println("ショコラ　　　" + chocolat + "個");
		System.out.println("ピスターシュ　" + pista + "個");

		System.out.println("をお買い上げですね。\n承りました。");

	}
}
