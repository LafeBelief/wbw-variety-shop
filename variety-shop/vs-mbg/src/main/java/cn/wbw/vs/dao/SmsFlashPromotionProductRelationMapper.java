package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsFlashPromotionProductRelation;
import cn.wbw.vs.model.SmsFlashPromotionProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsFlashPromotionProductRelationMapper extends Mapper<SmsFlashPromotionProductRelation>, MySqlMapper<SmsFlashPromotionProductRelation>, IdsMapper<SmsFlashPromotionProductRelation>, ConditionMapper<SmsFlashPromotionProductRelation> {
    long countByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByExample(SmsFlashPromotionProductRelationExample example);

    List<SmsFlashPromotionProductRelation> selectByExample(SmsFlashPromotionProductRelationExample example);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionProductRelation record, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByExample(@Param("record") SmsFlashPromotionProductRelation record, @Param("example") SmsFlashPromotionProductRelationExample example);
}