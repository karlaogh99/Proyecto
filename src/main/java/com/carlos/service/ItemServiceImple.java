package com.carlos.service;

import com.carlos.model.Item;
import com.carlos.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImple implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> getAllItem() {
        System.out.println("llega service");

        try {
        return itemRepository.findAll();
    }catch (Exception e){
        System.out.println(e);
        throw new RuntimeException(e);
    }
    }
}
