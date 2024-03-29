package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`ums_member_tag`")
@Api(value = "ums_member_tag",tags = {"用户标签表"})
public class UmsMemberTag implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    /**
     * 自动打标签完成订单数量
     */
    @ApiModelProperty(value = "自动打标签完成订单数量")
    @Column(name = "`finish_order_count`")
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    @ApiModelProperty(value = "自动打标签完成订单金额")
    @Column(name = "`finish_order_amount`")
    private BigDecimal finishOrderAmount;

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
     * 获取自动打标签完成订单数量
     *
     * @return finish_order_count - 自动打标签完成订单数量
     */
    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    /**
     * 设置自动打标签完成订单数量
     *
     * @param finishOrderCount 自动打标签完成订单数量
     */
    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    /**
     * 获取自动打标签完成订单金额
     *
     * @return finish_order_amount - 自动打标签完成订单金额
     */
    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    /**
     * 设置自动打标签完成订单金额
     *
     * @param finishOrderAmount 自动打标签完成订单金额
     */
    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", finishOrderCount=").append(finishOrderCount);
        sb.append(", finishOrderAmount=").append(finishOrderAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}