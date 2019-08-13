package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsFlashPromotion;
import cn.wbw.vs.model.SmsFlashPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsFlashPromotionMapper extends Mapper<SmsFlashPromotion>, MySqlMapper<SmsFlashPromotion>, IdsMapper<SmsFlashPromotion>, ConditionMapper<SmsFlashPromotion> {
    long countByExample(SmsFlashPromotionExample example);

    int deleteByExample(SmsFlashPromotionExample example);

    List<SmsFlashPromotion> selectByExample(SmsFlashPromotionExample example);

    int updateByExampleSelective(@Param("record") SmsFlashPromotion record, @Param("example") SmsFlashPromotionExample example);

    int updateByExample(@Param("record") SmsFlashPromotion record, @Param("example") SmsFlashPromotionExample example);
}