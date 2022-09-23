package tadseaj.ufrn.testedaltonismo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.graphics.drawable.toDrawable
import androidx.databinding.DataBindingUtil
import tadseaj.ufrn.testedaltonismo.databinding.ActivityMainBinding
import tadseaj.ufrn.testedaltonismo.databinding.ActivityRespostaBinding

class MainActivity : AppCompatActivity() {

    var resposta1 = "0";
    var resposta2 = "0";
    var resposta3 = "0";

    lateinit var binding: ActivityMainBinding


    val setResposta1launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if(result.resultCode == RESULT_OK){
            resposta1 = result.data!!.getStringExtra("0").toString()
            val textViewResposta1 = findViewById<TextView>(R.id.textViewResposta1)
            textViewResposta1.text ="${resposta1}"
        }else{
            Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
        }
    }

    val setResposta2launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if(result.resultCode == RESULT_OK){
            resposta2 = result.data!!.getStringExtra("0").toString()
            val textViewResposta2 = findViewById<TextView>(R.id.textViewResposta2)
            textViewResposta2.text ="${resposta2}"
        }else{
            Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
        }
    }

    val setResposta3launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if(result.resultCode == RESULT_OK){
            resposta3 = result.data!!.getStringExtra("0").toString()
            val textViewResposta3 = findViewById<TextView>(R.id.textViewResposta3)
            textViewResposta3.text ="${resposta2}"
        }else{
            Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonTeste1.setOnClickListener {

            val intent = Intent(this, RespostaActivity::class.java)

            val bundle = Bundle()

            bundle.putInt("imagem", R.drawable._4)
            bundle.putString("0", R.id.textViewResposta1.toString())
            intent.putExtras(bundle)

            setResposta1launcher.launch(intent)

        }

        binding.buttonTeste2.setOnClickListener {

            val intent = Intent(this, RespostaActivity::class.java)

            val bundle = Bundle()

            bundle.putInt("imagem", R.drawable._7)
            bundle.putString("0", R.id.textViewResposta2.toString())
            intent.putExtras(bundle)

            setResposta2launcher.launch(intent)

        }

        binding.buttonTeste3.setOnClickListener {

            val intent = Intent(this, RespostaActivity::class.java)

            val bundle = Bundle()

            bundle.putInt("imagem", R.drawable._8)
            bundle.putString("0", R.id.textViewResposta3.toString())
            intent.putExtras(bundle)

            setResposta3launcher.launch(intent)

        }

        binding.buttonResultado.setOnClickListener{

            if (binding.textViewResposta1.text == "74" || binding.textViewResposta2.text == "57" || binding.textViewResposta3.text == "8"){

                Toast.makeText(this, "Você não e daltônico", Toast.LENGTH_SHORT).show()

            }
            if(binding.textViewResposta1.text == "0" || binding.textViewResposta2.text == "0" || binding.textViewResposta3.text == "0"){

                Toast.makeText(this, "Coloque suas respostas", Toast.LENGTH_SHORT).show()

            }else{

                Toast.makeText(this, "Vá ao oftalmologista", Toast.LENGTH_SHORT).show()

            }
        }
    }
}