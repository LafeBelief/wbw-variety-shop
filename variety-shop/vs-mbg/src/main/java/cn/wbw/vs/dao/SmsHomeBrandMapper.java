package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsHomeBrand;
import cn.wbw.vs.model.SmsHomeBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsHomeBrandMapper extends Mapper<SmsHomeBrand>, MySqlMapper<SmsHomeBrand>, IdsMapper<SmsHomeBrand>, ConditionMapper<SmsHomeBrand> {
    long countByExample(SmsHomeBrandExample example);

    int deleteByExample(SmsHomeBrandExample example);

    List<SmsHomeBrand> selectByExample(SmsHomeBrandExample example);

    int updateByExampleSelective(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);

    int updateByExample(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);
}