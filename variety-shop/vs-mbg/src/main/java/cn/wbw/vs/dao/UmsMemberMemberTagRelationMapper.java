package cn.wbw.vs.dao;

import cn.wbw.vs.model.UmsMemberMemberTagRelation;
import cn.wbw.vs.model.UmsMemberMemberTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UmsMemberMemberTagRelationMapper extends Mapper<UmsMemberMemberTagRelation>, MySqlMapper<UmsMemberMemberTagRelation>, IdsMapper<UmsMemberMemberTagRelation>, ConditionMapper<UmsMemberMemberTagRelation> {
    long countByExample(UmsMemberMemberTagRelationExample example);

    int deleteByExample(UmsMemberMemberTagRelationExample example);

    List<UmsMemberMemberTagRelation> selectByExample(UmsMemberMemberTagRelationExample example);

    int updateByExampleSelective(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    int updateByExample(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);
}