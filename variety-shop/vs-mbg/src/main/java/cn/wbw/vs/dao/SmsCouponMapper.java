package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsCoupon;
import cn.wbw.vs.model.SmsCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsCouponMapper extends Mapper<SmsCoupon>, MySqlMapper<SmsCoupon>, IdsMapper<SmsCoupon>, ConditionMapper<SmsCoupon> {
    long countByExample(SmsCouponExample example);

    int deleteByExample(SmsCouponExample example);

    List<SmsCoupon> selectByExample(SmsCouponExample example);

    int updateByExampleSelective(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    int updateByExample(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);
}