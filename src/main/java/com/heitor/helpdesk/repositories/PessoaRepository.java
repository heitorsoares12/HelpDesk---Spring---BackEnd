package com.heitor.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
