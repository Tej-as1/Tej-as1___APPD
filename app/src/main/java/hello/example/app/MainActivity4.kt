package hello.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import hello.example.app.MainActivity5
import kotlinx.coroutines.delay

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4
        )


        Handler().postDelayed({
            val intent= Intent(this@MainActivity4,MainActivity5::class.java)
            startActivity(intent)
            finish()
        },3000)




    }
}