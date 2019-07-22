package com.warrior.controler;

import com.warrior.entity.Goods;
import com.warrior.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Goods> goodsList() {
        return goodsService.goodsList();
    }
}
