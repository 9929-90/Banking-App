package net.ashwatthama.banking.Repository;

import net.ashwatthama.banking.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
