package com.josephhopson.spirituum

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform