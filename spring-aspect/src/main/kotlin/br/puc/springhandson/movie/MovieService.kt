package br.puc.springhandson.movie

import br.puc.springhandson.aspect.Log
import org.springframework.stereotype.Service

@Service
class MovieService {
    @Log
    fun find(): String = "TODO"
}