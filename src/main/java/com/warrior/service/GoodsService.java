package com.warrior.service;

import com.baomidou.mybatisplus.service.IService;
import com.warrior.entity.Goods;

import java.util.List;

public interface GoodsService extends IService<Goods> {
    public List<Goods> goodsList();
}
