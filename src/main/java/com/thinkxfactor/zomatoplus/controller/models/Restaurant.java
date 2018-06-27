package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="table_restaurant")
public class Restaurant implements Serializable
{
	@Id
	@GeneratedValue
	@Column(name="res_id")
	private long id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="name")
	private String name;
	
	@Column(name="website")
	private String website;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="desciption")
	private String description;
	
	@Column(name="like_count")
	private String like_count;
	
	@Column(name="address")
	private String address;
	
	public Restaurant()
	{
		
	}
	public Restaurant(long id,String city,String name,String website,String contact,String description,String like_count)
	{
		this.id=id;
		this.city=city;
		this.name=name;
		this.website=website;
		this.contact=contact;
		this.description=description;
		this.address=address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLike_count() {
		return like_count;
	}
	public void setLike_count(String like_count) {
		this.like_count = like_count;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
