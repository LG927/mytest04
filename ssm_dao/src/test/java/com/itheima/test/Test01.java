package com.itheima.test;

import com.itheima.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void testFindAll(){

        //1. 创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        //2. 问工厂要对象
        ItemsDao dao =  context.getBean(ItemsDao.class);

        //3.调用方法
        System.out.println(dao.findAll());


    }
}
