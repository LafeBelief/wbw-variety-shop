package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsOrderReturnReason;
import cn.wbw.vs.model.OmsOrderReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsOrderReturnReasonMapper extends Mapper<OmsOrderReturnReason>, MySqlMapper<OmsOrderReturnReason>, IdsMapper<OmsOrderReturnReason>, ConditionMapper<OmsOrderReturnReason> {
    long countByExample(OmsOrderReturnReasonExample example);

    int deleteByExample(OmsOrderReturnReasonExample example);

    List<OmsOrderReturnReason> selectByExample(OmsOrderReturnReasonExample example);

    int updateByExampleSelective(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);

    int updateByExample(@Param("record") OmsOrderReturnReason record, @Param("example") OmsOrderReturnReasonExample example);
}