/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		double sum = 0, sum_money = 0;
		double sitoron_start = 30, chocolat_start = 30, pista_start = 30;
		double sitoron_percent = 0, chocolat_persent = 0, pista_persent = 0;

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

		sitoron_percent = (int) ((250 * sitoron_num / sum_money) * 100);
		chocolat_persent = (int) ((280 * chocolat_num / sum_money) * 100);
		pista_persent = (int) ((320 * pista_num / sum_money) * 100);

		System.out.println("明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味　　・・・" + (int) sitoron_percent + "%");
		System.out.println("ショコラの味　　・・・" + (int) chocolat_persent + "%");
		System.out.println("ピスターシュの味・・・" + (int) pista_persent + "%\n");
		System.out.println("が楽しめます！\n");
		System.out
				.println("値段は\\" + (sum / (int) (sitoron_num + chocolat_num + pista_num) / 10 * 10) + "です");

	}

}