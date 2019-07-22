package com.warrior.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.warrior.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsMapper  extends BaseMapper<Goods> {
    @Select("select id, name ,pic from hk_goods")
    List<Goods> selectGoods();

}
