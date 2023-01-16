package com.example.clients.httpbin

import feign.Contract
import feign.Logger
import feign.codec.ErrorDecoder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class HttpBinConfig {
    @Bean
    fun errorDecoder(): ErrorDecoder = HttpBinErrorDecoder()

    @Profile("default | dev")
    @Bean
    fun feignLoggerLevel(): Logger.Level = Logger.Level.FULL

    @Bean
    fun feignContract(): Contract = Contract.Default()
}
