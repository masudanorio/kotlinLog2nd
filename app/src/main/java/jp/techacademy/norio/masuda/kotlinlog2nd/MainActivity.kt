package jp.techacademy.norio.masuda.kotlinlog2nd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("のりお", 34, hobby = "読書")// 名前を〜〜、年齢〜〜歳で、Humanのインスタンスを作る

        human1.say()

        human1.think()

        val human2 = Human("のりお", 34, hobby = "読書")   // 趣味を〜〜で、Humanのインスタンスを作る
        human2.say()

        human2.think()






    }
}