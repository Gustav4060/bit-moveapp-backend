/**
 * 
 */
package com.businessit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.businessit.model.Cuenta;
import com.businessit.repository.ICuentaRepo;
import com.businessit.repository.IGenericRepo;
import com.businessit.service.ICuentaServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Service
public class CuentaServicioImpl extends CRUDImpl<Cuenta, Long> implements ICuentaServicio {

	@Autowired
	private ICuentaRepo cuentaRepo;

	@Override
	protected IGenericRepo<Cuenta, Long> getRepo() {
		return cuentaRepo;
	}

}
