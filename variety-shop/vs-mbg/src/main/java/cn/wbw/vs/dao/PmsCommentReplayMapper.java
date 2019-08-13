package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsCommentReplay;
import cn.wbw.vs.model.PmsCommentReplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsCommentReplayMapper extends Mapper<PmsCommentReplay>, MySqlMapper<PmsCommentReplay>, IdsMapper<PmsCommentReplay>, ConditionMapper<PmsCommentReplay> {
    long countByExample(PmsCommentReplayExample example);

    int deleteByExample(PmsCommentReplayExample example);

    List<PmsCommentReplay> selectByExample(PmsCommentReplayExample example);

    int updateByExampleSelective(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);

    int updateByExample(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);
}