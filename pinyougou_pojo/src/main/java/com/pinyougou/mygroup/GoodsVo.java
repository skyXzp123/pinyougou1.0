package com.pinyougou.mygroup;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;

import java.io.Serializable;
import java.util.List;

/**商品组合实体类
 * @author ljh
 * @version V1.0
 * @description com.pinyougou.mygroup
 */
public class GoodsVo implements Serializable {

    private TbGoods tbGoods;//SPU 商品基本信息

    private TbGoodsDesc tbGoodsDesc;//SPU 商品描述信息

    private List<TbItem> tbItemList;//SKU 商品列表

    public TbGoods getTbGoods() {
        return tbGoods;
    }

    public void setTbGoods(TbGoods tbGoods) {
        this.tbGoods = tbGoods;
    }

    public TbGoodsDesc getTbGoodsDesc() {
        return tbGoodsDesc;
    }

    public void setTbGoodsDesc(TbGoodsDesc tbGoodsDesc) {
        this.tbGoodsDesc = tbGoodsDesc;
    }

    public List<TbItem> getTbItemList() {
        return tbItemList;
    }

    public void setTbItemList(List<TbItem> tbItemList) {
        this.tbItemList = tbItemList;
    }
}
