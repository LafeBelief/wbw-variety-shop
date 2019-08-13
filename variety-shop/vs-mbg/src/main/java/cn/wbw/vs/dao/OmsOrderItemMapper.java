package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsOrderItem;
import cn.wbw.vs.model.OmsOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsOrderItemMapper extends Mapper<OmsOrderItem>, MySqlMapper<OmsOrderItem>, IdsMapper<OmsOrderItem>, ConditionMapper<OmsOrderItem> {
    long countByExample(OmsOrderItemExample example);

    int deleteByExample(OmsOrderItemExample example);

    List<OmsOrderItem> selectByExample(OmsOrderItemExample example);

    int updateByExampleSelective(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByExample(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);
}