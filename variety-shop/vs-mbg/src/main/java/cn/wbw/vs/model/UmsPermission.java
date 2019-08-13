package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`ums_permission`")
@Api(value = "ums_permission",tags = {"后台用户权限表"})
public class UmsPermission implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 父级权限id
     */
    @ApiModelProperty(value = "父级权限id")
    @Column(name = "`pid`")
    private Long pid;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    @Column(name = "`name`")
    private String name;

    /**
     * 权限值
     */
    @ApiModelProperty(value = "权限值")
    @Column(name = "`value`")
    private String value;

    /**
     * 图标
     */
    @ApiModelProperty(value = "图标")
    @Column(name = "`icon`")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    @ApiModelProperty(value = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    @Column(name = "`type`")
    private Integer type;

    /**
     * 前端资源路径
     */
    @ApiModelProperty(value = "前端资源路径")
    @Column(name = "`uri`")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    @ApiModelProperty(value = "启用状态；0->禁用；1->启用")
    @Column(name = "`status`")
    private Integer status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
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
     * 获取父级权限id
     *
     * @return pid - 父级权限id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父级权限id
     *
     * @param pid 父级权限id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取权限值
     *
     * @return value - 权限值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置权限值
     *
     * @param value 权限值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     *
     * @return type - 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     *
     * @param type 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取前端资源路径
     *
     * @return uri - 前端资源路径
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置前端资源路径
     *
     * @param uri 前端资源路径
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取启用状态；0->禁用；1->启用
     *
     * @return status - 启用状态；0->禁用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置启用状态；0->禁用；1->启用
     *
     * @param status 启用状态；0->禁用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
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
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", icon=").append(icon);
        sb.append(", type=").append(type);
        sb.append(", uri=").append(uri);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}