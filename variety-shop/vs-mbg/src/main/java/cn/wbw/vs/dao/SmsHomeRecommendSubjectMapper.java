package cn.wbw.vs.dao;

import cn.wbw.vs.model.SmsHomeRecommendSubject;
import cn.wbw.vs.model.SmsHomeRecommendSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SmsHomeRecommendSubjectMapper extends Mapper<SmsHomeRecommendSubject>, MySqlMapper<SmsHomeRecommendSubject>, IdsMapper<SmsHomeRecommendSubject>, ConditionMapper<SmsHomeRecommendSubject> {
    long countByExample(SmsHomeRecommendSubjectExample example);

    int deleteByExample(SmsHomeRecommendSubjectExample example);

    List<SmsHomeRecommendSubject> selectByExample(SmsHomeRecommendSubjectExample example);

    int updateByExampleSelective(@Param("record") SmsHomeRecommendSubject record, @Param("example") SmsHomeRecommendSubjectExample example);

    int updateByExample(@Param("record") SmsHomeRecommendSubject record, @Param("example") SmsHomeRecommendSubjectExample example);
}