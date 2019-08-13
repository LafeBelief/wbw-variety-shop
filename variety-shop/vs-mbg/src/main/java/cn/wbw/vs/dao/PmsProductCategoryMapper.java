package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsProductCategory;
import cn.wbw.vs.model.PmsProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsProductCategoryMapper extends Mapper<PmsProductCategory>, MySqlMapper<PmsProductCategory>, IdsMapper<PmsProductCategory>, ConditionMapper<PmsProductCategory> {
    long countByExample(PmsProductCategoryExample example);

    int deleteByExample(PmsProductCategoryExample example);

    List<PmsProductCategory> selectByExampleWithBLOBs(PmsProductCategoryExample example);

    List<PmsProductCategory> selectByExample(PmsProductCategoryExample example);

    int updateByExampleSelective(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);

    int updateByExample(@Param("record") PmsProductCategory record, @Param("example") PmsProductCategoryExample example);
}