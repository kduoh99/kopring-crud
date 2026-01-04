package com.study.kopringcrud.domain.repository

import com.study.kopringcrud.domain.CRUDEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CRUDRepository : JpaRepository<CRUDEntity, Long> {
}
