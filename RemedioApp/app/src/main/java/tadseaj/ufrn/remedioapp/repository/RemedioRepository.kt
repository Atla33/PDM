package tadseaj.ufrn.remedioapp.repository

import kotlinx.coroutines.flow.Flow
import tadseaj.ufrn.remedioapp.dao.RemedioDao
import tadseaj.ufrn.remedioapp.model.Remedio
import javax.inject.Inject

class RemedioRepository @Inject constructor(val dao:RemedioDao): IRemedioRepository {

    override fun listAll(): Flow<List<Remedio>>{
        return dao.listAll()
    }

    override fun create(r: Remedio){
        return dao.create(r)
    }

}