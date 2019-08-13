package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberProductCategoryRelation;
import cn.wbw.vs.model.UmsMemberProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberProductCategoryRelationMapper extends Mapper<UmsMemberProductCategoryRelation>, MySqlMapper<UmsMemberProductCategoryRelation>, IdsMapper<UmsMemberProductCategoryRelation>, ConditionMapper<UmsMemberProductCategoryRelation> {
    long countByExample(UmsMemberProductCategoryRelationExample example);

    int deleteByExample(UmsMemberProductCategoryRelationExample example);

    List<UmsMemberProductCategoryRelation> selectByExample(UmsMemberProductCategoryRelationExample example);

    int updateByExampleSelective(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    int updateByExample(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);
}