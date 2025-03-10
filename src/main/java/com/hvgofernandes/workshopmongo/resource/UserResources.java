package com.hvgofernandes.workshopmongo.resource;

import com.hvgofernandes.workshopmongo.domain.User;
import com.hvgofernandes.workshopmongo.dto.UserDTO;
import com.hvgofernandes.workshopmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @Autowired
    private UserService userService;

    @GetMapping
    // @RequestMapping(method=RequestMethod.GET) também daria certo!
    public ResponseEntity<List<UserDTO>> findAll() {
       List<User> list = userService.findAll();
       List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
       return ResponseEntity.ok().body(listDto);
    }
}
