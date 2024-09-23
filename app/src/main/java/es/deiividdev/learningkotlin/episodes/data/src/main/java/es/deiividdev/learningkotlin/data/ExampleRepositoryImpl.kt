package es.deiividdev.learningkotlin.episodes.data.src.main.java.es.deiividdev.learningkotlin.data

import es.deiividdev.learningkotlin.episodes.domain.src.main.java.es.deiividdev.learningkotlin.domain.repository.ExampleRepository
import javax.inject.Inject


class ExampleRepositoryImpl @Inject constructor(
) : ExampleRepository {
    override suspend fun load(filter: String): List<String> {
        TODO("Not yet implemented")
    }
}