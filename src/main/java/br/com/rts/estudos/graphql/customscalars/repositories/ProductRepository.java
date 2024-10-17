package br.com.rts.estudos.graphql.customscalars.repositories;

import br.com.rts.estudos.graphql.customscalars.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
