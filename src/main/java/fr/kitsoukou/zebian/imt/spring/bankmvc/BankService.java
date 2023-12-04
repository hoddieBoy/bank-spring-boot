package fr.kitsoukou.zebian.imt.spring.bankmvc;

import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BankService {

    private final AccountRepository accountRepository;

    public BankService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts() {
        return (List<Account>) accountRepository.findAll();
    }

    public Account getAccount(String owner){
        return accountRepository.findById(owner).orElse(null);
    }

    public Account createAccount(AccountBodyRequest account) {
        return null;
    }
}
