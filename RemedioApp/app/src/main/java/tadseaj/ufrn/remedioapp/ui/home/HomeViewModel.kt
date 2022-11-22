package tadseaj.ufrn.remedioapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import tadseaj.ufrn.remedioapp.repository.IRemedioRepository
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor( private val repository: IRemedioRepository) : ViewModel() {

}