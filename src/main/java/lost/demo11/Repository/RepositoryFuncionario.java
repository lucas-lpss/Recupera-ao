package lost.demo11.Repository;

import lost.demo11.Entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryFuncionario extends JpaRepository<Funcionario, Long > {
}
