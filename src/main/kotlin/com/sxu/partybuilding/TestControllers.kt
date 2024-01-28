package com.sxu.partybuilding

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
data class ApiResponse(val msg: String, val code: Int)
@RestController
class ApiController {

    @GetMapping("/api/test")
    fun testApi(): ApiResponse {
        return ApiResponse(msg = "Hello world!", code = 200)
    }
}
