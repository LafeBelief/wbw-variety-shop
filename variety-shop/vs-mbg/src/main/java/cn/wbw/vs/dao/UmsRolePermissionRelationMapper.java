package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsRolePermissionRelation;
import cn.wbw.vs.model.UmsRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsRolePermissionRelationMapper extends Mapper<UmsRolePermissionRelation>, MySqlMapper<UmsRolePermissionRelation>, IdsMapper<UmsRolePermissionRelation>, ConditionMapper<UmsRolePermissionRelation> {
    long countByExample(UmsRolePermissionRelationExample example);

    int deleteByExample(UmsRolePermissionRelationExample example);

    List<UmsRolePermissionRelation> selectByExample(UmsRolePermissionRelationExample example);

    int updateByExampleSelective(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);

    int updateByExample(@Param("record") UmsRolePermissionRelation record, @Param("example") UmsRolePermissionRelationExample example);
}