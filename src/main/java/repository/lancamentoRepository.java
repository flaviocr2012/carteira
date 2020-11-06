package repository;

import model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface lancamentoRepository extends JpaRepository<Lancamento, Long> {
}
