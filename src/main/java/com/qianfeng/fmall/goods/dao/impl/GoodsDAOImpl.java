package com.qianfeng.fmall.goods.dao.impl;

import com.qianfeng.fmall.commons.info.SystemConstantsUtils;
import com.qianfeng.fmall.commons.mybatis.MyBatisSessionFactoryUtils;
import com.qianfeng.fmall.goods.bean.WxbGood;
import com.qianfeng.fmall.goods.dao.IGoodsDAO;
import com.qianfeng.fmall.goods.mapper.GoodsMapper;

import java.util.List;

public class GoodsDAOImpl implements IGoodsDAO{
    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) throws Exception{
        GoodsMapper goodsMapper = MyBatisSessionFactoryUtils.getSession().getMapper(GoodsMapper.class);
        List<WxbGood> goods =goodsMapper.queryGoodsByPage(page,SystemConstantsUtils.Page.PAGE_SIZE);
        return goods;
    }
}
