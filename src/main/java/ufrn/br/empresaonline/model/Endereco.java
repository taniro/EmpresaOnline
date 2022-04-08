package ufrn.br.empresaonline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Endereco {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String rua;


	//Caso 1
	@OneToOne
	@MapsId
	@JoinColumn(name = "cliente_id")
	Cliente cliente;



	/*
	//Caso 2
	@OneToOne(mappedBy = "endereco")
	Cliente cliente;
	 */


	/*
	//Caso 3
	@OneToOne
	@JoinColumn(name = "cliente_id")
	Cliente cliente;
	 */

	/*
	//Caso 4
	@OneToOne
	@JoinColumn(name = "cliente_id")
	Cliente cliente;
	 */
}