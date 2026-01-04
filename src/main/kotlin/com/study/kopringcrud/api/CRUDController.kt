package com.study.kopringcrud.api

import com.study.kopringcrud.api.dto.CRUDDto
import com.study.kopringcrud.application.CRUDService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CRUDController(
    private val crudService: CRUDService
) {
    @PostMapping("/test")
    fun test() {
        println("Test")
    }

    @PostMapping("/create")
    fun create(@RequestBody body: CRUDDto) {
        crudService.create(body)
    }
}
