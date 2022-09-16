package tadseaj.ufrn.pratica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    val activityLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
            if(result.resultCode == RESULT_OK){
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextoUsuario = findViewById<EditText>(R.id.editTextoUsuario)
        val buttonAbrir = findViewById<Button>(R.id.buttonAbrir)
        val buttonEnviar = findViewById<Button>(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener {
            val intent = Intent(this, MainActivityRecebe::class.java)
        }

        buttonAbrir.setOnClickListener {
            val digitacao = editTextoUsuario.text.toString()
            val intent = Intent( this, MainActivityRecebe::class.java)

            val bundle = Bundle()

            bundle.putString("TEXTO", digitacao)

            intent.putExtras(bundle)

            startActivity(intent)

        }
    }
}