package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberLoginLog;
import cn.wbw.vs.model.UmsMemberLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberLoginLogMapper extends Mapper<UmsMemberLoginLog>, MySqlMapper<UmsMemberLoginLog>, IdsMapper<UmsMemberLoginLog>, ConditionMapper<UmsMemberLoginLog> {
    long countByExample(UmsMemberLoginLogExample example);

    int deleteByExample(UmsMemberLoginLogExample example);

    List<UmsMemberLoginLog> selectByExample(UmsMemberLoginLogExample example);

    int updateByExampleSelective(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);

    int updateByExample(@Param("record") UmsMemberLoginLog record, @Param("example") UmsMemberLoginLogExample example);
}