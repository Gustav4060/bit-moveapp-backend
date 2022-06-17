/**
 * 
 */
package com.businessit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.businessit.model.Cliente;
import com.businessit.repository.IClienteRepo;
import com.businessit.repository.IGenericRepo;
import com.businessit.service.IClienteServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Service
public class ClienteServicioImpl extends CRUDImpl<Cliente, Long> implements IClienteServicio {

	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	protected IGenericRepo<Cliente, Long> getRepo() {
		return clienteRepo;
	}

}
