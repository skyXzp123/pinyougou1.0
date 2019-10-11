package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 许泽平
 * @version 1.0
 * @description 描述
 * @title 标题
 * @package com.pinyougou.sellergoods.service.impl
 * @company www.pinyougou.com
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {

        return tbBrandMapper.selectByExample(null);

    }
}
