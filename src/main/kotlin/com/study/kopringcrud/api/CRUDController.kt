package com.study.kopringcrud.api

import com.study.kopringcrud.api.dto.CRUDDto
import com.study.kopringcrud.application.CRUDService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
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

    @GetMapping("/read")
    fun readAll(): List<CRUDDto> {
        return crudService.readAll()
    }

    @GetMapping("/read/{id}")
    fun readById(@PathVariable id: Long): CRUDDto {
        return crudService.readById(id)
    }

    @PatchMapping("/update")
    fun update(@RequestBody dto: CRUDDto) {
        crudService.update(dto)
    }
}
