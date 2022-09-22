package tadseaj.ufrn.pratica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import tadseaj.ufrn.pratica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding


    var pessoa:Pessoa = Pessoa("Raimundinho que da a bundinha", 24)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.person = pessoa

        binding.buttonOK.setOnClickListener {


            Toast.makeText(this,binding.editTextNome.text, Toast.LENGTH_SHORT).show()

            Log.i("AULA", binding.person.toString())

        }
    }
}