package za.co.jumaima.loanjet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.jumaima.loanjet.domain.LoanUser;

@Repository
public interface UserRepository  extends JpaRepository<LoanUser,Long> {
}
