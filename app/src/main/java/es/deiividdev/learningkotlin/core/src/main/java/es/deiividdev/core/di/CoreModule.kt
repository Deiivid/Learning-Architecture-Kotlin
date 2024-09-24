package es.deiividdev.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.deiividdev.learningkotlin.episodes.data.src.main.java.es.deiividdev.learningkotlin.data.services.EpisodeServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CoreModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.example.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideEpisodeService(retrofit: Retrofit): EpisodeServices {
        return retrofit.create(EpisodeServices::class.java)
    }
}