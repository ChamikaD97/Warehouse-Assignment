package com.example.warehouse.Service;

import com.example.warehouse.Model.StoreItemType;
import com.example.warehouse.Repository.StoreItemTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class StoreItemTypeService {

    @Autowired
    private StoreItemTypeRepository storeItemtypeRepo;

    public void AddType(StoreItemType storeItemType){
        storeItemtypeRepo.save(storeItemType);
    }
    public List<StoreItemType> getStoreTypeItems(){
        return (List<StoreItemType>) storeItemtypeRepo.findAll() ;
    }
    public void UpdateItems(StoreItemType storeItemType){
        storeItemtypeRepo.save(storeItemType);
    }
    public void DeleteItems(Integer Id){
        storeItemtypeRepo.deleteById(Id);
    }
}
