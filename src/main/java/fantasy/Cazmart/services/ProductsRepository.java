package fantasy.Cazmart.services;

import org.springframework.data.jpa.repository.JpaRepository;

import fantasy.Cazmart.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
