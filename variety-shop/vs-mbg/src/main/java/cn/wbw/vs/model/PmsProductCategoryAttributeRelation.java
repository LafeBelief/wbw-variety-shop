package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`pms_product_category_attribute_relation`")
@Api(value = "pms_product_category_attribute_relation",tags = {"产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）"})
public class PmsProductCategoryAttributeRelation implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`product_category_id`")
    private Long productCategoryId;

    @Column(name = "`product_attribute_id`")
    private Long productAttributeId;

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
     * @return product_category_id
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * @param productCategoryId
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", productAttributeId=").append(productAttributeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}