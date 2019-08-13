package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`pms_product_attribute_category`")
@Api(value = "pms_product_attribute_category",tags = {"产品属性分类表"})
public class PmsProductAttributeCategory implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    /**
     * 属性数量
     */
    @ApiModelProperty(value = "属性数量")
    @Column(name = "`attribute_count`")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @ApiModelProperty(value = "参数数量")
    @Column(name = "`param_count`")
    private Integer paramCount;

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
     * 获取属性数量
     *
     * @return attribute_count - 属性数量
     */
    public Integer getAttributeCount() {
        return attributeCount;
    }

    /**
     * 设置属性数量
     *
     * @param attributeCount 属性数量
     */
    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    /**
     * 获取参数数量
     *
     * @return param_count - 参数数量
     */
    public Integer getParamCount() {
        return paramCount;
    }

    /**
     * 设置参数数量
     *
     * @param paramCount 参数数量
     */
    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", attributeCount=").append(attributeCount);
        sb.append(", paramCount=").append(paramCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}