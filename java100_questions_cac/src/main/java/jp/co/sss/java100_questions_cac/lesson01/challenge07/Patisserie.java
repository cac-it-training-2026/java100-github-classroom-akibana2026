/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		double sum = 0, sum_money = 0;
		double sitoron_start = 30, chocolat_start = 30, pista_start = 30;

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		//BufferedReaderオブジェクトを呼び出し、変数readerとして宣言
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン　　　");
		//シトロンの個数を取得
		String sitoron = reader.readLine();

		System.out.println("ショコラ　　　");
		//ショコラの個数を取得
		String chocolat = reader.readLine();

		System.out.println("ピスターシュ　");
		//ピスターシュの個数を取得
		String pista = reader.readLine();

		//各項目の個数を表示
		System.out.println("シトロン　　　" + sitoron + "個");
		System.out.println("ショコラ　　　" + chocolat + "個");
		System.out.println("ピスターシュ　" + pista + "個");

		//各項目をdouble型に変換
		double sitoron_num = Double.parseDouble(sitoron);
		double chocolat_num = Double.parseDouble(chocolat);
		double pista_num = Double.parseDouble(pista);

		sum = sitoron_num + chocolat_num + pista_num;
		sum_money = (250 * sitoron_num) + (280 * chocolat_num) + (320 * pista_num);

		System.out.println("合計個数　　" + sum + "個");
		System.out.println("合計金額　" + sum_money + "個\n");

		System.out.println("をお買い上げですね。\n承りました。\n");

		System.out.println("本日のおすすめ商品です\n");
		System.out.println("シトロン　　　\\250　・・・　残り" + (int) (sitoron_start - sitoron_num) + "個");
		System.out.println("ショコラ　　　\\280　・・・　残り" + (int) (chocolat_start - chocolat_num) + "個");
		System.out.println("ピスターシュ　\\320　・・・　残り" + (int) (pista_start - pista_num) + "個");

	}

}