package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`ums_admin`")
@Api(value = "ums_admin",tags = {"后台用户表"})
public class UmsAdmin implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`username`")
    private String username;

    @Column(name = "`password`")
    private String password;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    @Column(name = "`icon`")
    private String icon;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    @Column(name = "`email`")
    private String email;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    @Column(name = "`nick_name`")
    private String nickName;

    /**
     * 备注信息
     */
    @ApiModelProperty(value = "备注信息")
    @Column(name = "`note`")
    private String note;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间")
    @Column(name = "`login_time`")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    @ApiModelProperty(value = "帐号启用状态：0->禁用；1->启用")
    @Column(name = "`status`")
    private Integer status;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取头像
     *
     * @return icon - 头像
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置头像
     *
     * @param icon 头像
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取备注信息
     *
     * @return note - 备注信息
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注信息
     *
     * @param note 备注信息
     */
    public void setNote(String note) {
        this.note = note;
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
     * 获取最后登录时间
     *
     * @return login_time - 最后登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param loginTime 最后登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取帐号启用状态：0->禁用；1->启用
     *
     * @return status - 帐号启用状态：0->禁用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置帐号启用状态：0->禁用；1->启用
     *
     * @param status 帐号启用状态：0->禁用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}