package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberRuleSetting;
import cn.wbw.vs.model.UmsMemberRuleSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberRuleSettingMapper extends Mapper<UmsMemberRuleSetting>, MySqlMapper<UmsMemberRuleSetting>, IdsMapper<UmsMemberRuleSetting>, ConditionMapper<UmsMemberRuleSetting> {
    long countByExample(UmsMemberRuleSettingExample example);

    int deleteByExample(UmsMemberRuleSettingExample example);

    List<UmsMemberRuleSetting> selectByExample(UmsMemberRuleSettingExample example);

    int updateByExampleSelective(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);

    int updateByExample(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);
}