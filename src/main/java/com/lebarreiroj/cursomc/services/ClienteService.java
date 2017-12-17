package com.lebarreiroj.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lebarreiroj.cursomc.domain.Cliente;
import com.lebarreiroj.cursomc.repositories.ClienteRepository;
import com.lebarreiroj.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrato! id: " + id + ", Tipo: " + Cliente.class.getName());
			
		}
		return obj;
	}
}
