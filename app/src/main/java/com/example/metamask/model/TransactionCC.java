package com.example.metamask.model;

public class TransactionCC {
    private int idTransaction;
    private int iconTransaction;
    private int idStatus;
    private String dateTime;
    private String nameTransaction;
    private String nameStatus;
    private String totalEth;
    private String totalUsd;

    public TransactionCC(int idTransaction, int iconTransaction, int idStatus,String dateTime, String nameTransaction, String nameStatus, String totalEth, String totalUsd) {
        this.idTransaction = idTransaction;
        this.iconTransaction = iconTransaction;
        this.idStatus = idStatus;
        this.dateTime = dateTime;
        this.nameTransaction = nameTransaction;
        this.nameStatus = nameStatus;
        this.totalEth = totalEth;
        this.totalUsd = totalUsd;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getIconTransaction() {
        return iconTransaction;
    }

    public void setIconTransaction(int iconTransaction) {
        this.iconTransaction = iconTransaction;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getNameTransaction() {
        return nameTransaction;
    }

    public void setNameTransaction(String nameTransaction) {
        this.nameTransaction = nameTransaction;
    }

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public String getTotalEth() {
        return totalEth;
    }

    public void setTotalEth(String totalEth) {
        this.totalEth = totalEth;
    }

    public String getTotalUsd() {
        return totalUsd;
    }

    public void setTotalUsd(String totalUsd) {
        this.totalUsd = totalUsd;
    }
}
