package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsCouponProductCategoryRelation;
import cn.wbw.vs.model.SmsCouponProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsCouponProductCategoryRelationMapper extends Mapper<SmsCouponProductCategoryRelation>, MySqlMapper<SmsCouponProductCategoryRelation>, IdsMapper<SmsCouponProductCategoryRelation>, ConditionMapper<SmsCouponProductCategoryRelation> {
    long countByExample(SmsCouponProductCategoryRelationExample example);

    int deleteByExample(SmsCouponProductCategoryRelationExample example);

    List<SmsCouponProductCategoryRelation> selectByExample(SmsCouponProductCategoryRelationExample example);

    int updateByExampleSelective(@Param("record") SmsCouponProductCategoryRelation record, @Param("example") SmsCouponProductCategoryRelationExample example);

    int updateByExample(@Param("record") SmsCouponProductCategoryRelation record, @Param("example") SmsCouponProductCategoryRelationExample example);
}