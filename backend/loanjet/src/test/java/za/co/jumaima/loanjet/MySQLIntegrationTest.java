package za.co.jumaima.loanjet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import za.co.jumaima.loanjet.repositories.UserRepository;

@ActiveProfiles("dev")
@DataJpaTest
@ComponentScan(basePackages = {"za.co.jumaima.loanjet.bootstrap"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MySQLIntegrationTest {
    @Autowired
    UserRepository userRepository;
    @Test
    void testMySQL()
    {
        long countbefore= userRepository.count();
        Assertions.assertThat(countbefore).isEqualTo(2);
    }

}
