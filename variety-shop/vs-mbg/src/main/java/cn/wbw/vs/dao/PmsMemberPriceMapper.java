package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsMemberPrice;
import cn.wbw.vs.model.PmsMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsMemberPriceMapper extends Mapper<PmsMemberPrice>, MySqlMapper<PmsMemberPrice>, IdsMapper<PmsMemberPrice>, ConditionMapper<PmsMemberPrice> {
    long countByExample(PmsMemberPriceExample example);

    int deleteByExample(PmsMemberPriceExample example);

    List<PmsMemberPrice> selectByExample(PmsMemberPriceExample example);

    int updateByExampleSelective(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    int updateByExample(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);
}