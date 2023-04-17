package hello.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button = findViewById<Button>(R.id.next4)
        button.setOnClickListener(){

            val intent= Intent(this@MainActivity3,MainActivity2::class.java)
            startActivity(intent)
            finish()

        }
    }
}