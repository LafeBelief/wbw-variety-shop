package cn.wbw.vs.dao;

import cn.wbw.vs.model.PmsAlbum;
import cn.wbw.vs.model.PmsAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PmsAlbumMapper extends Mapper<PmsAlbum>, MySqlMapper<PmsAlbum>, IdsMapper<PmsAlbum>, ConditionMapper<PmsAlbum> {
    long countByExample(PmsAlbumExample example);

    int deleteByExample(PmsAlbumExample example);

    List<PmsAlbum> selectByExample(PmsAlbumExample example);

    int updateByExampleSelective(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);

    int updateByExample(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);
}