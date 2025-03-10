package com.hvgofernandes.workshopmongo.resource;

import com.hvgofernandes.workshopmongo.domain.User;
import com.hvgofernandes.workshopmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @Autowired
    private UserService userService;

    @GetMapping
    // @RequestMapping(method=RequestMethod.GET) também daria certo!
    public ResponseEntity<List<User>> findAll() {
       List<User> list = userService.findAll();
       return ResponseEntity.ok().body(list);
    }
}
