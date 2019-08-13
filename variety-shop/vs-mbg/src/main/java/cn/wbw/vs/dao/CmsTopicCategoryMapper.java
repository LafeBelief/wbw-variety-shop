package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsTopicCategory;
import cn.wbw.vs.model.CmsTopicCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsTopicCategoryMapper extends Mapper<CmsTopicCategory>, MySqlMapper<CmsTopicCategory>, IdsMapper<CmsTopicCategory>, ConditionMapper<CmsTopicCategory> {
    long countByExample(CmsTopicCategoryExample example);

    int deleteByExample(CmsTopicCategoryExample example);

    List<CmsTopicCategory> selectByExample(CmsTopicCategoryExample example);

    int updateByExampleSelective(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);

    int updateByExample(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);
}