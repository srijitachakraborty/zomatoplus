

package com.thinkxfactor.zomatoplus.models;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="table_item")
public class Item {
	@Id
	@GeneratedValue
	@Column(name="Item_id")
	private long id;
	
	@Column(name="res_id")
	private long res_id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="description")
	private String description;
	
	public Item()
	{
		
	}
	public Item(long id,long res_id,String name,Double price,String description)
	{
		this.id=id;
		this.res_id=res_id;
		this.name=name;
		this.price=price;
		this.description=description;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRes_id() {
		return res_id;
	}
	public void setRes_id(long res_id) {
		this.res_id = res_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
