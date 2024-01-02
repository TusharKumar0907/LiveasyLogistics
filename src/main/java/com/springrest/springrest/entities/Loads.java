package com.springrest.springrest.entities;

public class Loads {
	
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private int weight;
	private String comment;
	private int shipper;
	private String Date;
	private int loadId;
	
	public Loads() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Loads(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, int shipper, String date, int loadId) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipper = shipper;
		this.loadId = loadId;
		Date = date;
	}
	
	public Loads(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String comment, int shipper, String date, int loadId) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipper = shipper;
		this.loadId = loadId;
		Date = date;
	}
	

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public int getWeight() {
		return weight;
	}
	
	public int getLoadId() {
		return loadId;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getShipper() {
		return shipper;
	}

	public void setShipper(int shipper) {
		this.shipper = shipper;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	
}
