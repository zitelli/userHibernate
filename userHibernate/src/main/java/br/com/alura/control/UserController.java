package br.com.alura.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.domain.User;
import br.com.alura.service.UserService;

@RestController
@RequestMapping("/api/users") // Base path for user endpoints
public class UserController {

  @Autowired
  private UserService userService; // Service to handle user logic

  @GetMapping("/{id}") // GET request for a specific user by ID
  public ResponseEntity<User> getUserById(@PathVariable Long id) {
    User user = userService.findById(id);
    if (user == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(user);
  }
  
  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody User user) {
    userService.createUser(user);
    return null;
  }

}
