package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsPrefrenceAreaProductRelation;
import cn.wbw.vs.model.CmsPrefrenceAreaProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsPrefrenceAreaProductRelationMapper extends Mapper<CmsPrefrenceAreaProductRelation>, MySqlMapper<CmsPrefrenceAreaProductRelation>, IdsMapper<CmsPrefrenceAreaProductRelation>, ConditionMapper<CmsPrefrenceAreaProductRelation> {
    long countByExample(CmsPrefrenceAreaProductRelationExample example);

    int deleteByExample(CmsPrefrenceAreaProductRelationExample example);

    List<CmsPrefrenceAreaProductRelation> selectByExample(CmsPrefrenceAreaProductRelationExample example);

    int updateByExampleSelective(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);

    int updateByExample(@Param("record") CmsPrefrenceAreaProductRelation record, @Param("example") CmsPrefrenceAreaProductRelationExample example);
}