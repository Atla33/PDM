package tadseaj.ufrn.pratica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import tadseaj.ufrn.pratica3.databinding.ActivityCarroBinding
import tadseaj.ufrn.pratica3.databinding.ActivityMainBinding

class CarroActivity : AppCompatActivity() {

    lateinit var binding: ActivityCarroBinding

    var carro: Carro = Carro("Coala")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_carro)

        binding.car = carro
    }
}