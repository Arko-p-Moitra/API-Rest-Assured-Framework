package com.api.model.response;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KYCStatusResponse {

	@JsonProperty("overallStatus")
	private String overallStatus;
	@JsonProperty("documentStatus")
	private Map<String, String> documentStatus;
	@JsonProperty("totalDocuments")
	private int totalDocuments;
	@JsonProperty("pendingDocuments")
	private int pendingDocuments;
	
	public KYCStatusResponse() {
		
	}

	public KYCStatusResponse(String overallStatus, Map<String, String> documentStatus, int totalDocuments,
			int pendingDocuments) {
		super();
		this.overallStatus = overallStatus;
		this.documentStatus = documentStatus;
		this.totalDocuments = totalDocuments;
		this.pendingDocuments = pendingDocuments;
	}

	public String getOverallStatus() {
		return overallStatus;
	}

	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}

	public Map<String, String> getDocumentStatus() {
		return documentStatus;
	}

	public void setDocumentStatus(Map<String, String> documentStatus) {
		this.documentStatus = documentStatus;
	}

	public int getTotalDocuments() {
		return totalDocuments;
	}

	public void setTotalDocuments(int totalDocuments) {
		this.totalDocuments = totalDocuments;
	}

	public int getPendingDocuments() {
		return pendingDocuments;
	}

	public void setPendingDocuments(int pendingDocuments) {
		this.pendingDocuments = pendingDocuments;
	}

	@Override
	public String toString() {
		return "KYCStatusResponse [overallStatus=" + overallStatus + ", documentStatus=" + documentStatus
				+ ", totalDocuments=" + totalDocuments + ", pendingDocuments=" + pendingDocuments + "]";
	}

	
}
