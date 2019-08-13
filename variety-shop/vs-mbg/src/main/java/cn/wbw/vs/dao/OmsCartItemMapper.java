package cn.wbw.vs.dao;

import cn.wbw.vs.model.OmsCartItem;
import cn.wbw.vs.model.OmsCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OmsCartItemMapper extends Mapper<OmsCartItem>, MySqlMapper<OmsCartItem>, IdsMapper<OmsCartItem>, ConditionMapper<OmsCartItem> {
    long countByExample(OmsCartItemExample example);

    int deleteByExample(OmsCartItemExample example);

    List<OmsCartItem> selectByExample(OmsCartItemExample example);

    int updateByExampleSelective(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    int updateByExample(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);
}