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
            bundle.putString("VARIAVEL", "resposta 1")
            bundle.putString("0", resposta1)
            intent.putExtras(bundle)

            setResposta1launcher.launch(intent)

        }

        binding.buttonTeste2.setOnClickListener {

            val intent = Intent(this, RespostaActivity::class.java)

            val bundle = Bundle()

            bundle.putInt("imagem", R.drawable._7)
            bundle.putString("VARIAVEL", "resposta 2")
            bundle.putString("0", resposta2)
            intent.putExtras(bundle)

            setResposta2launcher.launch(intent)

        }

        binding.buttonTeste3.setOnClickListener {

            val intent = Intent(this, RespostaActivity::class.java)

            val bundle = Bundle()

            bundle.putInt("imagem", R.drawable._8)
            bundle.putString("VARIAVEL", "resposta 3")
            bundle.putString("0", resposta3)
            intent.putExtras(bundle)

            setResposta3launcher.launch(intent)

        }
    }
}