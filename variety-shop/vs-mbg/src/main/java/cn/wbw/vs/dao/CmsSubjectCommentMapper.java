package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsSubjectComment;
import cn.wbw.vs.model.CmsSubjectCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsSubjectCommentMapper extends Mapper<CmsSubjectComment>, MySqlMapper<CmsSubjectComment>, IdsMapper<CmsSubjectComment>, ConditionMapper<CmsSubjectComment> {
    long countByExample(CmsSubjectCommentExample example);

    int deleteByExample(CmsSubjectCommentExample example);

    List<CmsSubjectComment> selectByExample(CmsSubjectCommentExample example);

    int updateByExampleSelective(@Param("record") CmsSubjectComment record, @Param("example") CmsSubjectCommentExample example);

    int updateByExample(@Param("record") CmsSubjectComment record, @Param("example") CmsSubjectCommentExample example);
}