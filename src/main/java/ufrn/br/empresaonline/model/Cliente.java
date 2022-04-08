package ufrn.br.empresaonline.model;


import ch.qos.logback.core.net.server.Client;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    String nome;

	//Caso 1
	@OneToOne(mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
	Endereco endereco;



    /*
    //Caso 2
    @OneToOne
    @JoinColumn(name = "endereco_id")
    Endereco endereco;
     */

	/*
	//Caso 3
	@OneToOne(mappedBy = "cliente")
	Endereco endereco;
	 */

	/*
	//Caso 4
	@OneToOne
	@JoinColumn(name ="endereco_id")
	Endereco endereco;
	 */

    /*
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "cliente")
    List<Pedido> pedidos;
     */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cliente cliente = (Cliente) o;
        return id != null && Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
