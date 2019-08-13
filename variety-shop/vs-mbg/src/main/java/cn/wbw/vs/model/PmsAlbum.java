package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`pms_album`")
@Api(value = "pms_album",tags = {"相册表"})
public class PmsAlbum implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`cover_pic`")
    private String coverPic;

    @Column(name = "`pic_count`")
    private Integer picCount;

    @Column(name = "`sort`")
    private Integer sort;

    @Column(name = "`description`")
    private String description;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return cover_pic
     */
    public String getCoverPic() {
        return coverPic;
    }

    /**
     * @param coverPic
     */
    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    /**
     * @return pic_count
     */
    public Integer getPicCount() {
        return picCount;
    }

    /**
     * @param picCount
     */
    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", coverPic=").append(coverPic);
        sb.append(", picCount=").append(picCount);
        sb.append(", sort=").append(sort);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}