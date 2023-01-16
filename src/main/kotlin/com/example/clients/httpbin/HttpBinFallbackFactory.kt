package com.example.clients.httpbin

import org.springframework.cloud.openfeign.FallbackFactory
import org.springframework.stereotype.Component

@Component
class HttpBinFallbackFactory : FallbackFactory<HttpBinClient> {
    override fun create(cause: Throwable): HttpBinClient =
        object : HttpBinClient {
            override fun getSomeData() {}
        }
}
