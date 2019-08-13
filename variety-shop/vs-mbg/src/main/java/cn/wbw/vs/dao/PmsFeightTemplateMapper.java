package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsFeightTemplate;
import cn.wbw.vs.model.PmsFeightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsFeightTemplateMapper extends Mapper<PmsFeightTemplate>, MySqlMapper<PmsFeightTemplate>, IdsMapper<PmsFeightTemplate>, ConditionMapper<PmsFeightTemplate> {
    long countByExample(PmsFeightTemplateExample example);

    int deleteByExample(PmsFeightTemplateExample example);

    List<PmsFeightTemplate> selectByExample(PmsFeightTemplateExample example);

    int updateByExampleSelective(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    int updateByExample(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);
}