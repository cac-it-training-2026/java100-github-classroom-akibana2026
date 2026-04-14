/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int sum = 0, sum_money = 0;

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		//シトロンの個数を取得
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

		//各項目を整数型に変換
		int sitoron_num = Integer.parseInt(sitoron);
		int chocolat_num = Integer.parseInt(chocolat);
		int pista_num = Integer.parseInt(pista);

		//個数の合計を計算
		sum = sitoron_num + chocolat_num + pista_num;
		//金額の合計を計算
		sum_money = sitoron_num * 250 + chocolat_num * 280 + pista_num * 320;

		//合計個数と合計金額を表示
		System.out.println("合計個数　　" + sum + "個");
		System.out.println("合計金額　" + sum_money + "個");

		System.out.println("をお買い上げですね。\n承りました。");

	}
}
