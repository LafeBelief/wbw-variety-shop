package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsHomeNewProduct;
import cn.wbw.vs.model.SmsHomeNewProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsHomeNewProductMapper extends Mapper<SmsHomeNewProduct>, MySqlMapper<SmsHomeNewProduct>, IdsMapper<SmsHomeNewProduct>, ConditionMapper<SmsHomeNewProduct> {
    long countByExample(SmsHomeNewProductExample example);

    int deleteByExample(SmsHomeNewProductExample example);

    List<SmsHomeNewProduct> selectByExample(SmsHomeNewProductExample example);

    int updateByExampleSelective(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);

    int updateByExample(@Param("record") SmsHomeNewProduct record, @Param("example") SmsHomeNewProductExample example);
}