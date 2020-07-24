package jp.techacademy.hiroshi.murata.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val value1 = intent.getDoubleExtra("value1",0.0)
        val value2 = intent.getDoubleExtra("value2",0.0)
        val result_value = intent.getDoubleExtra("result",0.0)
        val symbol = intent.getStringExtra("symbol")

        Log.d("value1","$value1")
        Log.d("value2","$value2")
        Log.d("result value","$result_value")
        Log.d("symbol","$symbol")

        resultView.text = "$value1 $symbol $value2 = $result_value"

    }
}
