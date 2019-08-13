package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsSkuStock;
import cn.wbw.vs.model.PmsSkuStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsSkuStockMapper extends Mapper<PmsSkuStock>, MySqlMapper<PmsSkuStock>, IdsMapper<PmsSkuStock>, ConditionMapper<PmsSkuStock> {
    long countByExample(PmsSkuStockExample example);

    int deleteByExample(PmsSkuStockExample example);

    List<PmsSkuStock> selectByExample(PmsSkuStockExample example);

    int updateByExampleSelective(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);

    int updateByExample(@Param("record") PmsSkuStock record, @Param("example") PmsSkuStockExample example);
}