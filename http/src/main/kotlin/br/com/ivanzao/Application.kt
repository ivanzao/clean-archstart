package br.com.ivanzao

import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.jetty.Jetty

fun main() {
    embeddedServer(Jetty, 8080) {
        install(ContentNegotiation) {
            gson { }
        }

        routing {
            get("/") {
                call.respond(
                    mapOf("status" to "up")
                )
            }
        }
    }.start(wait = true)
}