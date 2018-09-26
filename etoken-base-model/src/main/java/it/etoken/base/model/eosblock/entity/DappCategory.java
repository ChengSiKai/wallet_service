package it.etoken.base.model.eosblock.entity;

import java.io.Serializable;
import java.util.Date;

public class DappCategory implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4548969699694170995L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dapp_category.id
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dapp_category.name
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dapp_category.create_date
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dapp_category.update_date
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dapp_category.id
     *
     * @return the value of dapp_category.id
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dapp_category.id
     *
     * @param id the value for dapp_category.id
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dapp_category.name
     *
     * @return the value of dapp_category.name
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dapp_category.name
     *
     * @param name the value for dapp_category.name
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dapp_category.create_date
     *
     * @return the value of dapp_category.create_date
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dapp_category.create_date
     *
     * @param createDate the value for dapp_category.create_date
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dapp_category.update_date
     *
     * @return the value of dapp_category.update_date
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dapp_category.update_date
     *
     * @param updateDate the value for dapp_category.update_date
     *
     * @mbg.generated Tue Sep 04 14:48:21 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}