package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	

	/*@PostMapping("/login")
	public User userLogin(@RequestParam("id") long id, @RequestParam("name") String name, @RequestParam("password") String password,@RequestParam("type") String type, @RequestParam("address") String address, @RequestParam("mobile") String mobile,@RequestParam("landmark") String landmark, @RequestParam("pincode") String pincode )	
	{
		User usr=new User();
		usr.setId(id);
		usr.setAddress(address);
		usr.setLandmark(landmark);
		usr.setName(name);
		usr.setPassword(password);
		usr.setMobile(mobile);
		
		return usr;
		
	}
	*/
	/*@GetMapping("/all")
	public List<User> userList()
	{
		List<User> users=new ArrayList<>();
		User usr1,usr2,usr3;
		usr1=new User("Arya","123");
		usr2=new User("Srijita","srij123");
		usr3=new User("Solanki","abcd");
		users.add(usr1);
		users.add(usr2);
		users.add(usr3);
		return users;
		
	}*/
	@Autowired
	
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
		User persistedUser=userRepository.save(user);
		return persistedUser;
	}
	
	
	@GetMapping("/getAll")
	public List<User> getAll()
	{
		List<User> listofUser=userRepository.findAll();
		return listofUser;
		
	}
	
	
	@PostMapping("/create")
	public User userCreate(@RequestBody User user)
	{
		System.out.println(user.toString());
		return user;
	}
	@PostMapping("/userLogin")
	public User userLogin(@RequestParam("name") String name, @RequestParam("password") String password)
	{
		User persistedUser=new User();
		persistedUser=userRepository.findByNameAndPassword(name, password);
		return persistedUser;
	}

	

}
