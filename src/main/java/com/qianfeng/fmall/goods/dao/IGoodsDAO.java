package com.qianfeng.fmall.goods.dao;

import com.qianfeng.fmall.goods.bean.WxbGood;

import java.util.List;

/**
 * 商品管理
 */
public interface IGoodsDAO {
 List<WxbGood> queryGoodsByPage(Integer page) throws Exception;
}
