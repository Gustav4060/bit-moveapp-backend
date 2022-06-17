/**
 * 
 */
package com.businessit.service;

import java.time.LocalDate;
import java.util.List;

import com.businessit.dto.ReporteMovimientosDto;
import com.businessit.model.Movimiento;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public interface IMovimientoServicio extends ICRUD<Movimiento, Long> {
	
	List<ReporteMovimientosDto> reporteMovimientos(LocalDate fechaInicio, LocalDate fechaFin, Long idCliente);
	
	List<Movimiento> buscarMovimientosPorNumeroDeCuenta(Long idCuenta);
}
