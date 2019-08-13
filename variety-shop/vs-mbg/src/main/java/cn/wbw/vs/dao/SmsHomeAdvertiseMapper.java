package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsHomeAdvertise;
import cn.wbw.vs.model.SmsHomeAdvertiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsHomeAdvertiseMapper extends Mapper<SmsHomeAdvertise>, MySqlMapper<SmsHomeAdvertise>, IdsMapper<SmsHomeAdvertise>, ConditionMapper<SmsHomeAdvertise> {
    long countByExample(SmsHomeAdvertiseExample example);

    int deleteByExample(SmsHomeAdvertiseExample example);

    List<SmsHomeAdvertise> selectByExample(SmsHomeAdvertiseExample example);

    int updateByExampleSelective(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);

    int updateByExample(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);
}