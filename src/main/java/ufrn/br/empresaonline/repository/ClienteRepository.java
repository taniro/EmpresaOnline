package ufrn.br.empresaonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.empresaonline.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
