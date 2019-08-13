package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsSubjectProductRelation;
import cn.wbw.vs.model.CmsSubjectProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsSubjectProductRelationMapper extends Mapper<CmsSubjectProductRelation>, MySqlMapper<CmsSubjectProductRelation>, IdsMapper<CmsSubjectProductRelation>, ConditionMapper<CmsSubjectProductRelation> {
    long countByExample(CmsSubjectProductRelationExample example);

    int deleteByExample(CmsSubjectProductRelationExample example);

    List<CmsSubjectProductRelation> selectByExample(CmsSubjectProductRelationExample example);

    int updateByExampleSelective(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);

    int updateByExample(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);
}