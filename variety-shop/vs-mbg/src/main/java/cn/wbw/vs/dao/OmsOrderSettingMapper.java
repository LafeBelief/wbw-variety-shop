package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsOrderSetting;
import cn.wbw.vs.model.OmsOrderSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsOrderSettingMapper extends Mapper<OmsOrderSetting>, MySqlMapper<OmsOrderSetting>, IdsMapper<OmsOrderSetting>, ConditionMapper<OmsOrderSetting> {
    long countByExample(OmsOrderSettingExample example);

    int deleteByExample(OmsOrderSettingExample example);

    List<OmsOrderSetting> selectByExample(OmsOrderSettingExample example);

    int updateByExampleSelective(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);

    int updateByExample(@Param("record") OmsOrderSetting record, @Param("example") OmsOrderSettingExample example);
}