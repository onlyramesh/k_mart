package com.kirani.kiranibackendcode.entity;

import javax.persistence.*;



@Entity
@Table(name="orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderID;

    private int orderStatus;
    private String orderDate;
    private String orderTime;
    private String orderBillHash;
    private double orderTotal;
    private String orderContactName;
    private String orderContactNumber;
    private String orderAddress;
    private String orderCouponApplied;
    private double orderCouponDiscount;
    private String orderElseProductHash;
    private String reason;
    private String comment;

    public Orders(){}

    public Orders(int orderID, int orderStatus, String orderDate, String orderTime, String orderBillHash, double orderTotal, String orderContactName, String orderContactNumber, String orderAddress, String orderCouponApplied, double orderCouponDiscount, String orderElseProductHash, String reason, String comment) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderBillHash = orderBillHash;
        this.orderTotal = orderTotal;
        this.orderContactName = orderContactName;
        this.orderContactNumber = orderContactNumber;
        this.orderAddress = orderAddress;
        this.orderCouponApplied = orderCouponApplied;
        this.orderCouponDiscount = orderCouponDiscount;
        this.orderElseProductHash = orderElseProductHash;
        this.reason = reason;
        this.comment = comment;
    }

    public Orders(int orderStatus, String orderDate, String orderTime, String orderBillHash, double orderTotal, String orderContactName, String orderContactNumber, String orderAddress, String orderCouponApplied, double orderCouponDiscount, String orderElseProductHash, String reason, String comment) {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderBillHash() {
        return orderBillHash;
    }

    public void setOrderBillHash(String orderBillHash) {
        this.orderBillHash = orderBillHash;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderContactName() {
        return orderContactName;
    }

    public void setOrderContactName(String orderContactName) {
        this.orderContactName = orderContactName;
    }

    public String getOrderContactNumber() {
        return orderContactNumber;
    }

    public void setOrderContactNumber(String orderContactNumber) {
        this.orderContactNumber = orderContactNumber;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderCouponApplied() {
        return orderCouponApplied;
    }

    public void setOrderCouponApplied(String orderCouponApplied) {
        this.orderCouponApplied = orderCouponApplied;
    }

    public double getOrderCouponDiscount() {
        return orderCouponDiscount;
    }

    public void setOrderCouponDiscount(double orderCouponDiscount) {
        this.orderCouponDiscount = orderCouponDiscount;
    }

    public String getOrderElseProductHash() {
        return orderElseProductHash;
    }

    public void setOrderElseProductHash(String orderElseProductHash) {
        this.orderElseProductHash = orderElseProductHash;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", orderStatus=" + orderStatus +
                ", orderDate='" + orderDate + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderBillHash='" + orderBillHash + '\'' +
                ", orderTotal=" + orderTotal +
                ", orderContactName='" + orderContactName + '\'' +
                ", orderContactNumber='" + orderContactNumber + '\'' +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderCouponApplied='" + orderCouponApplied + '\'' +
                ", orderCouponDiscount=" + orderCouponDiscount +
                ", orderElseProductHash='" + orderElseProductHash + '\'' +
                ", reason='" + reason + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
