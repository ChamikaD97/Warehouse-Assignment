package com.example.warehouse.Service;


import com.example.warehouse.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockSerice {

    @Autowired
    private StockRepository stockRepo;



}
