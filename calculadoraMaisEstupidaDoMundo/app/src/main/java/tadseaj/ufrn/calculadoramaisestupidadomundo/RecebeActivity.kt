package tadseaj.ufrn.calculadoramaisestupidadomundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RecebeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recebe)

        val variavel = intent.extras?.getString("VARIAVEL")
        val valor = intent.extras?.getInt("VALOR")

        val textViewLabelVariavel = findViewById<TextView>(R.id.textViewLabelVariavel)
        val editTextVariavel = findViewById<EditText>(R.id.editTextVariavel)

        textViewLabelVariavel.text = variavel
        editTextVariavel.setText(valor.toString())

        val buttonOK = findViewById<Button>(R.id.buttonOK)
        val buttonCancelar = findViewById<Button>(R.id.buttonOK)

        buttonOK.setOnClickListener {
            val intent = Intent()
            val bundle = Bundle()

            val editTextVariavel = findViewById<EditText>(R.id.editTextVariavel)
            bundle.putInt("VALOR", editTextVariavel.text.toString().toInt())
            intent.putExtras(bundle)

            setResult(RESULT_OK, intent)
            finish()
        }

        buttonCancelar.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}