package com.seibert.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seibert.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
