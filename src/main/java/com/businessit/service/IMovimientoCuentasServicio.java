/**
 * 
 */
package com.businessit.service;

import com.businessit.dto.MovimientoDeCuentasDto;
import com.businessit.exception.MovimientosException;
import com.businessit.model.Movimiento;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public interface IMovimientoCuentasServicio {
	Movimiento validaRegistroMovimiento(MovimientoDeCuentasDto movimientoDeCuentasDto) throws MovimientosException;
}