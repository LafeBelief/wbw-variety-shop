package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`ums_growth_change_history`")
@Api(value = "ums_growth_change_history",tags = {"成长值变化历史记录表"})
public class UmsGrowthChangeHistory implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`member_id`")
    private Long memberId;

    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 改变类型：0->增加；1->减少
     */
    @ApiModelProperty(value = "改变类型：0->增加；1->减少")
    @Column(name = "`change_type`")
    private Integer changeType;

    /**
     * 积分改变数量
     */
    @ApiModelProperty(value = "积分改变数量")
    @Column(name = "`change_count`")
    private Integer changeCount;

    /**
     * 操作人员
     */
    @ApiModelProperty(value = "操作人员")
    @Column(name = "`operate_man`")
    private String operateMan;

    /**
     * 操作备注
     */
    @ApiModelProperty(value = "操作备注")
    @Column(name = "`operate_note`")
    private String operateNote;

    /**
     * 积分来源：0->购物；1->管理员修改
     */
    @ApiModelProperty(value = "积分来源：0->购物；1->管理员修改")
    @Column(name = "`source_type`")
    private Integer sourceType;

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
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
     * 获取改变类型：0->增加；1->减少
     *
     * @return change_type - 改变类型：0->增加；1->减少
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * 设置改变类型：0->增加；1->减少
     *
     * @param changeType 改变类型：0->增加；1->减少
     */
    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    /**
     * 获取积分改变数量
     *
     * @return change_count - 积分改变数量
     */
    public Integer getChangeCount() {
        return changeCount;
    }

    /**
     * 设置积分改变数量
     *
     * @param changeCount 积分改变数量
     */
    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    /**
     * 获取操作人员
     *
     * @return operate_man - 操作人员
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * 设置操作人员
     *
     * @param operateMan 操作人员
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    /**
     * 获取操作备注
     *
     * @return operate_note - 操作备注
     */
    public String getOperateNote() {
        return operateNote;
    }

    /**
     * 设置操作备注
     *
     * @param operateNote 操作备注
     */
    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote;
    }

    /**
     * 获取积分来源：0->购物；1->管理员修改
     *
     * @return source_type - 积分来源：0->购物；1->管理员修改
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 设置积分来源：0->购物；1->管理员修改
     *
     * @param sourceType 积分来源：0->购物；1->管理员修改
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", changeType=").append(changeType);
        sb.append(", changeCount=").append(changeCount);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", operateNote=").append(operateNote);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}