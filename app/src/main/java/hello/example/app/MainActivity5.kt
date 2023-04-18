package hello.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import hello.example.app.MainActivity

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val roll=findViewById<EditText>(R.id.editTextTextEmailAddress)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener(){
            if(roll.length()<10){
                Toast.makeText(this,"Enter valid roll no.", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this@MainActivity5, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}