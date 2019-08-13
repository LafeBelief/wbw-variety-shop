package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberTask;
import cn.wbw.vs.model.UmsMemberTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberTaskMapper extends Mapper<UmsMemberTask>, MySqlMapper<UmsMemberTask>, IdsMapper<UmsMemberTask>, ConditionMapper<UmsMemberTask> {
    long countByExample(UmsMemberTaskExample example);

    int deleteByExample(UmsMemberTaskExample example);

    List<UmsMemberTask> selectByExample(UmsMemberTaskExample example);

    int updateByExampleSelective(@Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example);

    int updateByExample(@Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example);
}