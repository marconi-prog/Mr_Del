// mr.deli.controller.UserController.java
package mr.deli.controller;

import mr.deli.model.User;
import mr.deli.service.UserService; // Iremos criar esta classe
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/profile")
    @PreAuthorize("isAuthenticated()") //
    public ResponseEntity<User> getMyProfile() {
        User user = userService.getAuthenticatedUser();
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }


}