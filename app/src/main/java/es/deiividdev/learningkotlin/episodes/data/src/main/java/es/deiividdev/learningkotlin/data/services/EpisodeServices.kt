package es.deiividdev.learningkotlin.episodes.data.src.main.java.es.deiividdev.learningkotlin.data.services

import es.deiividdev.learningkotlin.episodes.data.src.main.java.es.deiividdev.learningkotlin.data.model.Episode
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EpisodeServices {
    @GET("episodes/{id}")
    suspend fun getEpisode(@Path("id") id: Int): Response<Episode>
}