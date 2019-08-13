package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsCouponHistory;
import cn.wbw.vs.model.SmsCouponHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsCouponHistoryMapper extends Mapper<SmsCouponHistory>, MySqlMapper<SmsCouponHistory>, IdsMapper<SmsCouponHistory>, ConditionMapper<SmsCouponHistory> {
    long countByExample(SmsCouponHistoryExample example);

    int deleteByExample(SmsCouponHistoryExample example);

    List<SmsCouponHistory> selectByExample(SmsCouponHistoryExample example);

    int updateByExampleSelective(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    int updateByExample(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);
}