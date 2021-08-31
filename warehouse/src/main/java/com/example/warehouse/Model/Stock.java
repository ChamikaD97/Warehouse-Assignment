package com.example.warehouse.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Stock {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Stock_Id;

	private Integer Stock_Count;

	private Date Stock_Date;

	private Integer Store_Id;
	private Integer Item_Id;


	public Integer getStore_Id() {
		return Store_Id;
	}

	public void setStore_Id(Integer store_Id) {
		Store_Id = store_Id;
	}

	public Integer getItem_Id() {
		return Item_Id;
	}

	public void setItem_Id(Integer item_Id) {
		Item_Id = item_Id;
	}

	public Integer getStock_Id() {
		return Stock_Id;
	}

	public Integer getStock_Count() {
		return Stock_Count;
	}

	public Date getStock_Date() {
		return Stock_Date;
	}

	public void setStock_Id(Integer stock_Id) {
		Stock_Id = stock_Id;
	}

	public void setStock_Count(Integer stock_Count) {
		Stock_Count = stock_Count;
	}

	public void setStock_Date(Date stock_Date) {
		Stock_Date = stock_Date;
	}

	public Stock(Integer stock_Id, Integer stock_Count, Date stock_Date, Integer store_Id, Integer item_Id) {
		Stock_Id = stock_Id;
		Stock_Count = stock_Count;
		Stock_Date = stock_Date;
		Store_Id = store_Id;
		Item_Id = item_Id;
	}

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}


}
