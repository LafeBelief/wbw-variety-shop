package cn.wbw.vs.model;

import io.swagger.annotations.*;
import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`oms_company_address`")
@Api(value = "oms_company_address",tags = {"公司收发货地址表"})
public class OmsCompanyAddress implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 地址名称
     */
    @ApiModelProperty(value = "地址名称")
    @Column(name = "`address_name`")
    private String addressName;

    /**
     * 默认发货地址：0->否；1->是
     */
    @ApiModelProperty(value = "默认发货地址：0->否；1->是")
    @Column(name = "`send_status`")
    private Integer sendStatus;

    /**
     * 是否默认收货地址：0->否；1->是
     */
    @ApiModelProperty(value = "是否默认收货地址：0->否；1->是")
    @Column(name = "`receive_status`")
    private Integer receiveStatus;

    /**
     * 收发货人姓名
     */
    @ApiModelProperty(value = "收发货人姓名")
    @Column(name = "`name`")
    private String name;

    /**
     * 收货人电话
     */
    @ApiModelProperty(value = "收货人电话")
    @Column(name = "`phone`")
    private String phone;

    /**
     * 省/直辖市
     */
    @ApiModelProperty(value = "省/直辖市")
    @Column(name = "`province`")
    private String province;

    /**
     * 市
     */
    @ApiModelProperty(value = "市")
    @Column(name = "`city`")
    private String city;

    /**
     * 区
     */
    @ApiModelProperty(value = "区")
    @Column(name = "`region`")
    private String region;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "详细地址")
    @Column(name = "`detail_address`")
    private String detailAddress;

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
     * 获取地址名称
     *
     * @return address_name - 地址名称
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * 设置地址名称
     *
     * @param addressName 地址名称
     */
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    /**
     * 获取默认发货地址：0->否；1->是
     *
     * @return send_status - 默认发货地址：0->否；1->是
     */
    public Integer getSendStatus() {
        return sendStatus;
    }

    /**
     * 设置默认发货地址：0->否；1->是
     *
     * @param sendStatus 默认发货地址：0->否；1->是
     */
    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    /**
     * 获取是否默认收货地址：0->否；1->是
     *
     * @return receive_status - 是否默认收货地址：0->否；1->是
     */
    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    /**
     * 设置是否默认收货地址：0->否；1->是
     *
     * @param receiveStatus 是否默认收货地址：0->否；1->是
     */
    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    /**
     * 获取收发货人姓名
     *
     * @return name - 收发货人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置收发货人姓名
     *
     * @param name 收发货人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取收货人电话
     *
     * @return phone - 收货人电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置收货人电话
     *
     * @param phone 收货人电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取省/直辖市
     *
     * @return province - 省/直辖市
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省/直辖市
     *
     * @param province 省/直辖市
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return region - 区
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置区
     *
     * @param region 区
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 获取详细地址
     *
     * @return detail_address - 详细地址
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 设置详细地址
     *
     * @param detailAddress 详细地址
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", addressName=").append(addressName);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", receiveStatus=").append(receiveStatus);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", detailAddress=").append(detailAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}