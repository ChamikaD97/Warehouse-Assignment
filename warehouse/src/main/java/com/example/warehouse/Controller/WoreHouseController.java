package com.example.warehouse.Controller;


import com.example.warehouse.Model.StoreItemType;
import com.example.warehouse.Service.StoreItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class WoreHouseController {

    @Autowired
    private StoreItemTypeService storeItemTypeService;

    @GetMapping("/GetStoreItems")
    public List<StoreItemType> GetStoreItems(){
        System.out.println("+++++++++++++++" + storeItemTypeService.getStoreTypeItems());
        return (List<StoreItemType>) storeItemTypeService.getStoreTypeItems();
    }


    @PostMapping("/AddStoreItems")
    public void AddStoreItems(@RequestBody StoreItemType storeItemType){
        System.out.println(storeItemType.getItem_Name());
        System.out.println(storeItemType.getItem_Id());

        storeItemTypeService.AddType(storeItemType);
    }

    @PutMapping("/UpdateItems")
    public void  UpdateItems(@RequestBody StoreItemType storeItemType){
        storeItemTypeService.UpdateItems(storeItemType);
    }

    @PostMapping("/DeleteItems")
    public  void DeleteItem(@RequestBody StoreItemType storeItemType){
        System.out.println(storeItemType.getItem_Id());
        storeItemTypeService.DeleteItems(storeItemType.getItem_Id());
    }
}
