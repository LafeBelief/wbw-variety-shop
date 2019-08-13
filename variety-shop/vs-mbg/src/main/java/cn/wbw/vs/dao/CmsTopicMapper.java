package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsTopic;
import cn.wbw.vs.model.CmsTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsTopicMapper extends Mapper<CmsTopic>, MySqlMapper<CmsTopic>, IdsMapper<CmsTopic>, ConditionMapper<CmsTopic> {
    long countByExample(CmsTopicExample example);

    int deleteByExample(CmsTopicExample example);

    List<CmsTopic> selectByExampleWithBLOBs(CmsTopicExample example);

    List<CmsTopic> selectByExample(CmsTopicExample example);

    int updateByExampleSelective(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);

    int updateByExample(@Param("record") CmsTopic record, @Param("example") CmsTopicExample example);
}