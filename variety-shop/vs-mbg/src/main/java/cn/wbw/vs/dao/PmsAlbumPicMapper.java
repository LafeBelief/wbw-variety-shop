package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsAlbumPic;
import cn.wbw.vs.model.PmsAlbumPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsAlbumPicMapper extends Mapper<PmsAlbumPic>, MySqlMapper<PmsAlbumPic>, IdsMapper<PmsAlbumPic>, ConditionMapper<PmsAlbumPic> {
    long countByExample(PmsAlbumPicExample example);

    int deleteByExample(PmsAlbumPicExample example);

    List<PmsAlbumPic> selectByExample(PmsAlbumPicExample example);

    int updateByExampleSelective(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);

    int updateByExample(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);
}