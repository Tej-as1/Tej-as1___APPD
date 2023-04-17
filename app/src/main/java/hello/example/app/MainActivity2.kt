package hello.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.next2)
        button.setOnClickListener(){

            val intent= Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(intent)
            finish()

        }

        val button2 = findViewById<Button>(R.id.next3)
        button2.setOnClickListener(){

            val intent= Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}