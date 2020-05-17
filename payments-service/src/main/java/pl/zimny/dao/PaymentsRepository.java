package pl.zimny.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zimny.model.Payment;

import java.util.Optional;

@Repository
public interface PaymentsRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByPaymentId(Long paymentId);
    Optional<Payment> findByUserId(Long userId);
    Optional<Payment> findByUsername(String username);
}