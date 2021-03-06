/**
 * 
 */
package com.businessit.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.businessit.enumeration.TipoCuentaEnum;

import lombok.Data;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Data
@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_cuenta", nullable = false)
	private Long numeroCuenta;

	@Column(name = "tipo_cuenta", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	private TipoCuentaEnum tipoCuenta;

	@Column(name = "saldo_inicial", nullable = false)
	private BigDecimal saldoInicial;

	@Column(name = "estado", nullable = false)
	private Boolean estado;

	@Column(name = "cliente_id", nullable = false)
	private Long idCliente;

	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false, updatable = false, insertable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_cuenta_cliete"))
	// @JoinColumn(name = "cliente_id", nullable = false, referencedColumnName =
	// "id", foreignKey = @ForeignKey(name = "FK_cuenta_cliete"))
	private Cliente cliente;

}
