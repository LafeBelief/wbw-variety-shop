package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsSubjectCategory;
import cn.wbw.vs.model.CmsSubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsSubjectCategoryMapper extends Mapper<CmsSubjectCategory>, MySqlMapper<CmsSubjectCategory>, IdsMapper<CmsSubjectCategory>, ConditionMapper<CmsSubjectCategory> {
    long countByExample(CmsSubjectCategoryExample example);

    int deleteByExample(CmsSubjectCategoryExample example);

    List<CmsSubjectCategory> selectByExample(CmsSubjectCategoryExample example);

    int updateByExampleSelective(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    int updateByExample(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);
}