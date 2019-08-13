package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`pms_product_attribute_value`")
@Api(value = "pms_product_attribute_value",tags = {"存储产品参数信息的表"})
public class PmsProductAttributeValue implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`product_id`")
    private Long productId;

    @Column(name = "`product_attribute_id`")
    private Long productAttributeId;

    /**
     * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    @ApiModelProperty(value = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    @Column(name = "`value`")
    private String value;

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
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return product_attribute_id
     */
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    /**
     * @param productAttributeId
     */
    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    /**
     * 获取手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     *
     * @return value - 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     *
     * @param value 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productAttributeId=").append(productAttributeId);
        sb.append(", value=").append(value);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}