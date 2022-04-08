package ufrn.br.empresaonline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String dataPedido;

    /*
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    Cliente cliente;
     */

    /*
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    List<Produto> produtos;
     */


    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dataPedido='" + dataPedido + '\'' +
                '}';
    }
}