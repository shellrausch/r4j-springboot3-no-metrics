package com.example.clients.httpbin

import feign.Response
import feign.codec.ErrorDecoder

class HttpBinErrorDecoder : ErrorDecoder {
    override fun decode(methodKey: String?, response: Response?): Exception {
        throw Exception("An error occurred")
    }
}
