/**
 * 第3章 探検隊のお仕事
 *
 * 問題4  歩いて橋を渡る
 *
 * 進行方向に全長3mの吊り橋を発見しました。
 * 5人の隊員は一人50cmの歩幅で歩かなければならず
 * また吊り橋は老朽化しているため一人ずつしか渡れません。
 *
 * コメントの位置にwhile文を利用した処理を記述して
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  隊長：
 *  吊り橋発見！
 *
 *  隊長：
 *  1人目が渡り始めたよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  2人目が渡り始めたよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  ～～～～～～～～ 中略 ～～～～～～～～～
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  隊長：
 *  まだ渡ってるよ
 *
 *  全員渡り終わったよ！
 *
 */

package jp.co.sss.java100_questions_cac.lesson03.challenge04;

import java.io.IOException;

public class Explorer {

	public static void main(String[] args) throws IOException {

		System.out.println("隊長：");
		System.out.println("吊り橋発見！\n");

		int fullLength = 300;
		int member = 0;

		//ここにwhile文を利用した処理を記述
		//while文をmember変数が5出ないあいだ実行
		while (member != 5) {
			System.out.println(member + 1 + "人目が渡り始めたよ");
			//while文を渡っている人がいる間実行
			while (fullLength != 0) {

				fullLength -= 50;

				//もし渡っている人がいるのなら
				if (fullLength != 0) {
					System.out.println("まだ渡ってるよ");
				}
			}
			//次の隊員のスタート地点にLengthを合わせる
			fullLength = 300;
			//member変数に1を加算して、1人渡り切ったことにする。
			member += 1;
		}

		System.out.println("全員渡り終わったよ！");

	}
}
