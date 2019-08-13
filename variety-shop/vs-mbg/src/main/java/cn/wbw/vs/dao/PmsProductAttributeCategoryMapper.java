package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductAttributeCategory;
import cn.wbw.vs.model.PmsProductAttributeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductAttributeCategoryMapper extends Mapper<PmsProductAttributeCategory>, MySqlMapper<PmsProductAttributeCategory>, IdsMapper<PmsProductAttributeCategory>, ConditionMapper<PmsProductAttributeCategory> {
    long countByExample(PmsProductAttributeCategoryExample example);

    int deleteByExample(PmsProductAttributeCategoryExample example);

    List<PmsProductAttributeCategory> selectByExample(PmsProductAttributeCategoryExample example);

    int updateByExampleSelective(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);

    int updateByExample(@Param("record") PmsProductAttributeCategory record, @Param("example") PmsProductAttributeCategoryExample example);
}