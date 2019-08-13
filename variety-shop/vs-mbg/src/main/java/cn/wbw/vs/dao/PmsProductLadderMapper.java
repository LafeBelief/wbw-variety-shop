package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductLadder;
import cn.wbw.vs.model.PmsProductLadderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductLadderMapper extends Mapper<PmsProductLadder>, MySqlMapper<PmsProductLadder>, IdsMapper<PmsProductLadder>, ConditionMapper<PmsProductLadder> {
    long countByExample(PmsProductLadderExample example);

    int deleteByExample(PmsProductLadderExample example);

    List<PmsProductLadder> selectByExample(PmsProductLadderExample example);

    int updateByExampleSelective(@Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example);

    int updateByExample(@Param("record") PmsProductLadder record, @Param("example") PmsProductLadderExample example);
}