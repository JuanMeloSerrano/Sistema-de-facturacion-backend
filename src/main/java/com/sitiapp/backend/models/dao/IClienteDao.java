package com.sitiapp.backend.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sitiapp.backend.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

	
}
