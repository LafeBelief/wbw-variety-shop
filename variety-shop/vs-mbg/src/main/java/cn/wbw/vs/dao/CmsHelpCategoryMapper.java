package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsHelpCategory;
import cn.wbw.vs.model.CmsHelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsHelpCategoryMapper extends Mapper<CmsHelpCategory>, MySqlMapper<CmsHelpCategory>, IdsMapper<CmsHelpCategory>, ConditionMapper<CmsHelpCategory> {
    long countByExample(CmsHelpCategoryExample example);

    int deleteByExample(CmsHelpCategoryExample example);

    List<CmsHelpCategory> selectByExample(CmsHelpCategoryExample example);

    int updateByExampleSelective(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    int updateByExample(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);
}