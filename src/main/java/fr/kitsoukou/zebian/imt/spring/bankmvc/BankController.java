package fr.kitsoukou.zebian.imt.spring.bankmvc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAllAccounts() {
        return ResponseEntity.ok(bankService.getAllAccounts());
    }

    @GetMapping("/accounts/{owner}")
    public ResponseEntity<Account> getAccount(@PathVariable String owner) {
        return ResponseEntity.ok(bankService.getAccount(owner));
    }

    @PostMapping("/accounts")
    public ResponseEntity<Account> createAccount(@RequestBody AccountBodyRequest account) {
        return ResponseEntity.ok(bankService.createAccount(account));
    }

}
