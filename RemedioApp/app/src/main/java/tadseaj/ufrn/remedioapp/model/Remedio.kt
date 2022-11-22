package tadseaj.ufrn.remedioapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Remedio (val nome:String, val dosagem:Float) {
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0
}