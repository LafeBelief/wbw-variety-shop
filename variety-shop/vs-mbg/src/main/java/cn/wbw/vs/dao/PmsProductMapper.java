package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProduct;
import cn.wbw.vs.model.PmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductMapper extends Mapper<PmsProduct>, MySqlMapper<PmsProduct>, IdsMapper<PmsProduct>, ConditionMapper<PmsProduct> {
    long countByExample(PmsProductExample example);

    int deleteByExample(PmsProductExample example);

    List<PmsProduct> selectByExampleWithBLOBs(PmsProductExample example);

    List<PmsProduct> selectByExample(PmsProductExample example);

    int updateByExampleSelective(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    int updateByExample(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);
}