package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`cms_help_category`")
@Api(value = "cms_help_category",tags = {"帮助分类表"})
public class CmsHelpCategory implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    /**
     * 分类图标
     */
    @ApiModelProperty(value = "分类图标")
    @Column(name = "`icon`")
    private String icon;

    /**
     * 专题数量
     */
    @ApiModelProperty(value = "专题数量")
    @Column(name = "`help_count`")
    private Integer helpCount;

    @Column(name = "`show_status`")
    private Integer showStatus;

    @Column(name = "`sort`")
    private Integer sort;

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
     * 获取分类图标
     *
     * @return icon - 分类图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置分类图标
     *
     * @param icon 分类图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取专题数量
     *
     * @return help_count - 专题数量
     */
    public Integer getHelpCount() {
        return helpCount;
    }

    /**
     * 设置专题数量
     *
     * @param helpCount 专题数量
     */
    public void setHelpCount(Integer helpCount) {
        this.helpCount = helpCount;
    }

    /**
     * @return show_status
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * @param showStatus
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", helpCount=").append(helpCount);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}