package com.demo;

public class Sample {
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + ", labName=" + labName + ", sampleType="
				+ sampleType + "]";
	}
	
	
	public Sample() {
	}
	
	
	public Sample(int sampleId) {
		this.sampleId = sampleId;
	}
	
	
	public Sample(int sampleId, String sampleName) {
		this.sampleId = sampleId;
		this.sampleName = sampleName;
	}
	
	public Sample(int sampleId, String sampleName, String labName) {
		this.sampleId = sampleId;
		this.sampleName = sampleName;
		this.labName = labName;
	}
	
	public Sample(int sampleId, String sampleName, String labName, String sampleType) {
		this.sampleId = sampleId;
		this.sampleName = sampleName;
		this.labName = labName;
		this.sampleType = sampleType;
	}
	
	public int getSampleId() {
		return sampleId;
	}
	public String getSampleName() {
		return sampleName;
	}
	public String getLabName() {
		return labName;
	}
	public String getSampleType() {
		return sampleType;
	}
	private int sampleId;
	private String sampleName;
	private String labName;
	private String sampleType;
	

}
