package com.pinyougou.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 品牌业务申请接口
 * @author 许泽平
 */
public interface BrandService {

    /**
     * 获取所有的品牌
     * @return
     */
    public List<TbBrand> findAll();

}
