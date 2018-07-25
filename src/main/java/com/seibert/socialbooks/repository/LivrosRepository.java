package com.seibert.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seibert.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
