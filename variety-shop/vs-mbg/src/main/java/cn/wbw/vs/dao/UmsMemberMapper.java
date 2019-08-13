package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMember;
import cn.wbw.vs.model.UmsMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberMapper extends Mapper<UmsMember>, MySqlMapper<UmsMember>, IdsMapper<UmsMember>, ConditionMapper<UmsMember> {
    long countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    List<UmsMember> selectByExample(UmsMemberExample example);

    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);
}