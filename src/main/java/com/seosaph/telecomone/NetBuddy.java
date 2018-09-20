package com.seosaph.telecomone;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="netbuddy")
public class NetBuddy {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sheetName;
    private String cmeName;
    private Long fieldTsgNo;
    private String srNo;
    private String status;
    private String customerCategory;
    private String complaintCategory;
    private String networkType;
    private String customerName;
    private Long mobileNumber;
    private String district;
    private String remark;
    private Double latitude;
    private Double longitude;
    private Date complaintDate;
    private Date assignedToCmeDate;
    private Date assignedToFieldDate;
    private Date compliantClosedDate;
    
    public NetBuddy(){}
    
	public NetBuddy(String sheetName, String cmeName, Long fieldTsgNo, String srNo, String status,
			String customerCategory, String complaintCategory, String networkType, String customerName,
			Long mobileNumber, String district, String remark, Double latitude, Double longitude, Date complaintDate,
			Date assignedToCmeDate, Date assignedToFieldDate, Date compliantClosedDate) {
		super();
		this.setSheetName(sheetName);
		this.cmeName = cmeName;
		this.fieldTsgNo = fieldTsgNo;
		this.srNo = srNo;
		this.status = status;
		this.customerCategory = customerCategory;
		this.complaintCategory = complaintCategory;
		this.networkType = networkType;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.district = district;
		this.remark = remark;
		this.latitude = latitude;
		this.longitude = longitude;
		this.complaintDate = complaintDate;
		this.assignedToCmeDate = assignedToCmeDate;
		this.assignedToFieldDate = assignedToFieldDate;
		this.compliantClosedDate = compliantClosedDate;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	public String getSheetName() {
		return sheetName;
	}
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}
	/**
	 * @return the cmeName
	 */
	public String getCmeName() {
		return cmeName;
	}
	/**
	 * @param cmeName the cmeName to set
	 */
	public void setCmeName(String cmeName) {
		this.cmeName = cmeName;
	}
	/**
	 * @return the fieldTsgNo
	 */
	public Long getFieldTsgNo() {
		return fieldTsgNo;
	}
	/**
	 * @param fieldTsgNo the fieldTsgNo to set
	 */
	public void setFieldTsgNo(Long fieldTsgNo) {
		this.fieldTsgNo = fieldTsgNo;
	}
	/**
	 * @return the srNo
	 */
	public String getSrNo() {
		return srNo;
	}
	/**
	 * @param srNo the srNo to set
	 */
	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the customerCategory
	 */
	public String getCustomerCategory() {
		return customerCategory;
	}
	/**
	 * @param customerCategory the customerCategory to set
	 */
	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
	/**
	 * @return the complaintCategory
	 */
	public String getComplaintCategory() {
		return complaintCategory;
	}
	/**
	 * @param complaintCategory the complaintCategory to set
	 */
	public void setComplaintCategory(String complaintCategory) {
		this.complaintCategory = complaintCategory;
	}
	/**
	 * @return the networkType
	 */
	public String getNetworkType() {
		return networkType;
	}
	/**
	 * @param networkType the networkType to set
	 */
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the mobileNumber
	 */
	public Long getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the complaintDate
	 */
	public Date getComplaintDate() {
		return complaintDate;
	}
	/**
	 * @param complaintDate the complaintDate to set
	 */
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	/**
	 * @return the assignedToCmeDate
	 */
	public Date getAssignedToCmeDate() {
		return assignedToCmeDate;
	}
	/**
	 * @param assignedToCmeDate the assignedToCmeDate to set
	 */
	public void setAssignedToCmeDate(Date assignedToCmeDate) {
		this.assignedToCmeDate = assignedToCmeDate;
	}
	/**
	 * @return the assignedToFieldDate
	 */
	public Date getAssignedToFieldDate() {
		return assignedToFieldDate;
	}
	/**
	 * @param assignedToFieldDate the assignedToFieldDate to set
	 */
	public void setAssignedToFieldDate(Date assignedToFieldDate) {
		this.assignedToFieldDate = assignedToFieldDate;
	}
	/**
	 * @return the compliantClosedDate
	 */
	public Date getCompliantClosedDate() {
		return compliantClosedDate;
	}
	/**
	 * @param compliantClosedDate the compliantClosedDate to set
	 */
	public void setCompliantClosedDate(Date compliantClosedDate) {
		this.compliantClosedDate = compliantClosedDate;
	}
    
    
    
    
        
    
    
    
    

}
