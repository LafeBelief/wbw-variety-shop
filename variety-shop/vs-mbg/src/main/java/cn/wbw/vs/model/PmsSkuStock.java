package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`pms_sku_stock`")
@Api(value = "pms_sku_stock",tags = {"sku的库存"})
public class PmsSkuStock implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`product_id`")
    private Long productId;

    /**
     * sku编码
     */
    @ApiModelProperty(value = "sku编码")
    @Column(name = "`sku_code`")
    private String skuCode;

    @Column(name = "`price`")
    private BigDecimal price;

    /**
     * 库存
     */
    @ApiModelProperty(value = "库存")
    @Column(name = "`stock`")
    private Integer stock;

    /**
     * 预警库存
     */
    @ApiModelProperty(value = "预警库存")
    @Column(name = "`low_stock`")
    private Integer lowStock;

    /**
     * 销售属性1
     */
    @ApiModelProperty(value = "销售属性1")
    @Column(name = "`sp1`")
    private String sp1;

    @Column(name = "`sp2`")
    private String sp2;

    @Column(name = "`sp3`")
    private String sp3;

    /**
     * 展示图片
     */
    @ApiModelProperty(value = "展示图片")
    @Column(name = "`pic`")
    private String pic;

    /**
     * 销量
     */
    @ApiModelProperty(value = "销量")
    @Column(name = "`sale`")
    private Integer sale;

    /**
     * 单品促销价格
     */
    @ApiModelProperty(value = "单品促销价格")
    @Column(name = "`promotion_price`")
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    @ApiModelProperty(value = "锁定库存")
    @Column(name = "`lock_stock`")
    private Integer lockStock;

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
     * 获取sku编码
     *
     * @return sku_code - sku编码
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * 设置sku编码
     *
     * @param skuCode sku编码
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取库存
     *
     * @return stock - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取预警库存
     *
     * @return low_stock - 预警库存
     */
    public Integer getLowStock() {
        return lowStock;
    }

    /**
     * 设置预警库存
     *
     * @param lowStock 预警库存
     */
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    /**
     * 获取销售属性1
     *
     * @return sp1 - 销售属性1
     */
    public String getSp1() {
        return sp1;
    }

    /**
     * 设置销售属性1
     *
     * @param sp1 销售属性1
     */
    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    /**
     * @return sp2
     */
    public String getSp2() {
        return sp2;
    }

    /**
     * @param sp2
     */
    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    /**
     * @return sp3
     */
    public String getSp3() {
        return sp3;
    }

    /**
     * @param sp3
     */
    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    /**
     * 获取展示图片
     *
     * @return pic - 展示图片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置展示图片
     *
     * @param pic 展示图片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取销量
     *
     * @return sale - 销量
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 设置销量
     *
     * @param sale 销量
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * 获取单品促销价格
     *
     * @return promotion_price - 单品促销价格
     */
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * 设置单品促销价格
     *
     * @param promotionPrice 单品促销价格
     */
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 获取锁定库存
     *
     * @return lock_stock - 锁定库存
     */
    public Integer getLockStock() {
        return lockStock;
    }

    /**
     * 设置锁定库存
     *
     * @param lockStock 锁定库存
     */
    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", skuCode=").append(skuCode);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", sp1=").append(sp1);
        sb.append(", sp2=").append(sp2);
        sb.append(", sp3=").append(sp3);
        sb.append(", pic=").append(pic);
        sb.append(", sale=").append(sale);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}