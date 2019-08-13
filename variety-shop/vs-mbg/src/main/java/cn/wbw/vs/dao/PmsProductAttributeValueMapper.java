package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductAttributeValue;
import cn.wbw.vs.model.PmsProductAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductAttributeValueMapper extends Mapper<PmsProductAttributeValue>, MySqlMapper<PmsProductAttributeValue>, IdsMapper<PmsProductAttributeValue>, ConditionMapper<PmsProductAttributeValue> {
    long countByExample(PmsProductAttributeValueExample example);

    int deleteByExample(PmsProductAttributeValueExample example);

    List<PmsProductAttributeValue> selectByExample(PmsProductAttributeValueExample example);

    int updateByExampleSelective(@Param("record") PmsProductAttributeValue record, @Param("example") PmsProductAttributeValueExample example);

    int updateByExample(@Param("record") PmsProductAttributeValue record, @Param("example") PmsProductAttributeValueExample example);
}