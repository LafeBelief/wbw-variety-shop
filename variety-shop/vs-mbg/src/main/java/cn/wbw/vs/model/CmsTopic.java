package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`cms_topic`")
@Api(value = "cms_topic",tags = {"话题表"})
public class CmsTopic implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`category_id`")
    private Long categoryId;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`start_time`")
    private Date startTime;

    @Column(name = "`end_time`")
    private Date endTime;

    /**
     * 参与人数
     */
    @ApiModelProperty(value = "参与人数")
    @Column(name = "`attend_count`")
    private Integer attendCount;

    /**
     * 关注人数
     */
    @ApiModelProperty(value = "关注人数")
    @Column(name = "`attention_count`")
    private Integer attentionCount;

    @Column(name = "`read_count`")
    private Integer readCount;

    /**
     * 奖品名称
     */
    @ApiModelProperty(value = "奖品名称")
    @Column(name = "`award_name`")
    private String awardName;

    /**
     * 参与方式
     */
    @ApiModelProperty(value = "参与方式")
    @Column(name = "`attend_type`")
    private String attendType;

    /**
     * 话题内容
     */
    @ApiModelProperty(value = "话题内容")
    @Column(name = "`content`")
    private String content;

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
     * @return category_id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取参与人数
     *
     * @return attend_count - 参与人数
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * 设置参与人数
     *
     * @param attendCount 参与人数
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * 获取关注人数
     *
     * @return attention_count - 关注人数
     */
    public Integer getAttentionCount() {
        return attentionCount;
    }

    /**
     * 设置关注人数
     *
     * @param attentionCount 关注人数
     */
    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    /**
     * @return read_count
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * @param readCount
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * 获取奖品名称
     *
     * @return award_name - 奖品名称
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * 设置奖品名称
     *
     * @param awardName 奖品名称
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    /**
     * 获取参与方式
     *
     * @return attend_type - 参与方式
     */
    public String getAttendType() {
        return attendType;
    }

    /**
     * 设置参与方式
     *
     * @param attendType 参与方式
     */
    public void setAttendType(String attendType) {
        this.attendType = attendType;
    }

    /**
     * 获取话题内容
     *
     * @return content - 话题内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置话题内容
     *
     * @param content 话题内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", attendCount=").append(attendCount);
        sb.append(", attentionCount=").append(attentionCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", awardName=").append(awardName);
        sb.append(", attendType=").append(attendType);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}