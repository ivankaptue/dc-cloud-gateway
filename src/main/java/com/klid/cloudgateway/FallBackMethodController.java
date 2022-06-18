package com.klid.cloudgateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ivan Kaptue
 */
@RestController
public class FallBackMethodController {

    @GetMapping("/user-service-fall-back")
    public ResponseEntity<String> userServiceFallBackMethod() {
        return ResponseEntity.ok("User service is taking longer than expected");
    }

    @GetMapping("/department-service-fall-back")
    public ResponseEntity<String> departmentServiceFallBackMethod() {
        return ResponseEntity.ok("Department service is taking longer than expected");
    }

}
