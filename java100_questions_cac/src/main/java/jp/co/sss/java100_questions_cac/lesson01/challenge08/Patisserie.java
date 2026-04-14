/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge08;

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

		System.out.println("閉店時間となりました。\nまたのお越しをお待ちしております。\n");
		System.out.println("売上の割合\n売上合計　　　\\" + (int) sum_money + "\n内訳");

		System.out.println(
				"シトロン　　　\\" + (int) (250 * sitoron_num) + "・・・" + (int) (250 * (sitoron_num / sum_money) * 100) + "%");
		System.out.println("ショコラ　　　\\" + (int) (280 * chocolat_num) + "・・・"
				+ (int) (280 * (chocolat_num / sum_money) * 100) + "%");
		System.out.println(
				"ピスターシュ　\\" + (int) (320 * pista_num) + "・・・" + (int) (320 * (pista_num / sum_money) * 100) + "%");
	}

}