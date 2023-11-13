package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
