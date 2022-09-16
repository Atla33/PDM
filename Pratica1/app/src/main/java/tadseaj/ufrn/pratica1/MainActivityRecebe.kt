package tadseaj.ufrn.pratica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivityRecebe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recebe)

        val textDados = findViewById<TextView>(R.id.textDados)
        val texroRecebido = getIntent().getExtras()?.getString("TEXTO")

        textDados.text = texroRecebido
    }
}