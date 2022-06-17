/**
 * 
 */
package com.businessit.dto;

import java.math.BigDecimal;

import com.businessit.enumeration.TipoCuentaEnum;
import com.businessit.model.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
public class CuentaDto {

	private Long numeroCuenta;

	private TipoCuentaEnum tipoCuenta;

	private BigDecimal saldoInicial;

	private Boolean estado;

	private Long idCliente;

	@JsonIgnore
	private Cliente cliente;

}
