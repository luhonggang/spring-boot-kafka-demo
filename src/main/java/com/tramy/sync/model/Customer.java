package com.tramy.sync.model;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_ID
     *
     * @mbggenerated
     */
    private BigDecimal customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_CODE
     *
     * @mbggenerated
     */
    private String customerCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_NAME
     *
     * @mbggenerated
     */
    private String customerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_AID
     *
     * @mbggenerated
     */
    private String customerAid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_OLD_CODE
     *
     * @mbggenerated
     */
    private String customerOldCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_DESCRIBE
     *
     * @mbggenerated
     */
    private String customerDescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_SORT_ID
     *
     * @mbggenerated
     */
    private BigDecimal customerSortId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_GRADE_ID
     *
     * @mbggenerated
     */
    private BigDecimal customerGradeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_TYPE_CODE
     *
     * @mbggenerated
     */
    private String customerTypeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_TYPE_ID
     *
     * @mbggenerated
     */
    private BigDecimal customerTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_STATUS
     *
     * @mbggenerated
     */
    private String customerStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.PROVINCE_CODE
     *
     * @mbggenerated
     */
    private String provinceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.PROVINCE_NAME
     *
     * @mbggenerated
     */
    private String provinceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CITY_CODE
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CITY_NAME
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.AREA_CODE
     *
     * @mbggenerated
     */
    private String areaCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.AREA_NAME
     *
     * @mbggenerated
     */
    private String areaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_ADDRESS
     *
     * @mbggenerated
     */
    private String customerAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_LINKMAN
     *
     * @mbggenerated
     */
    private String customerLinkman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.LINKMAN_TEL
     *
     * @mbggenerated
     */
    private String linkmanTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.LINKMAN_MOBILE
     *
     * @mbggenerated
     */
    private String linkmanMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.LINKMAN_FAX
     *
     * @mbggenerated
     */
    private String linkmanFax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.LINKMAN_EMAIL
     *
     * @mbggenerated
     */
    private String linkmanEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_IM
     *
     * @mbggenerated
     */
    private String customerIm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.BILL_CYCLE_ID
     *
     * @mbggenerated
     */
    private BigDecimal billCycleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.BILL_CYCLE_CODE
     *
     * @mbggenerated
     */
    private String billCycleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.PAYMENT_DAY
     *
     * @mbggenerated
     */
    private Integer paymentDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CUSTOMER_IS_ADVANCE
     *
     * @mbggenerated
     */
    private String customerIsAdvance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.ADVANCE_PAYMENT
     *
     * @mbggenerated
     */
    private BigDecimal advancePayment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.ANTECEDENT_MONEY
     *
     * @mbggenerated
     */
    private BigDecimal antecedentMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.KINGDEE_INTERFACE
     *
     * @mbggenerated
     */
    private String kingdeeInterface;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TF_SSS_CUSTOMER.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_ID
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_ID
     *
     * @mbggenerated
     */
    public BigDecimal getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_ID
     *
     * @param customerId the value for TF_SSS_CUSTOMER.CUSTOMER_ID
     *
     * @mbggenerated
     */
    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_CODE
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_CODE
     *
     * @mbggenerated
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_CODE
     *
     * @param customerCode the value for TF_SSS_CUSTOMER.CUSTOMER_CODE
     *
     * @mbggenerated
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_NAME
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_NAME
     *
     * @mbggenerated
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_NAME
     *
     * @param customerName the value for TF_SSS_CUSTOMER.CUSTOMER_NAME
     *
     * @mbggenerated
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_AID
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_AID
     *
     * @mbggenerated
     */
    public String getCustomerAid() {
        return customerAid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_AID
     *
     * @param customerAid the value for TF_SSS_CUSTOMER.CUSTOMER_AID
     *
     * @mbggenerated
     */
    public void setCustomerAid(String customerAid) {
        this.customerAid = customerAid == null ? null : customerAid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_OLD_CODE
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_OLD_CODE
     *
     * @mbggenerated
     */
    public String getCustomerOldCode() {
        return customerOldCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_OLD_CODE
     *
     * @param customerOldCode the value for TF_SSS_CUSTOMER.CUSTOMER_OLD_CODE
     *
     * @mbggenerated
     */
    public void setCustomerOldCode(String customerOldCode) {
        this.customerOldCode = customerOldCode == null ? null : customerOldCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_DESCRIBE
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_DESCRIBE
     *
     * @mbggenerated
     */
    public String getCustomerDescribe() {
        return customerDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_DESCRIBE
     *
     * @param customerDescribe the value for TF_SSS_CUSTOMER.CUSTOMER_DESCRIBE
     *
     * @mbggenerated
     */
    public void setCustomerDescribe(String customerDescribe) {
        this.customerDescribe = customerDescribe == null ? null : customerDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_SORT_ID
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_SORT_ID
     *
     * @mbggenerated
     */
    public BigDecimal getCustomerSortId() {
        return customerSortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_SORT_ID
     *
     * @param customerSortId the value for TF_SSS_CUSTOMER.CUSTOMER_SORT_ID
     *
     * @mbggenerated
     */
    public void setCustomerSortId(BigDecimal customerSortId) {
        this.customerSortId = customerSortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_GRADE_ID
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_GRADE_ID
     *
     * @mbggenerated
     */
    public BigDecimal getCustomerGradeId() {
        return customerGradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_GRADE_ID
     *
     * @param customerGradeId the value for TF_SSS_CUSTOMER.CUSTOMER_GRADE_ID
     *
     * @mbggenerated
     */
    public void setCustomerGradeId(BigDecimal customerGradeId) {
        this.customerGradeId = customerGradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_TYPE_CODE
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_TYPE_CODE
     *
     * @mbggenerated
     */
    public String getCustomerTypeCode() {
        return customerTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_TYPE_CODE
     *
     * @param customerTypeCode the value for TF_SSS_CUSTOMER.CUSTOMER_TYPE_CODE
     *
     * @mbggenerated
     */
    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode == null ? null : customerTypeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_TYPE_ID
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_TYPE_ID
     *
     * @mbggenerated
     */
    public BigDecimal getCustomerTypeId() {
        return customerTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_TYPE_ID
     *
     * @param customerTypeId the value for TF_SSS_CUSTOMER.CUSTOMER_TYPE_ID
     *
     * @mbggenerated
     */
    public void setCustomerTypeId(BigDecimal customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_STATUS
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_STATUS
     *
     * @mbggenerated
     */
    public String getCustomerStatus() {
        return customerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_STATUS
     *
     * @param customerStatus the value for TF_SSS_CUSTOMER.CUSTOMER_STATUS
     *
     * @mbggenerated
     */
    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus == null ? null : customerStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.PROVINCE_CODE
     *
     * @return the value of TF_SSS_CUSTOMER.PROVINCE_CODE
     *
     * @mbggenerated
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.PROVINCE_CODE
     *
     * @param provinceCode the value for TF_SSS_CUSTOMER.PROVINCE_CODE
     *
     * @mbggenerated
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.PROVINCE_NAME
     *
     * @return the value of TF_SSS_CUSTOMER.PROVINCE_NAME
     *
     * @mbggenerated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.PROVINCE_NAME
     *
     * @param provinceName the value for TF_SSS_CUSTOMER.PROVINCE_NAME
     *
     * @mbggenerated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CITY_CODE
     *
     * @return the value of TF_SSS_CUSTOMER.CITY_CODE
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CITY_CODE
     *
     * @param cityCode the value for TF_SSS_CUSTOMER.CITY_CODE
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CITY_NAME
     *
     * @return the value of TF_SSS_CUSTOMER.CITY_NAME
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CITY_NAME
     *
     * @param cityName the value for TF_SSS_CUSTOMER.CITY_NAME
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.AREA_CODE
     *
     * @return the value of TF_SSS_CUSTOMER.AREA_CODE
     *
     * @mbggenerated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.AREA_CODE
     *
     * @param areaCode the value for TF_SSS_CUSTOMER.AREA_CODE
     *
     * @mbggenerated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.AREA_NAME
     *
     * @return the value of TF_SSS_CUSTOMER.AREA_NAME
     *
     * @mbggenerated
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.AREA_NAME
     *
     * @param areaName the value for TF_SSS_CUSTOMER.AREA_NAME
     *
     * @mbggenerated
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_ADDRESS
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_ADDRESS
     *
     * @mbggenerated
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_ADDRESS
     *
     * @param customerAddress the value for TF_SSS_CUSTOMER.CUSTOMER_ADDRESS
     *
     * @mbggenerated
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_LINKMAN
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_LINKMAN
     *
     * @mbggenerated
     */
    public String getCustomerLinkman() {
        return customerLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_LINKMAN
     *
     * @param customerLinkman the value for TF_SSS_CUSTOMER.CUSTOMER_LINKMAN
     *
     * @mbggenerated
     */
    public void setCustomerLinkman(String customerLinkman) {
        this.customerLinkman = customerLinkman == null ? null : customerLinkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.LINKMAN_TEL
     *
     * @return the value of TF_SSS_CUSTOMER.LINKMAN_TEL
     *
     * @mbggenerated
     */
    public String getLinkmanTel() {
        return linkmanTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.LINKMAN_TEL
     *
     * @param linkmanTel the value for TF_SSS_CUSTOMER.LINKMAN_TEL
     *
     * @mbggenerated
     */
    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel == null ? null : linkmanTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.LINKMAN_MOBILE
     *
     * @return the value of TF_SSS_CUSTOMER.LINKMAN_MOBILE
     *
     * @mbggenerated
     */
    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.LINKMAN_MOBILE
     *
     * @param linkmanMobile the value for TF_SSS_CUSTOMER.LINKMAN_MOBILE
     *
     * @mbggenerated
     */
    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile == null ? null : linkmanMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.LINKMAN_FAX
     *
     * @return the value of TF_SSS_CUSTOMER.LINKMAN_FAX
     *
     * @mbggenerated
     */
    public String getLinkmanFax() {
        return linkmanFax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.LINKMAN_FAX
     *
     * @param linkmanFax the value for TF_SSS_CUSTOMER.LINKMAN_FAX
     *
     * @mbggenerated
     */
    public void setLinkmanFax(String linkmanFax) {
        this.linkmanFax = linkmanFax == null ? null : linkmanFax.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.LINKMAN_EMAIL
     *
     * @return the value of TF_SSS_CUSTOMER.LINKMAN_EMAIL
     *
     * @mbggenerated
     */
    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.LINKMAN_EMAIL
     *
     * @param linkmanEmail the value for TF_SSS_CUSTOMER.LINKMAN_EMAIL
     *
     * @mbggenerated
     */
    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail == null ? null : linkmanEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_IM
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_IM
     *
     * @mbggenerated
     */
    public String getCustomerIm() {
        return customerIm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_IM
     *
     * @param customerIm the value for TF_SSS_CUSTOMER.CUSTOMER_IM
     *
     * @mbggenerated
     */
    public void setCustomerIm(String customerIm) {
        this.customerIm = customerIm == null ? null : customerIm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.BILL_CYCLE_ID
     *
     * @return the value of TF_SSS_CUSTOMER.BILL_CYCLE_ID
     *
     * @mbggenerated
     */
    public BigDecimal getBillCycleId() {
        return billCycleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.BILL_CYCLE_ID
     *
     * @param billCycleId the value for TF_SSS_CUSTOMER.BILL_CYCLE_ID
     *
     * @mbggenerated
     */
    public void setBillCycleId(BigDecimal billCycleId) {
        this.billCycleId = billCycleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.BILL_CYCLE_CODE
     *
     * @return the value of TF_SSS_CUSTOMER.BILL_CYCLE_CODE
     *
     * @mbggenerated
     */
    public String getBillCycleCode() {
        return billCycleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.BILL_CYCLE_CODE
     *
     * @param billCycleCode the value for TF_SSS_CUSTOMER.BILL_CYCLE_CODE
     *
     * @mbggenerated
     */
    public void setBillCycleCode(String billCycleCode) {
        this.billCycleCode = billCycleCode == null ? null : billCycleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.PAYMENT_DAY
     *
     * @return the value of TF_SSS_CUSTOMER.PAYMENT_DAY
     *
     * @mbggenerated
     */
    public Integer getPaymentDay() {
        return paymentDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.PAYMENT_DAY
     *
     * @param paymentDay the value for TF_SSS_CUSTOMER.PAYMENT_DAY
     *
     * @mbggenerated
     */
    public void setPaymentDay(Integer paymentDay) {
        this.paymentDay = paymentDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CUSTOMER_IS_ADVANCE
     *
     * @return the value of TF_SSS_CUSTOMER.CUSTOMER_IS_ADVANCE
     *
     * @mbggenerated
     */
    public String getCustomerIsAdvance() {
        return customerIsAdvance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CUSTOMER_IS_ADVANCE
     *
     * @param customerIsAdvance the value for TF_SSS_CUSTOMER.CUSTOMER_IS_ADVANCE
     *
     * @mbggenerated
     */
    public void setCustomerIsAdvance(String customerIsAdvance) {
        this.customerIsAdvance = customerIsAdvance == null ? null : customerIsAdvance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.ADVANCE_PAYMENT
     *
     * @return the value of TF_SSS_CUSTOMER.ADVANCE_PAYMENT
     *
     * @mbggenerated
     */
    public BigDecimal getAdvancePayment() {
        return advancePayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.ADVANCE_PAYMENT
     *
     * @param advancePayment the value for TF_SSS_CUSTOMER.ADVANCE_PAYMENT
     *
     * @mbggenerated
     */
    public void setAdvancePayment(BigDecimal advancePayment) {
        this.advancePayment = advancePayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.ANTECEDENT_MONEY
     *
     * @return the value of TF_SSS_CUSTOMER.ANTECEDENT_MONEY
     *
     * @mbggenerated
     */
    public BigDecimal getAntecedentMoney() {
        return antecedentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.ANTECEDENT_MONEY
     *
     * @param antecedentMoney the value for TF_SSS_CUSTOMER.ANTECEDENT_MONEY
     *
     * @mbggenerated
     */
    public void setAntecedentMoney(BigDecimal antecedentMoney) {
        this.antecedentMoney = antecedentMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.KINGDEE_INTERFACE
     *
     * @return the value of TF_SSS_CUSTOMER.KINGDEE_INTERFACE
     *
     * @mbggenerated
     */
    public String getKingdeeInterface() {
        return kingdeeInterface;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.KINGDEE_INTERFACE
     *
     * @param kingdeeInterface the value for TF_SSS_CUSTOMER.KINGDEE_INTERFACE
     *
     * @mbggenerated
     */
    public void setKingdeeInterface(String kingdeeInterface) {
        this.kingdeeInterface = kingdeeInterface == null ? null : kingdeeInterface.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.CREATE_TIME
     *
     * @return the value of TF_SSS_CUSTOMER.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.CREATE_TIME
     *
     * @param createTime the value for TF_SSS_CUSTOMER.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TF_SSS_CUSTOMER.UPDATE_TIME
     *
     * @return the value of TF_SSS_CUSTOMER.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TF_SSS_CUSTOMER.UPDATE_TIME
     *
     * @param updateTime the value for TF_SSS_CUSTOMER.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}