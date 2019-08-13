package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsPrefrenceArea;
import cn.wbw.vs.model.CmsPrefrenceAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsPrefrenceAreaMapper extends Mapper<CmsPrefrenceArea>, MySqlMapper<CmsPrefrenceArea>, IdsMapper<CmsPrefrenceArea>, ConditionMapper<CmsPrefrenceArea> {
    long countByExample(CmsPrefrenceAreaExample example);

    int deleteByExample(CmsPrefrenceAreaExample example);

    List<CmsPrefrenceArea> selectByExampleWithBLOBs(CmsPrefrenceAreaExample example);

    List<CmsPrefrenceArea> selectByExample(CmsPrefrenceAreaExample example);

    int updateByExampleSelective(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    int updateByExample(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);
}