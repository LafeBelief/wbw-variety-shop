package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsAdminLoginLog;
import cn.wbw.vs.model.UmsAdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsAdminLoginLogMapper extends Mapper<UmsAdminLoginLog>, MySqlMapper<UmsAdminLoginLog>, IdsMapper<UmsAdminLoginLog>, ConditionMapper<UmsAdminLoginLog> {
    long countByExample(UmsAdminLoginLogExample example);

    int deleteByExample(UmsAdminLoginLogExample example);

    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    int updateByExampleSelective(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByExample(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);
}