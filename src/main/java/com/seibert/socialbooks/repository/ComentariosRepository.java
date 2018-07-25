package com.seibert.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seibert.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
