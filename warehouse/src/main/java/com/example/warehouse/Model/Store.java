package com.example.warehouse.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Store_Id;

	private String Store_Capacity;

	private String Store_Location;

	public Integer getStore_Id() {
		return Store_Id;
	}

	public void setStore_Id(Integer store_Id) {
		Store_Id = store_Id;
	}

	public void setStore_Capacity(String store_Capacity) {
		Store_Capacity = store_Capacity;
	}

	public void setStore_Location(String store_Location) {
		Store_Location = store_Location;
	}

	public String getStore_Capacity() {
		return Store_Capacity;
	}

	public String getStore_Location() {
		return Store_Location;
	}

	public Store(Integer store_Id, String store_Capacity, String store_Location) {
		Store_Id = store_Id;
		Store_Capacity = store_Capacity;
		Store_Location = store_Location;
	}

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}


}
