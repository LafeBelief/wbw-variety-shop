package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`cms_member_report`")
@Api(value = "cms_member_report",tags = {"用户举报表"})
public class CmsMemberReport implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    @ApiModelProperty(value = "举报类型：0->商品评价；1->话题内容；2->用户评论")
    @Column(name = "`report_type`")
    private Integer reportType;

    /**
     * 举报人
     */
    @ApiModelProperty(value = "举报人")
    @Column(name = "`report_member_name`")
    private String reportMemberName;

    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`report_object`")
    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     */
    @ApiModelProperty(value = "举报状态：0->未处理；1->已处理")
    @Column(name = "`report_status`")
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    @ApiModelProperty(value = "处理结果：0->无效；1->有效；2->恶意")
    @Column(name = "`handle_status`")
    private Integer handleStatus;

    @Column(name = "`note`")
    private String note;

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
     * 获取举报类型：0->商品评价；1->话题内容；2->用户评论
     *
     * @return report_type - 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    public Integer getReportType() {
        return reportType;
    }

    /**
     * 设置举报类型：0->商品评价；1->话题内容；2->用户评论
     *
     * @param reportType 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    /**
     * 获取举报人
     *
     * @return report_member_name - 举报人
     */
    public String getReportMemberName() {
        return reportMemberName;
    }

    /**
     * 设置举报人
     *
     * @param reportMemberName 举报人
     */
    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName;
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
     * @return report_object
     */
    public String getReportObject() {
        return reportObject;
    }

    /**
     * @param reportObject
     */
    public void setReportObject(String reportObject) {
        this.reportObject = reportObject;
    }

    /**
     * 获取举报状态：0->未处理；1->已处理
     *
     * @return report_status - 举报状态：0->未处理；1->已处理
     */
    public Integer getReportStatus() {
        return reportStatus;
    }

    /**
     * 设置举报状态：0->未处理；1->已处理
     *
     * @param reportStatus 举报状态：0->未处理；1->已处理
     */
    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * 获取处理结果：0->无效；1->有效；2->恶意
     *
     * @return handle_status - 处理结果：0->无效；1->有效；2->恶意
     */
    public Integer getHandleStatus() {
        return handleStatus;
    }

    /**
     * 设置处理结果：0->无效；1->有效；2->恶意
     *
     * @param handleStatus 处理结果：0->无效；1->有效；2->恶意
     */
    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportType=").append(reportType);
        sb.append(", reportMemberName=").append(reportMemberName);
        sb.append(", createTime=").append(createTime);
        sb.append(", reportObject=").append(reportObject);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}