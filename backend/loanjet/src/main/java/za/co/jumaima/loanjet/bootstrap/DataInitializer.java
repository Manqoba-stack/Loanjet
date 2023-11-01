package za.co.jumaima.loanjet.bootstrap;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;
import za.co.jumaima.loanjet.domain.LoanUser;
import za.co.jumaima.loanjet.repositories.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataInitializer(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        LoanUser loanUser1 =new LoanUser("Manqoba","Makhoba","manyoba1997@gmail.com","0685059164","252 mofakeng ngema",true);

        LoanUser savedLoanUser =userRepository.save(loanUser1);

//        userRepository.findAll().forEach(user->{
//
//            System.out.println(user.getName());
//        });

    }
}
