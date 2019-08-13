package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductVertifyRecord;
import cn.wbw.vs.model.PmsProductVertifyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductVertifyRecordMapper extends Mapper<PmsProductVertifyRecord>, MySqlMapper<PmsProductVertifyRecord>, IdsMapper<PmsProductVertifyRecord>, ConditionMapper<PmsProductVertifyRecord> {
    long countByExample(PmsProductVertifyRecordExample example);

    int deleteByExample(PmsProductVertifyRecordExample example);

    List<PmsProductVertifyRecord> selectByExample(PmsProductVertifyRecordExample example);

    int updateByExampleSelective(@Param("record") PmsProductVertifyRecord record, @Param("example") PmsProductVertifyRecordExample example);

    int updateByExample(@Param("record") PmsProductVertifyRecord record, @Param("example") PmsProductVertifyRecordExample example);
}