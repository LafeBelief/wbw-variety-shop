package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsFlashPromotionLog;
import cn.wbw.vs.model.SmsFlashPromotionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsFlashPromotionLogMapper extends Mapper<SmsFlashPromotionLog>, MySqlMapper<SmsFlashPromotionLog>, IdsMapper<SmsFlashPromotionLog>, ConditionMapper<SmsFlashPromotionLog> {
    long countByExample(SmsFlashPromotionLogExample example);

    int deleteByExample(SmsFlashPromotionLogExample example);

    List<SmsFlashPromotionLog> selectByExample(SmsFlashPromotionLogExample example);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);

    int updateByExample(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);
}