package com.qianfeng.fmall.goods.service.impl;

import com.qianfeng.fmall.goods.dao.IGoodsDAO;
import com.qianfeng.fmall.goods.dao.impl.GoodsDAOImpl;
import com.qianfeng.fmall.goods.service.IGoodsService;

public class GoodsServiceImpl implements IGoodsService {
    private IGoodsDAO goodsDAO = new GoodsDAOImpl();
}
