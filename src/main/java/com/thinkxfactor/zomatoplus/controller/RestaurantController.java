package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@GetMapping("/getall")
	public List<Restaurant> RestaurantList()
	{
		List<Restaurant> restaurants=new ArrayList<>();
		Restaurant res1,res2,res3;
		res1=new Restaurant("Solanki","xyz987","ad1","ph1");
		res2=new Restaurant("Srijita","abc123","ad2","ph2");
		res3=new Restaurant("Srija","winter is coming","ad3","ph3");
		restaurants.add(res1);
		restaurants.add(res2);
		restaurants.add(res3);
		return restaurants;
	}	
	@PostMapping("/create")
	//public Restaurant createRestaurant(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("website") String website,@RequestParam("phoneNumber") String phoneNumber)
	public Restaurant createRestaurant(@RequestBody Restaurant res){
		Restaurant res=new Restaurant();
		res.setName(name);
		res.setAddress(address);
		res.setPhoneNumber(phoneNumber);
		res.setWebsite(website);
		//System.out.println(res.toString());
		return res;
		
	}
	@PostMapping("/additems")
	public Items additem(@RequestParam("restaurantName") String restaurantName,@RequestParam("items") Map<String,Integer> items) 
	//public Items additem(@RequestBody Items i1)
	{
		Items i1=new Items();
		i1.setItems(items);
		i1.setRestaurantName(restaurantName);
		//System.out.println(i1.toString());
		return i1;
		
		
	}
@PostMapping("/additems")
public Map<String,List<String>> addItems()
{
	Map<String,List<String>> m1=new HashMap<>();
	List<String> l1=new ArrayList<>();
	List<String> l2=new ArrayList<>();
	List<String> l3=new ArrayList<>();
	Items i1=new Items();
	//List<String> l1,l2,l3;
	Restaurant res1=new Restaurant();
	Restaurant res2=new Restaurant();
	Restaurant res3=new Restaurant();
	res1.setName("res1");
	res2.setName("res2");
	res3.setName("res3");
	l1.add("fried rice");
	l1.add("burger");
	l1.add("pizza");
	l2.add("sandwich");
	l2.add("Chilli chickeN");
	l3.add("pepsi");
	m1.put(res1.getName(), l1);
	m1.put(res2.getName(), l2);
	m1.put(res3.getName(), l3);
	return m1;
	

}

