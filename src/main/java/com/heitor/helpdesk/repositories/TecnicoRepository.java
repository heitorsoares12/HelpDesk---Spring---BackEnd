package com.heitor.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.helpdesk.domain.Pessoa;

public interface TecnicoRepository extends JpaRepository<Pessoa, Integer> {

}
