package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`pms_product_full_reduction`")
@Api(value = "pms_product_full_reduction",tags = {"产品满减表(只针对同商品)"})
public class PmsProductFullReduction implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`product_id`")
    private Long productId;

    @Column(name = "`full_price`")
    private BigDecimal fullPrice;

    @Column(name = "`reduce_price`")
    private BigDecimal reducePrice;

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
     * @return full_price
     */
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    /**
     * @param fullPrice
     */
    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * @return reduce_price
     */
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    /**
     * @param reducePrice
     */
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", fullPrice=").append(fullPrice);
        sb.append(", reducePrice=").append(reducePrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}