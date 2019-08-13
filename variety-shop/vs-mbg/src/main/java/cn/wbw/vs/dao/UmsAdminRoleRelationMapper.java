package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsAdminRoleRelation;
import cn.wbw.vs.model.UmsAdminRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsAdminRoleRelationMapper extends Mapper<UmsAdminRoleRelation>, MySqlMapper<UmsAdminRoleRelation>, IdsMapper<UmsAdminRoleRelation>, ConditionMapper<UmsAdminRoleRelation> {
    long countByExample(UmsAdminRoleRelationExample example);

    int deleteByExample(UmsAdminRoleRelationExample example);

    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    int updateByExampleSelective(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    int updateByExample(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);
}