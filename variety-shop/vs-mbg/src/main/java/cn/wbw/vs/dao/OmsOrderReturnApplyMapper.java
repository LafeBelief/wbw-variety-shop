package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsOrderReturnApply;
import cn.wbw.vs.model.OmsOrderReturnApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsOrderReturnApplyMapper extends Mapper<OmsOrderReturnApply>, MySqlMapper<OmsOrderReturnApply>, IdsMapper<OmsOrderReturnApply>, ConditionMapper<OmsOrderReturnApply> {
    long countByExample(OmsOrderReturnApplyExample example);

    int deleteByExample(OmsOrderReturnApplyExample example);

    List<OmsOrderReturnApply> selectByExample(OmsOrderReturnApplyExample example);

    int updateByExampleSelective(@Param("record") OmsOrderReturnApply record, @Param("example") OmsOrderReturnApplyExample example);

    int updateByExample(@Param("record") OmsOrderReturnApply record, @Param("example") OmsOrderReturnApplyExample example);
}