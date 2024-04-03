package com.dambu.dambu_store_backend.resource;


import com.dambu.dambu_store_backend.domain.HttpResponse;
import com.dambu.dambu_store_backend.domain.User;
import com.dambu.dambu_store_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

import static java.time.LocalDate.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor

public class UserResource {
    private final UserService userService;




    @PostMapping("/create-user")
    public ResponseEntity<HttpResponse> createUser(@RequestBody User user){
        return ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(now().toString())
                        .data(Map.of("User", userService.createUser(user)))
                        .message("User Created Successfully")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @PutMapping("/update/{id}")





    @GetMapping("/users")
    public ResponseEntity<HttpResponse> getUsers(@RequestParam Optional<String> name, @RequestParam Optional<Integer> page, @RequestParam Optional<Integer> size){
        return  ResponseEntity.ok().body(
                HttpResponse.builder()
                        .timeStamp(now().toString())
                        .data(Map.of("page", userService.getUsers(name.orElse(""), page.orElse(1), size.orElse(1) )))
                        .message("User Retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }




}
