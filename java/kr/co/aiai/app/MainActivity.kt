package kr.co.aiai.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.tv)
        var btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            tv.setText("good Evening")
        }


    }
}