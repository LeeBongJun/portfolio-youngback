package com.bongjun.portfolio.presentation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import kotlin.coroutines.RestrictsSuspension

@RestrictsSuspension
@RequestMapping("/api")
class PresentationApiController {

    @GetMapping("/test")
    fun test(): String {
        return "OK"
    }

}