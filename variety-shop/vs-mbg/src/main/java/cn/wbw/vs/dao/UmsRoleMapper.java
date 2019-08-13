package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsRole;
import cn.wbw.vs.model.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsRoleMapper extends Mapper<UmsRole>, MySqlMapper<UmsRole>, IdsMapper<UmsRole>, ConditionMapper<UmsRole> {
    long countByExample(UmsRoleExample example);

    int deleteByExample(UmsRoleExample example);

    List<UmsRole> selectByExample(UmsRoleExample example);

    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);
}