package com.thinkxfactor.zomatoplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestuarantRepository;


@RestController
@RequestMapping("/restaurant")
public class RestaurantControllers {
	@Autowired
	private RestuarantRepository restaurantrepository;
	
	
	@Autowired
	private ItemRepository itemrepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant)
	{
		Restaurant persistedRestaurant=restaurantrepository.save(restaurant);
		return persistedRestaurant;
	}
	
	@GetMapping("/getall")
	public List<Restaurant> getAll()
	{
		List<Restaurant> listofRestaurants=restaurantrepository.findAll();
		return listofRestaurants;
	}
	@PostMapping("/additem")
	public Item additem(@RequestBody Item item)
	{
	
		Item persistedItem=itemrepository.save(item);
		return persistedItem;
	}
	/*@GetMapping("/getall")
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
	public Restaurant createRestaurant(@RequestParam("name") String name,@RequestParam("address") String address,@RequestParam("website") String website,@RequestParam("phoneNumber") String phoneNumber)
	{
	//public Restaurant createRestaurant(@RequestBody Restaurant res1){
		Restaurant rest=new Restaurant();
		rest.setName(name);
		rest.setAddress(address);
		rest.setPhoneNumber(phoneNumber);
		rest.setWebsite(website);
		//System.out.println(res.toString());
		return rest;
		
	}
@PostMapping("/additems")
public Item addItems(@RequestParam("restaurantName") String restaurantName,@RequestParam("Items") Map<String,Integer> items)
{
	Item i1=new Item();
	i1.setItems(items);
	i1.setRestaurantName(restaurantName);
	return i1;
}
	
//@PostMapping("/additems")
//public Item addItems(@RequestParam("restaurantName") String restaurantName,@RequestParam("Items") Map<String,Integer> items)
//{
	/*Map<String,List<String>> m1=new HashMap<>();
	List<String> l1=new ArrayList<>();
	List<String> l2=new ArrayList<>();
	List<String> l3=new ArrayList<>();
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
	return m1;*/
	
	

	
}

