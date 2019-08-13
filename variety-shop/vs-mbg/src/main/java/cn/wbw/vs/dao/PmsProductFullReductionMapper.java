package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductFullReduction;
import cn.wbw.vs.model.PmsProductFullReductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductFullReductionMapper extends Mapper<PmsProductFullReduction>, MySqlMapper<PmsProductFullReduction>, IdsMapper<PmsProductFullReduction>, ConditionMapper<PmsProductFullReduction> {
    long countByExample(PmsProductFullReductionExample example);

    int deleteByExample(PmsProductFullReductionExample example);

    List<PmsProductFullReduction> selectByExample(PmsProductFullReductionExample example);

    int updateByExampleSelective(@Param("record") PmsProductFullReduction record, @Param("example") PmsProductFullReductionExample example);

    int updateByExample(@Param("record") PmsProductFullReduction record, @Param("example") PmsProductFullReductionExample example);
}