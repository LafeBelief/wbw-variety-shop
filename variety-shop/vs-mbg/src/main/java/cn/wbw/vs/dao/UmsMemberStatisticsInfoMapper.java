package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberStatisticsInfo;
import cn.wbw.vs.model.UmsMemberStatisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberStatisticsInfoMapper extends Mapper<UmsMemberStatisticsInfo>, MySqlMapper<UmsMemberStatisticsInfo>, IdsMapper<UmsMemberStatisticsInfo>, ConditionMapper<UmsMemberStatisticsInfo> {
    long countByExample(UmsMemberStatisticsInfoExample example);

    int deleteByExample(UmsMemberStatisticsInfoExample example);

    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    int updateByExampleSelective(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByExample(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);
}