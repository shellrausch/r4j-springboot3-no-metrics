package com.example.web

import com.example.clients.httpbin.HttpBinClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val httpBinClient: HttpBinClient
) {
    @GetMapping("/data")
    fun getSomeData(){
        httpBinClient.getSomeData()
    }
}