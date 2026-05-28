package com.back.demo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class Demo3Application

fun main(args: Array<String>) {
    runApplication<Demo3Application>(*args)
}
