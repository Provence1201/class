package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count:Int = 0
    var word:String = ""
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun AddOne(v:View) {
        if(v.id == R.id.btn) {
            count++
            if(count==1) {
                word = "你好～我叫顏聖凱，也可以叫我小凱就好！"
            }
            if(count==2) {
                word = "我是台中豐原人，高中就讀明道高中商業經營科，現在是靜宜大學資管系大二。\n"
            }
            if(count==3) {
                word = "我的興趣與專長是彈吉他，希望未來也可以從音樂這一塊進入，現在則是在做吉他家教。\n"
            }
            if(count==4) {
                word = "我算是一個比較樂觀的人，自己一個人的時候個性比較內向，但跟朋友一起的時候會變得比較外向，\n" +
                        "會努力炒熱氣氛，希望身邊的每個人都能快樂！\n"
            }
            if(count==5) {
                word = "我的座右銘：即使當下事與願違，請你堅信你依然能勝天半子！\n"
            }
        }
        else{
            count = 0
            word = "謝謝大家，以上是我的自我介紹"
        }
        txv.text = word

    }

}