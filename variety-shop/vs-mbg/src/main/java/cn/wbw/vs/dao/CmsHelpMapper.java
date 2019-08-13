package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsHelp;
import cn.wbw.vs.model.CmsHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsHelpMapper extends Mapper<CmsHelp>, MySqlMapper<CmsHelp>, IdsMapper<CmsHelp>, ConditionMapper<CmsHelp> {
    long countByExample(CmsHelpExample example);

    int deleteByExample(CmsHelpExample example);

    List<CmsHelp> selectByExampleWithBLOBs(CmsHelpExample example);

    List<CmsHelp> selectByExample(CmsHelpExample example);

    int updateByExampleSelective(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);

    int updateByExample(@Param("record") CmsHelp record, @Param("example") CmsHelpExample example);
}