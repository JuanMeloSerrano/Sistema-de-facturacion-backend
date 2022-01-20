package com.sitiapp.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sitiapp.backend.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

	
}
