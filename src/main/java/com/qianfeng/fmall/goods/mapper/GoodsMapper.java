package com.qianfeng.fmall.goods.mapper;

import com.qianfeng.fmall.goods.bean.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    List<WxbGood> queryGoodsByPage(@Param("index")Integer index,@Param("size") Integer size);
}
