package hello.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import hello.example.app.MainActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener(){


            val intent= Intent(this@MainActivity5,MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}