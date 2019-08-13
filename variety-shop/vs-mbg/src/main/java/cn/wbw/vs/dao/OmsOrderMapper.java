package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsOrder;
import cn.wbw.vs.model.OmsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsOrderMapper extends Mapper<OmsOrder>, MySqlMapper<OmsOrder>, IdsMapper<OmsOrder>, ConditionMapper<OmsOrder> {
    long countByExample(OmsOrderExample example);

    int deleteByExample(OmsOrderExample example);

    List<OmsOrder> selectByExample(OmsOrderExample example);

    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);
}