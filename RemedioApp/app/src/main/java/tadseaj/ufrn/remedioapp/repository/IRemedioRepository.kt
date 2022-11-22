package tadseaj.ufrn.remedioapp.repository

import kotlinx.coroutines.flow.Flow
import tadseaj.ufrn.remedioapp.model.Remedio

interface IRemedioRepository {

    fun listAll(): Flow<List<Remedio>>
    fun create(remedio: Remedio)

}