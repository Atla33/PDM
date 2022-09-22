package tadseaj.ufrn.testedaltonismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import tadseaj.ufrn.testedaltonismo.databinding.ActivityMainBinding
import tadseaj.ufrn.testedaltonismo.databinding.ActivityRespostaBinding

class RespostaActivity : AppCompatActivity() {

    lateinit var binding: ActivityRespostaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_resposta)

        val imagem = intent.extras?.getInt("imagem")
        binding.imageBoneco.setImageResource(imagem!!)
        Log.i("imagem", "$imagem")
    }
}