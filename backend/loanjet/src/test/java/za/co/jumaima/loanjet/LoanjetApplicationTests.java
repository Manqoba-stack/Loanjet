package za.co.jumaima.loanjet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.jumaima.loanjet.domain.LoanUser;
import za.co.jumaima.loanjet.repositories.UserRepository;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LoanjetApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void testUserRepository(){
		long countBefore=userRepository.count();

		userRepository.save(new LoanUser("oliwe","Makhoba","nqobzin588@gmail.com","0685059164","252 mofakeng ngema",true));

		long countAfter=userRepository.count();

		assertTrue(countBefore>0);

	}
	@Test
	void contextLoads() {

	}

}
