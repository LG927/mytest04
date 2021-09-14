package com.itheima.tet;

import com.itheima.bean.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItemsService {

    @Test
    public void findAll(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService as = applicationContext.getBean(ItemsService.class);
        System.out.println(as.findAll());
    }

    @Test
    public void save(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService as = applicationContext.getBean(ItemsService.class);
        Items items = new Items();
        items.setName("大数据");
        items.setPic("666");
        as.save(items);

    }
}
