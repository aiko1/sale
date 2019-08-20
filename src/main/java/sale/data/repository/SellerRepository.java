package sale.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sale.data.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
