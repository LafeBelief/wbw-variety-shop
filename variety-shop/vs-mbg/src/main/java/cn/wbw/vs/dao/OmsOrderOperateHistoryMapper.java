package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsOrderOperateHistory;
import cn.wbw.vs.model.OmsOrderOperateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsOrderOperateHistoryMapper extends Mapper<OmsOrderOperateHistory>, MySqlMapper<OmsOrderOperateHistory>, IdsMapper<OmsOrderOperateHistory>, ConditionMapper<OmsOrderOperateHistory> {
    long countByExample(OmsOrderOperateHistoryExample example);

    int deleteByExample(OmsOrderOperateHistoryExample example);

    List<OmsOrderOperateHistory> selectByExample(OmsOrderOperateHistoryExample example);

    int updateByExampleSelective(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    int updateByExample(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);
}