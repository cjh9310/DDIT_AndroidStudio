package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val et1 = findViewById<EditText>(R.id.et_1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener{
            var a = et1.text.toString().toInt()    // Int로 만들려면 먼저 String으로 만들고 만들어줘야한다.
            var b = et2.text.toString().toInt()

            var sum = a+b

            et3.setText(sum.toString())

        }


    }
}