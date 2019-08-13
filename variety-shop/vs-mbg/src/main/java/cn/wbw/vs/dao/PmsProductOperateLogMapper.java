package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductOperateLog;
import cn.wbw.vs.model.PmsProductOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductOperateLogMapper extends Mapper<PmsProductOperateLog>, MySqlMapper<PmsProductOperateLog>, IdsMapper<PmsProductOperateLog>, ConditionMapper<PmsProductOperateLog> {
    long countByExample(PmsProductOperateLogExample example);

    int deleteByExample(PmsProductOperateLogExample example);

    List<PmsProductOperateLog> selectByExample(PmsProductOperateLogExample example);

    int updateByExampleSelective(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);

    int updateByExample(@Param("record") PmsProductOperateLog record, @Param("example") PmsProductOperateLogExample example);
}