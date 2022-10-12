package br.puc.springhandson.movie

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/aspect/rest/movies")
class MovieController(
    val movieService: MovieService
) {
    @GetMapping
    fun find(): String {
        return movieService.find()
    }
}