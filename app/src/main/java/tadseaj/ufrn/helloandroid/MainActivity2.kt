package tadseaj.ufrn.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.buttonOKtel2)

        button.setOnClickListener{

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Aula", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Aula", "onResume()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Aula", "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Aula", "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Aula", "onDestroy()")
    }
}