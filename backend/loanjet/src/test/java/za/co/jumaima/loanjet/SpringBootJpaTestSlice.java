package za.co.jumaima.loanjet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import za.co.jumaima.loanjet.domain.LoanUser;
import za.co.jumaima.loanjet.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.assertTrue;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SpringBootJpaTestSlice {
    @Autowired
    UserRepository userRepository;

    @Test
//    @Disabled
    void testCRUDO()
    {
        long countBefore=userRepository.count();

        userRepository.save(new LoanUser("oliwe","Makhoba","nqobzin588@gmail.com","0685059164","252 mofakeng ngema",true));

        long countAfter=userRepository.count();

        assertTrue(countBefore<countAfter);
    }

}
