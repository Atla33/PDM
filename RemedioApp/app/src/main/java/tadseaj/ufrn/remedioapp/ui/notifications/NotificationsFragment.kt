package tadseaj.ufrn.remedioapp.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import tadseaj.ufrn.remedioapp.databinding.FragmentDashboardBinding
import tadseaj.ufrn.remedioapp.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private lateinit var _viewmodel: NotificationsViewModel
    private lateinit var _binding: FragmentNotificationsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewmodel = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)

        _binding.viewmodel = _viewmodel
        _binding.lifecycleOwner = this

        return _binding.root
    }

}