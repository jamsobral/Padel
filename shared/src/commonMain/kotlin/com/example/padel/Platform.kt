package com.example.padel

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform