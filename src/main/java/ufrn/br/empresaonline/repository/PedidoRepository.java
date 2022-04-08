package ufrn.br.empresaonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.empresaonline.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
