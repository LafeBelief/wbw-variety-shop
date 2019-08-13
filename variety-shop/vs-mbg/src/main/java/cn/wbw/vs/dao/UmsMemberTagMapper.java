package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberTag;
import cn.wbw.vs.model.UmsMemberTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberTagMapper extends Mapper<UmsMemberTag>, MySqlMapper<UmsMemberTag>, IdsMapper<UmsMemberTag>, ConditionMapper<UmsMemberTag> {
    long countByExample(UmsMemberTagExample example);

    int deleteByExample(UmsMemberTagExample example);

    List<UmsMemberTag> selectByExample(UmsMemberTagExample example);

    int updateByExampleSelective(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByExample(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);
}