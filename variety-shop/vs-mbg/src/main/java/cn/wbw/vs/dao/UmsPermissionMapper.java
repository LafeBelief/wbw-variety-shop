package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsPermission;
import cn.wbw.vs.model.UmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsPermissionMapper extends Mapper<UmsPermission>, MySqlMapper<UmsPermission>, IdsMapper<UmsPermission>, ConditionMapper<UmsPermission> {
    long countByExample(UmsPermissionExample example);

    int deleteByExample(UmsPermissionExample example);

    List<UmsPermission> selectByExample(UmsPermissionExample example);

    int updateByExampleSelective(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    int updateByExample(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);
}