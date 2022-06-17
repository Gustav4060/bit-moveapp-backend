/**
 * 
 */
package com.businessit.dto;


import java.math.BigDecimal;

import com.businessit.enumeration.TipoMovimientoEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovimientoDeCuentasDto {
	private Long numeroCuenta;
	private TipoMovimientoEnum tipoMovimiento;
	private BigDecimal valor;
}
