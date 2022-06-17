/**
 * 
 */
package com.businessit.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.businessit.enumeration.TipoMovimientoEnum;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
public class MovimientoDto {

	private Long idMovimientos;

	private LocalDateTime fecha;

	private TipoMovimientoEnum tipoMovimiento;

	private BigDecimal valor;

	private BigDecimal saldo;

	private Long numeroCuenta;

}
