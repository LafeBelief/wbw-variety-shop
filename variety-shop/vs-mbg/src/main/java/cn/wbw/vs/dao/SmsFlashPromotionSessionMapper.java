package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsFlashPromotionSession;
import cn.wbw.vs.model.SmsFlashPromotionSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsFlashPromotionSessionMapper extends Mapper<SmsFlashPromotionSession>, MySqlMapper<SmsFlashPromotionSession>, IdsMapper<SmsFlashPromotionSession>, ConditionMapper<SmsFlashPromotionSession> {
    long countByExample(SmsFlashPromotionSessionExample example);

    int deleteByExample(SmsFlashPromotionSessionExample example);

    List<SmsFlashPromotionSession> selectByExample(SmsFlashPromotionSessionExample example);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionSession record, @Param("example") SmsFlashPromotionSessionExample example);

    int updateByExample(@Param("record") SmsFlashPromotionSession record, @Param("example") SmsFlashPromotionSessionExample example);
}