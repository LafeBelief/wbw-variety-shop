package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`ums_member`")
@Api(value = "ums_member",tags = {"会员表"})
public class UmsMember implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`member_level_id`")
    private Long memberLevelId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    @Column(name = "`username`")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    @Column(name = "`password`")
    private String password;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    @Column(name = "`nickname`")
    private String nickname;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    @Column(name = "`phone`")
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    @Column(name = "`status`")
    private Integer status;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    @Column(name = "`icon`")
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    @Column(name = "`gender`")
    private Integer gender;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    @Column(name = "`birthday`")
    private Date birthday;

    /**
     * 所做城市
     */
    @ApiModelProperty(value = "所做城市")
    @Column(name = "`city`")
    private String city;

    /**
     * 职业
     */
    @ApiModelProperty(value = "职业")
    @Column(name = "`job`")
    private String job;

    /**
     * 个性签名
     */
    @ApiModelProperty(value = "个性签名")
    @Column(name = "`personalized_signature`")
    private String personalizedSignature;

    /**
     * 用户来源
     */
    @ApiModelProperty(value = "用户来源")
    @Column(name = "`source_type`")
    private Integer sourceType;

    /**
     * 积分
     */
    @ApiModelProperty(value = "积分")
    @Column(name = "`integration`")
    private Integer integration;

    /**
     * 成长值
     */
    @ApiModelProperty(value = "成长值")
    @Column(name = "`growth`")
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    @ApiModelProperty(value = "剩余抽奖次数")
    @Column(name = "`luckey_count`")
    private Integer luckeyCount;

    /**
     * 历史积分数量
     */
    @ApiModelProperty(value = "历史积分数量")
    @Column(name = "`history_integration`")
    private Integer historyIntegration;

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
     * @return member_level_id
     */
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    /**
     * @param memberLevelId
     */
    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取帐号启用状态:0->禁用；1->启用
     *
     * @return status - 帐号启用状态:0->禁用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置帐号启用状态:0->禁用；1->启用
     *
     * @param status 帐号启用状态:0->禁用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取注册时间
     *
     * @return create_time - 注册时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置注册时间
     *
     * @param createTime 注册时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取性别：0->未知；1->男；2->女
     *
     * @return gender - 性别：0->未知；1->男；2->女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别：0->未知；1->男；2->女
     *
     * @param gender 性别：0->未知；1->男；2->女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取所做城市
     *
     * @return city - 所做城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所做城市
     *
     * @param city 所做城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取职业
     *
     * @return job - 职业
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置职业
     *
     * @param job 职业
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取个性签名
     *
     * @return personalized_signature - 个性签名
     */
    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    /**
     * 设置个性签名
     *
     * @param personalizedSignature 个性签名
     */
    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    /**
     * 获取用户来源
     *
     * @return source_type - 用户来源
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 设置用户来源
     *
     * @param sourceType 用户来源
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 获取积分
     *
     * @return integration - 积分
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * 设置积分
     *
     * @param integration 积分
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * 获取成长值
     *
     * @return growth - 成长值
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * 设置成长值
     *
     * @param growth 成长值
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * 获取剩余抽奖次数
     *
     * @return luckey_count - 剩余抽奖次数
     */
    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    /**
     * 设置剩余抽奖次数
     *
     * @param luckeyCount 剩余抽奖次数
     */
    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    /**
     * 获取历史积分数量
     *
     * @return history_integration - 历史积分数量
     */
    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    /**
     * 设置历史积分数量
     *
     * @param historyIntegration 历史积分数量
     */
    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", job=").append(job);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", luckeyCount=").append(luckeyCount);
        sb.append(", historyIntegration=").append(historyIntegration);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}