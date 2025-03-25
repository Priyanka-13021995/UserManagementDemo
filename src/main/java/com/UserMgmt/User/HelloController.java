package com.UserMgmt.User;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class HelloController {

	@Autowired
    private UserService userService;
	
	@GetMapping("/getMsg")
	public void msg()
	{
		System.out.println("Welcome");
		System.out.println("DataType is : " + Constants.DATA_TYPE);
		
	}
	
	@GetMapping("/getUser")
	public String msg1(@RequestBody Order order)
	{
		System.out.println("Welcome");
		System.out.println("user Name is : " + order.getUser() + "User Password is :" + order.getPassword() );
		return "user Name is : " + order.getUser() + "User Password is :" + order.getPassword();
		
	}

    @PostMapping("/create")
    public ResponseEntity<user> createUser(@RequestBody user user) {
        user savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/{uid}")
    public ResponseEntity<user> getUser(@PathVariable String uid) {
        user user = userService.getUser(uid);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
