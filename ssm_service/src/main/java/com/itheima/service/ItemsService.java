package com.itheima.service;

import com.itheima.bean.Items;

import java.util.List;

public interface ItemsService {
    /**
     * 列表查询
     * @return
     */
    List<Items> findAll();

    /**
     * 添加数据
     * @param items
     * @return
     */
    int save(Items items);
}
