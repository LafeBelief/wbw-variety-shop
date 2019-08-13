package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsBrand;
import cn.wbw.vs.model.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsBrandMapper extends Mapper<PmsBrand>, MySqlMapper<PmsBrand>, IdsMapper<PmsBrand>, ConditionMapper<PmsBrand> {
    long countByExample(PmsBrandExample example);

    int deleteByExample(PmsBrandExample example);

    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    List<PmsBrand> selectByExample(PmsBrandExample example);

    int updateByExampleSelective(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);

    int updateByExample(@Param("record") PmsBrand record, @Param("example") PmsBrandExample example);
}