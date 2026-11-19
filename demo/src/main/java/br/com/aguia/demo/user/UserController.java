package br.com.aguia.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class UserController {
    @GetMapping("/api/status")
    public Map<String, String> status() {
        return Map.of("status", "ok");
    }
}
