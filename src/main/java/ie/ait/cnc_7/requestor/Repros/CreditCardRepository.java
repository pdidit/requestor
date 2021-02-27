package ie.ait.cnc_7.requestor.Repros;

import ie.ait.cnc_7.requestor.Domain.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
