package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsIntegrationConsumeSetting;
import cn.wbw.vs.model.UmsIntegrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsIntegrationConsumeSettingMapper extends Mapper<UmsIntegrationConsumeSetting>, MySqlMapper<UmsIntegrationConsumeSetting>, IdsMapper<UmsIntegrationConsumeSetting>, ConditionMapper<UmsIntegrationConsumeSetting> {
    long countByExample(UmsIntegrationConsumeSettingExample example);

    int deleteByExample(UmsIntegrationConsumeSettingExample example);

    List<UmsIntegrationConsumeSetting> selectByExample(UmsIntegrationConsumeSettingExample example);

    int updateByExampleSelective(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);

    int updateByExample(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);
}