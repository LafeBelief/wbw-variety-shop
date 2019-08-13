package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductCategoryAttributeRelation;
import cn.wbw.vs.model.PmsProductCategoryAttributeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductCategoryAttributeRelationMapper extends Mapper<PmsProductCategoryAttributeRelation>, MySqlMapper<PmsProductCategoryAttributeRelation>, IdsMapper<PmsProductCategoryAttributeRelation>, ConditionMapper<PmsProductCategoryAttributeRelation> {
    long countByExample(PmsProductCategoryAttributeRelationExample example);

    int deleteByExample(PmsProductCategoryAttributeRelationExample example);

    List<PmsProductCategoryAttributeRelation> selectByExample(PmsProductCategoryAttributeRelationExample example);

    int updateByExampleSelective(@Param("record") PmsProductCategoryAttributeRelation record, @Param("example") PmsProductCategoryAttributeRelationExample example);

    int updateByExample(@Param("record") PmsProductCategoryAttributeRelation record, @Param("example") PmsProductCategoryAttributeRelationExample example);
}