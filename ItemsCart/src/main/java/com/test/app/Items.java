package com.test.app;

public class Items 
{
	private int itemId;
	private String itemName;
	private String itemStatus;
	private int itemCount;

	public Items(int itemId, String itemName, String itemStatus, int itemCount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemStatus = itemStatus;
		this.itemCount = itemCount;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
}
