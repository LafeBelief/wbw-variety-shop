package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsMemberReport;
import cn.wbw.vs.model.CmsMemberReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsMemberReportMapper extends Mapper<CmsMemberReport>, MySqlMapper<CmsMemberReport>, IdsMapper<CmsMemberReport>, ConditionMapper<CmsMemberReport> {
    long countByExample(CmsMemberReportExample example);

    int deleteByExample(CmsMemberReportExample example);

    List<CmsMemberReport> selectByExample(CmsMemberReportExample example);

    int updateByExampleSelective(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);

    int updateByExample(@Param("record") CmsMemberReport record, @Param("example") CmsMemberReportExample example);
}