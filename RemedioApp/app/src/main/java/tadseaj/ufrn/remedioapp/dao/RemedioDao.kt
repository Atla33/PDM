package tadseaj.ufrn.remedioapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import tadseaj.ufrn.remedioapp.model.Remedio


    @Dao
    interface RemedioDao {
        @Query("SELECT * FROM remedio")
        fun listAll(): Flow<List<Remedio>>
        @Query("SELECT * FROM remedio where id=:id")
        fun findByid(id: Long): Remedio?
        @Delete
        fun delete(r:Remedio)
        @Update
        fun update(r:Remedio)
        @Insert
        fun create(r:Remedio)
    }