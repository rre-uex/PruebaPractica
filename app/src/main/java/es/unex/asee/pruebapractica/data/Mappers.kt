package es.unex.asee.pruebapractica.data

import es.unex.asee.pruebapractica.data.api.IssueApi
import es.unex.asee.pruebapractica.data.model.Issue

fun IssueApi.toIssue() = Issue(
    number = Number,
    created = created
)