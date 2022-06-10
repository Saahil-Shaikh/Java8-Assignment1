package com.assign1.service;

import java.util.List;

import com.assign1.entity.Complaints;

public interface ServiceImpl {
	
	public List<Complaints> getComplaintById(int complaintId);
	
	public List<Complaints> getComplaintByYear(int year);
	
	public List<Complaints> getComplaintByBankName(String bankName);
	
	public long getComplaintResolutionPeriod(int complaintId);

}
