package com.itheima.controller;

import com.itheima.bean.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {


    @Autowired
    private ItemsService as;

    //查询所有的
    @RequestMapping("/list")
    public String list(Model model){
        List<Items> list = as.findAll();

        //装到model里面
        model.addAttribute("items",list);

        //返回页面
        return "items";
    }

    @RequestMapping("/save")
    public String save(Items items){
        as.save(items);

        return "redirect:/items/list";
    }
}
