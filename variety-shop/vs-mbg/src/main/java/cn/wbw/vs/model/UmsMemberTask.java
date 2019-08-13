package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`ums_member_task`")
@Api(value = "ums_member_task",tags = {"会员任务表"})
public class UmsMemberTask implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    /**
     * 赠送成长值
     */
    @ApiModelProperty(value = "赠送成长值")
    @Column(name = "`growth`")
    private Integer growth;

    /**
     * 赠送积分
     */
    @ApiModelProperty(value = "赠送积分")
    @Column(name = "`intergration`")
    private Integer intergration;

    /**
     * 任务类型：0->新手任务；1->日常任务
     */
    @ApiModelProperty(value = "任务类型：0->新手任务；1->日常任务")
    @Column(name = "`type`")
    private Integer type;

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
     * 获取赠送成长值
     *
     * @return growth - 赠送成长值
     */
    public Integer getGrowth() {
        return growth;
    }

    /**
     * 设置赠送成长值
     *
     * @param growth 赠送成长值
     */
    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    /**
     * 获取赠送积分
     *
     * @return intergration - 赠送积分
     */
    public Integer getIntergration() {
        return intergration;
    }

    /**
     * 设置赠送积分
     *
     * @param intergration 赠送积分
     */
    public void setIntergration(Integer intergration) {
        this.intergration = intergration;
    }

    /**
     * 获取任务类型：0->新手任务；1->日常任务
     *
     * @return type - 任务类型：0->新手任务；1->日常任务
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置任务类型：0->新手任务；1->日常任务
     *
     * @param type 任务类型：0->新手任务；1->日常任务
     */
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", growth=").append(growth);
        sb.append(", intergration=").append(intergration);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}