package tadseaj.ufrn.remedioapp.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import tads.eaj.ufrn.bookdependencyinjection.database.AppDatabase
import tadseaj.ufrn.remedioapp.dao.RemedioDao
import tadseaj.ufrn.remedioapp.model.Remedio
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun getDatabase(applicationContext: Application):AppDatabase{
        return AppDatabase.invoke(applicationContext)
    }

    @Singleton
    @Provides
    fun getDao(database: AppDatabase):RemedioDao{
        return database.remedioDao()
    }
}