/**
 * 
 */
package com.businessit.service.impl;

import java.util.List;

import com.businessit.exception.MovimientosException;
import com.businessit.repository.IGenericRepo;
import com.businessit.service.ICRUD;



/**
 * @author gustavoefrainparcosanchez
 *
 */
public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID>{

	protected abstract IGenericRepo<T, ID> getRepo();
	
	@Override
	public T registrar(T t) throws MovimientosException {
		return getRepo().save(t);
	}

	@Override
	public T modificar(T t) throws MovimientosException {
		return getRepo().save(t);
	}

	@Override
	public List<T> listar() throws MovimientosException {
		return getRepo().findAll();
	}

	@Override
	public T listarPorId(ID id) throws MovimientosException {
		return getRepo().findById(id).orElse(null);
	}

	@Override
	public void eliminar(ID id) throws MovimientosException {
		getRepo().deleteById(id);
	}

}

