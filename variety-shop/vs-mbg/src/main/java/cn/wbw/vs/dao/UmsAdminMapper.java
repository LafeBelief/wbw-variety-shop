package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsAdmin;
import cn.wbw.vs.model.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsAdminMapper extends Mapper<UmsAdmin>, MySqlMapper<UmsAdmin>, IdsMapper<UmsAdmin>, ConditionMapper<UmsAdmin> {
    long countByExample(UmsAdminExample example);

    int deleteByExample(UmsAdminExample example);

    List<UmsAdmin> selectByExample(UmsAdminExample example);

    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);
}