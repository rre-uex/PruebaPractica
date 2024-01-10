package es.unex.asee.pruebapractica.data.model

import java.io.Serializable

data class Issue(
    var number: Int? = null,
    var created: String? = null
) : Serializable