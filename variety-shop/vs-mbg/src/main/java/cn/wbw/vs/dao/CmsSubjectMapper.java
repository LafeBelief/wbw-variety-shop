package cn.wbw.vs.dao;

import cn.wbw.vs.model.CmsSubject;
import cn.wbw.vs.model.CmsSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface CmsSubjectMapper extends Mapper<CmsSubject>, MySqlMapper<CmsSubject>, IdsMapper<CmsSubject>, ConditionMapper<CmsSubject> {
    long countByExample(CmsSubjectExample example);

    int deleteByExample(CmsSubjectExample example);

    List<CmsSubject> selectByExampleWithBLOBs(CmsSubjectExample example);

    List<CmsSubject> selectByExample(CmsSubjectExample example);

    int updateByExampleSelective(@Param("record") CmsSubject record, @Param("example") CmsSubjectExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsSubject record, @Param("example") CmsSubjectExample example);

    int updateByExample(@Param("record") CmsSubject record, @Param("example") CmsSubjectExample example);
}