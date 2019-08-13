package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberLevel;
import cn.wbw.vs.model.UmsMemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberLevelMapper extends Mapper<UmsMemberLevel>, MySqlMapper<UmsMemberLevel>, IdsMapper<UmsMemberLevel>, ConditionMapper<UmsMemberLevel> {
    long countByExample(UmsMemberLevelExample example);

    int deleteByExample(UmsMemberLevelExample example);

    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    int updateByExampleSelective(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    int updateByExample(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);
}