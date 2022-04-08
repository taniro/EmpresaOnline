package ufrn.br.empresaonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.empresaonline.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
