package es.deiividdev.learningkotlin.episodes.domain.src.main.java.es.deiividdev.learningkotlin.domain.repository

//calls with interface to data



interface ExampleRepository {
    suspend fun load(filter: String): List<String>
}
