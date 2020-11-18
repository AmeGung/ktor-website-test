package com.example

import com.example.com.example.module
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.sessions.*
import io.ktor.features.*
import io.ktor.auth.*
import kotlin.test.*
import io.ktor.server.testing.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("HELLO WORLD!", response.content)
            }
        }
    }
}
