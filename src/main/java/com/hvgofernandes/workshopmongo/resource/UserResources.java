package com.hvgofernandes.workshopmongo.resource;

import com.hvgofernandes.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @GetMapping
    // @RequestMapping(method=RequestMethod.GET) também daria certo!
    public ResponseEntity<List<User>> findAll() {
       User maria = new User("1", "Maria Brown", "maria@gmail.com");
       User alex = new User("2", "Alex Green", "alex@gmail.com");
       List<User> list = new ArrayList<>();
       list.addAll(Arrays.asList(maria,alex));
       return ResponseEntity.ok().body(list);
    }
}
