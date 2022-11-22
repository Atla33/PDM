package tadseaj.ufrn.remedioapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import tadseaj.ufrn.remedioapp.databinding.FragmentDashboardBinding
import tadseaj.ufrn.remedioapp.databinding.FragmentHomeBinding

class DashboardFragment : Fragment() {

    private lateinit var _binding: FragmentDashboardBinding
    private lateinit var _viewmodel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewmodel = ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)

        _binding.viewmodel = _viewmodel
        _binding.lifecycleOwner = this

        return _binding.root
    }

}