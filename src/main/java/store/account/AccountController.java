package store.account;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "account", url = "http://account:8080")
public interface AccountController {

    @PostMapping("/account")
    public ResponseEntity<AccountOut> create(
        @RequestBody AccountIn accountIn
    );

    @GetMapping("/account")
    public ResponseEntity<List<AccountOut>> findAll();

    @PostMapping("/account/login")
    public ResponseEntity<AccountOut> findByEmailAndPassword(
        @RequestBody AccountIn accountIn
    );

    @GetMapping("/account/whoami")
    public ResponseEntity<AccountOut> whoami(
        @RequestHeader(value = "id-account", required = true) String idAccount
    );

}
