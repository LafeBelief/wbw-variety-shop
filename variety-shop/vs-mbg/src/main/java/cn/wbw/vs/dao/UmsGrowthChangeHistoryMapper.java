package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsGrowthChangeHistory;
import cn.wbw.vs.model.UmsGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsGrowthChangeHistoryMapper extends Mapper<UmsGrowthChangeHistory>, MySqlMapper<UmsGrowthChangeHistory>, IdsMapper<UmsGrowthChangeHistory>, ConditionMapper<UmsGrowthChangeHistory> {
    long countByExample(UmsGrowthChangeHistoryExample example);

    int deleteByExample(UmsGrowthChangeHistoryExample example);

    List<UmsGrowthChangeHistory> selectByExample(UmsGrowthChangeHistoryExample example);

    int updateByExampleSelective(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);

    int updateByExample(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);
}