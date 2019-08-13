package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsComment;
import cn.wbw.vs.model.PmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsCommentMapper extends Mapper<PmsComment>, MySqlMapper<PmsComment>, IdsMapper<PmsComment>, ConditionMapper<PmsComment> {
    long countByExample(PmsCommentExample example);

    int deleteByExample(PmsCommentExample example);

    List<PmsComment> selectByExampleWithBLOBs(PmsCommentExample example);

    List<PmsComment> selectByExample(PmsCommentExample example);

    int updateByExampleSelective(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    int updateByExample(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);
}