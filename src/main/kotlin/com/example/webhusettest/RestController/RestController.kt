package com.example.webhusettest.RestController

import org.springframework.web.bind.annotation.GetMapping
import kotlin.random.Random


@org.springframework.web.bind.annotation.RestController
class RestController {

    @GetMapping ("random")
    fun getRandomNumber():String {
        var randomNumber = Random.nextInt(0,1000)
        return randomNumber.toString()
    }
}