package com.tns.OrderService;

//import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_db")
public class Order 
{
	@Id
	@Column(name="orderid")
	private int orderid;
	
	@Column(name="productname")
	private String productname;
	
	@Column(name="buyername")
	private String buyername;
	
	@Column(name="totalamount")
	private String totalamount;
	
	@Column(name="modeofpayment")
	private String modeofpayment;
	
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getBuyername() {
		return buyername;
	}

	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}

	public String getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}

	public String getModeofpayment() {
		return modeofpayment;
	}

	public void setModeofpayment(String modeofpayment) {
		this.modeofpayment = modeofpayment;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, String productname, String buyername, String totalamount, String modeofpayment) {
		super();
		this.orderid = orderid;
		this.productname = productname;
		this.buyername = buyername;
		this.totalamount = totalamount;
		this.modeofpayment = modeofpayment;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", productname=" + productname + ", buyername=" + buyername
				+ ", totalamount=" + totalamount + ", modeofpayment=" + modeofpayment + "]";
	}
	

	
	
	
}
