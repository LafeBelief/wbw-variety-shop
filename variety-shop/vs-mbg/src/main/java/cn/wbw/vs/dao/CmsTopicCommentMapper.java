package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsTopicComment;
import cn.wbw.vs.model.CmsTopicCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsTopicCommentMapper extends Mapper<CmsTopicComment>, MySqlMapper<CmsTopicComment>, IdsMapper<CmsTopicComment>, ConditionMapper<CmsTopicComment> {
    long countByExample(CmsTopicCommentExample example);

    int deleteByExample(CmsTopicCommentExample example);

    List<CmsTopicComment> selectByExample(CmsTopicCommentExample example);

    int updateByExampleSelective(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);

    int updateByExample(@Param("record") CmsTopicComment record, @Param("example") CmsTopicCommentExample example);
}