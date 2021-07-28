package com.demo;

public class Flower implements Cloneable {
	
	
	private int flowerId;
	
	private String flowerName;
	
	private String flowerDescription;
	
	private String flowerType;
	
	private int style;

	
	
	
	public void setFlowerId(int flowerId) {
		this.flowerId = flowerId;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public void setFlowerDescription(String flowerDescription) {
		this.flowerDescription = flowerDescription;
	}

	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	public void setStyle(int style) {
		this.style = style;
	}

	
	public int getFlowerId() {
		return flowerId;
	}
	
	public String getFlowerName() {
		return flowerName;
	}

	public String getFlowerDescription() {
		return flowerDescription;
	}

	public String getFlowerType() {
		return flowerType;
	}
	public int getStyle() {
		return style;
	}
	
	@Override
	public String toString() {
		return "Flower [flowerId=" + flowerId + ", flowerName=" + flowerName + ", flowerDescription="
				+ flowerDescription + ", flowerType=" + flowerType + ", style=" + style + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
