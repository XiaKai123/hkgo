package com.warrior.serviceImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.warrior.entity.Goods;
import com.warrior.mapper.GoodsMapper;
import com.warrior.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
    @Override
    public List<Goods> goodsList() {
        return this.baseMapper.selectGoods();
    }
}
