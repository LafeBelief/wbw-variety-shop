package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberReceiveAddress;
import cn.wbw.vs.model.UmsMemberReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress>, MySqlMapper<UmsMemberReceiveAddress>, IdsMapper<UmsMemberReceiveAddress>, ConditionMapper<UmsMemberReceiveAddress> {
    long countByExample(UmsMemberReceiveAddressExample example);

    int deleteByExample(UmsMemberReceiveAddressExample example);

    List<UmsMemberReceiveAddress> selectByExample(UmsMemberReceiveAddressExample example);

    int updateByExampleSelective(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);

    int updateByExample(@Param("record") UmsMemberReceiveAddress record, @Param("example") UmsMemberReceiveAddressExample example);
}