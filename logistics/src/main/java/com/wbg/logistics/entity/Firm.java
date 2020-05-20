package com.wbg.logistics.entity;

public class Firm {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column firm.firm_no
     *
     * @mbg.generated
     */
    private Integer firmNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column firm.firm_name
     *
     * @mbg.generated
     */
    private String firmName;

    public Firm() {
    }

    public Firm(Integer firmNo, String firmName) {
        this.firmNo = firmNo;
        this.firmName = firmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column firm.firm_no
     *
     * @return the value of firm.firm_no
     *
     * @mbg.generated
     */
    public Integer getFirmNo() {
        return firmNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column firm.firm_no
     *
     * @param firmNo the value for firm.firm_no
     *
     * @mbg.generated
     */
    public void setFirmNo(Integer firmNo) {
        this.firmNo = firmNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column firm.firm_name
     *
     * @return the value of firm.firm_name
     *
     * @mbg.generated
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column firm.firm_name
     *
     * @param firmName the value for firm.firm_name
     *
     * @mbg.generated
     */
    public void setFirmName(String firmName) {
        this.firmName = firmName == null ? null : firmName.trim();
    }
}