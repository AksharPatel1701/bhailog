package com.example.bhailog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnsave.setOnClickListener {
            var name=edtname.text.toString()
            var fathername=edtfathername.text.toString()
            var age=edtage.text.toString().toInt()
            var emp=Emp(name,fathername,age)
            var db=DBHelper(this)
            var falg=db.insert(emp)
            if(falg)
            {
                Toast.makeText(this,"record inerted", Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"record not inserted", Toast.LENGTH_LONG).show()
            }
        }
        btnview.setOnClickListener {
            var intent=Intent(this,ViewAllActivity::class.java)
            startActivity(intent)
        }

    }
}