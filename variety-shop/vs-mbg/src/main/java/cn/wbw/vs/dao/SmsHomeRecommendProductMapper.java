package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsHomeRecommendProduct;
import cn.wbw.vs.model.SmsHomeRecommendProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsHomeRecommendProductMapper extends Mapper<SmsHomeRecommendProduct>, MySqlMapper<SmsHomeRecommendProduct>, IdsMapper<SmsHomeRecommendProduct>, ConditionMapper<SmsHomeRecommendProduct> {
    long countByExample(SmsHomeRecommendProductExample example);

    int deleteByExample(SmsHomeRecommendProductExample example);

    List<SmsHomeRecommendProduct> selectByExample(SmsHomeRecommendProductExample example);

    int updateByExampleSelective(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);

    int updateByExample(@Param("record") SmsHomeRecommendProduct record, @Param("example") SmsHomeRecommendProductExample example);
}