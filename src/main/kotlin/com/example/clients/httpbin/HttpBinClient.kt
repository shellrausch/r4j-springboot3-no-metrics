package com.example.clients.httpbin

import feign.RequestLine
import org.springframework.cloud.openfeign.FeignClient

@FeignClient(
    name = "httpbin",
    url = "https://httpbin.org",
    configuration = [HttpBinConfig::class],
    fallbackFactory = HttpBinFallbackFactory::class
)
interface HttpBinClient {
    @RequestLine("GET /get")
    fun getSomeData()
}
