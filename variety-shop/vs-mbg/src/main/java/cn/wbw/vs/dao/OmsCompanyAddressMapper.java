package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsCompanyAddress;
import cn.wbw.vs.model.OmsCompanyAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsCompanyAddressMapper extends Mapper<OmsCompanyAddress>, MySqlMapper<OmsCompanyAddress>, IdsMapper<OmsCompanyAddress>, ConditionMapper<OmsCompanyAddress> {
    long countByExample(OmsCompanyAddressExample example);

    int deleteByExample(OmsCompanyAddressExample example);

    List<OmsCompanyAddress> selectByExample(OmsCompanyAddressExample example);

    int updateByExampleSelective(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);

    int updateByExample(@Param("record") OmsCompanyAddress record, @Param("example") OmsCompanyAddressExample example);
}