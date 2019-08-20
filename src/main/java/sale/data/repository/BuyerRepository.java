package sale.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sale.data.model.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
