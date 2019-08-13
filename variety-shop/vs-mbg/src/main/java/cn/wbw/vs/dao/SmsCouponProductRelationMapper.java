package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsCouponProductRelation;
import cn.wbw.vs.model.SmsCouponProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsCouponProductRelationMapper extends Mapper<SmsCouponProductRelation>, MySqlMapper<SmsCouponProductRelation>, IdsMapper<SmsCouponProductRelation>, ConditionMapper<SmsCouponProductRelation> {
    long countByExample(SmsCouponProductRelationExample example);

    int deleteByExample(SmsCouponProductRelationExample example);

    List<SmsCouponProductRelation> selectByExample(SmsCouponProductRelationExample example);

    int updateByExampleSelective(@Param("record") SmsCouponProductRelation record, @Param("example") SmsCouponProductRelationExample example);

    int updateByExample(@Param("record") SmsCouponProductRelation record, @Param("example") SmsCouponProductRelationExample example);
}