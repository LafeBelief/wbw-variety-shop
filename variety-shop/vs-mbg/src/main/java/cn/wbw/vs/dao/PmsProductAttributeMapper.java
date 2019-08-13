package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductAttribute;
import cn.wbw.vs.model.PmsProductAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductAttributeMapper extends Mapper<PmsProductAttribute>, MySqlMapper<PmsProductAttribute>, IdsMapper<PmsProductAttribute>, ConditionMapper<PmsProductAttribute> {
    long countByExample(PmsProductAttributeExample example);

    int deleteByExample(PmsProductAttributeExample example);

    List<PmsProductAttribute> selectByExample(PmsProductAttributeExample example);

    int updateByExampleSelective(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);

    int updateByExample(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);
}