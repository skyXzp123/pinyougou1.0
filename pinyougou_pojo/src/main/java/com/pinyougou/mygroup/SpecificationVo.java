package com.pinyougou.mygroup;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**用于传递页面和接收页面的值（规格及规格选项相关）
 * @author ljh
 * @version V1.0
 * @description com.pinyougou.manager.pojo
 */
public class SpecificationVo implements Serializable{

    private TbSpecification tbSpecification;//一个规格

    private List<TbSpecificationOption> optionList;//多个规格选项

    public TbSpecification getTbSpecification() {
        return tbSpecification;
    }

    public void setTbSpecification(TbSpecification tbSpecification) {
        this.tbSpecification = tbSpecification;
    }

    public List<TbSpecificationOption> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<TbSpecificationOption> optionList) {
        this.optionList = optionList;
    }
}
