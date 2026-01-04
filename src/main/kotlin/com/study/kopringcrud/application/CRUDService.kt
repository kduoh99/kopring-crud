package com.study.kopringcrud.application

import com.study.kopringcrud.api.dto.CRUDDto
import com.study.kopringcrud.domain.CRUDEntity
import com.study.kopringcrud.domain.repository.CRUDRepository
import org.springframework.stereotype.Service

@Service
class CRUDService(
    private val crudRepository: CRUDRepository
) {
    private fun toEntity(crudDto: CRUDDto): CRUDEntity {
        return CRUDEntity(
            title = crudDto.title,
            content = crudDto.content
        )
    }

    fun create(body: CRUDDto) {
        crudRepository.save(toEntity(body))
    }
}
