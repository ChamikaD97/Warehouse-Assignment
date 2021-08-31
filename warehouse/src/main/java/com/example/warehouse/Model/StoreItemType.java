package com.example.warehouse.Model;

import javax.persistence.*;

@Entity
public class StoreItemType {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Item_Id;

    private String Item_Name;

	public Integer getItem_Id() {
		return Item_Id;
	}

	public void setItem_Id(Integer item_Id) {
		Item_Id = item_Id;
	}

	public String getItem_Name() {
		return Item_Name;
	}

	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}

	public StoreItemType(Integer item_Id, String item_Name) {
		Item_Id = item_Id;
		Item_Name = item_Name;
	}

	public StoreItemType() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}
