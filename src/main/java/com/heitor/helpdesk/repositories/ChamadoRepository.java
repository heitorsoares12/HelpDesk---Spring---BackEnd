package com.heitor.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
