package app.iida.jessy.textview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        //コード上で、テキストの中身を変える方法
        textView.text = ""

        //色変化
        textView.setTextColor(Color.rgb((200,50,80)))
    }
}