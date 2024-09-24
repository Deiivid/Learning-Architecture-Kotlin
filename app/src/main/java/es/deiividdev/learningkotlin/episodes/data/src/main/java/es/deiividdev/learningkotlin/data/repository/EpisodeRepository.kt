package es.deiividdev.learningkotlin.episodes.data.src.main.java.es.deiividdev.learningkotlin.data.repository

import es.deiividdev.learningkotlin.episodes.data.src.main.java.es.deiividdev.learningkotlin.data.model.Episode
import es.deiividdev.learningkotlin.episodes.data.src.main.java.es.deiividdev.learningkotlin.data.services.EpisodeServices
import javax.inject.Inject

class EpisodeRepository @Inject constructor(
    private val episodeService: EpisodeServices
) {
    suspend fun getEpisodeById(id: Int): Episode? {
        val response = episodeService.getEpisode(id)
        if (response.isSuccessful) {
            return response.body()
        }
        return null
    }
}