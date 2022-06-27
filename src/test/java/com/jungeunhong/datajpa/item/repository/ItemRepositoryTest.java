package com.jungeunhong.datajpa.item.repository;

import com.jungeunhong.datajpa.item.domain.entity.Item;
import com.jungeunhong.datajpa.item.domain.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void save(){
        // given
        Item item = new Item("ㅁ");
        // when
        Item save = itemRepository.save(item);
        // than
    }

}