package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsAdminPermissionRelation;
import cn.wbw.vs.model.UmsAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsAdminPermissionRelationMapper extends Mapper<UmsAdminPermissionRelation>, MySqlMapper<UmsAdminPermissionRelation>, IdsMapper<UmsAdminPermissionRelation>, ConditionMapper<UmsAdminPermissionRelation> {
    long countByExample(UmsAdminPermissionRelationExample example);

    int deleteByExample(UmsAdminPermissionRelationExample example);

    List<UmsAdminPermissionRelation> selectByExample(UmsAdminPermissionRelationExample example);

    int updateByExampleSelective(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByExample(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);
}