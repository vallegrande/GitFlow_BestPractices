package pe.edu.vallegrande.gitflowpractices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.gitflowpractices.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
