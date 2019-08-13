package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsIntegrationChangeHistory;
import cn.wbw.vs.model.UmsIntegrationChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsIntegrationChangeHistoryMapper extends Mapper<UmsIntegrationChangeHistory>, MySqlMapper<UmsIntegrationChangeHistory>, IdsMapper<UmsIntegrationChangeHistory>, ConditionMapper<UmsIntegrationChangeHistory> {
    long countByExample(UmsIntegrationChangeHistoryExample example);

    int deleteByExample(UmsIntegrationChangeHistoryExample example);

    List<UmsIntegrationChangeHistory> selectByExample(UmsIntegrationChangeHistoryExample example);

    int updateByExampleSelective(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);

    int updateByExample(@Param("record") UmsIntegrationChangeHistory record, @Param("example") UmsIntegrationChangeHistoryExample example);
}