package jp.techacademy.hiroshi.murata.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener(this)
        minus.setOnClickListener(this)
        multiply.setOnClickListener(this)
        divide.setOnClickListener(this)
    }

    override fun onClick(v: View){
        val tmp1 = value1.text.toString()
        val tmp2 = value2.text.toString()
        val intent = Intent(this, Result::class.java)

        //Transform into Int type
        val input_value1 = tmp1.toIntOrNull()
        val input_value2 = tmp2.toIntOrNull()
        Log.d("values log", "$input_value1,$input_value2")
        intent.putExtra("value1",input_value1)
        intent.putExtra("value2",input_value2)

        //Go to intent
        if (input_value1 != null && input_value2 != null){
            if (v.id == R.id.add){
                val result_value = input_value1 + input_value2
                Log.d("result","$result_value")
                intent.putExtra("result",result_value)
                intent.putExtra("symbol","+")

            }else if (v.id == R.id.minus){
                val result_value = input_value1 - input_value2
                Log.d("result","$result_value")
                intent.putExtra("result",result_value)
                intent.putExtra("symbol","-")

            }else if (v.id == R.id.multiply){
                val result_value = input_value1 * input_value2
                Log.d("result","$result_value")
                intent.putExtra("result",result_value)
                intent.putExtra("symbol","*")

            }else if (v.id == R.id.divide) {
                val result_value = input_value1 / input_value2
                Log.d("result","$result_value")
                intent.putExtra("result", result_value)
                intent.putExtra("symbol", "/")

            }
            startActivity(intent)
        }else{
            Log.d("Exception", "Input values were not allowed. Value1 : $input_value1, Value2 : $input_value2")
        }

    }

}
