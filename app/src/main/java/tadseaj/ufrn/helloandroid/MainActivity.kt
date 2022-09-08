package tadseaj.ufrn.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextLogin: EditText = findViewById(R.id.editTextLogin)
        var editTextPassword: EditText = findViewById(R.id.editTextPassword)

        var botaoOk: Button = findViewById(R.id.buttonOK)

        Toast.makeText(this, "Ola mundo", Toast.LENGTH_LONG).show()

        botaoOk.setOnClickListener {
           // (it as Button).text = "Mudei o texto do botão"
            //Log.i("Aula", editTextLogin.text.toString())
            //Log.i("Aula", editTextPassword.text.toString())
            //Log.i("Aula", editTextLogin!!.text.toString()) Duas !! não aceita valor nulo
            //Log.i("Aula", editTextLogin?.text.toString()) ? aceita valor nulo, mas não invoca os metodos e por a ? em botaoOK

            val stringLogin = editTextLogin?.text.toString()
            val stringPassword = editTextPassword?.text.toString()

            if(stringLogin.equals("anderson") && stringPassword.equals("123")){
                Log.i("Aula", "Login feito com sucesso")
                Toast.makeText(this, "Login feito com sucesso", Toast.LENGTH_SHORT).show()

            }else{
                Log.i("Aula", "Login incorreto")
                Toast.makeText(this, "Login incorreto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}