/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		int sum = 0, sum_money = 0;
		int sitoron_start = 30, chocolat_start = 30, pista_start = 30;

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

		System.out.println("本日のおすすめ商品です");
		System.out.println("シトロン　　　\\250　・・・　残り" + (sitoron_start - sitoron_num) + "個");
		System.out.println("ショコラ　　　\\280　・・・　残り" + (chocolat_start - chocolat_num) + "個");
		System.out.println("ピスターシュ　\\320　・・・　残り" + (pista_start - pista_num) + "個");

	}
}
