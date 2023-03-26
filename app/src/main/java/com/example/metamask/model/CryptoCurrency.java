package com.example.metamask.model;

public class CryptoCurrency {
    private int idCC;
    private int iconCC;
    private String nameCC;
    private String totalCC;

    public CryptoCurrency(){
    }

    public CryptoCurrency(int idCC, int iconCC, String nameCC, String totalCC) {
        this.idCC = idCC;
        this.iconCC = iconCC;
        this.nameCC = nameCC;
        this.totalCC = totalCC;
    }

    public int getIdCC() {
        return idCC;
    }

    public void setIdCC(int idCC) {
        this.idCC = idCC;
    }

    public int getIconCC() {
        return iconCC;
    }

    public void setIconCC(int iconCC) {
        this.iconCC = iconCC;
    }

    public String getNameCC() {
        return nameCC;
    }

    public void setNameCC(String nameCC) {
        this.nameCC = nameCC;
    }

    public String getTotalCC() {
        return totalCC;
    }

    public void setTotalCC(String totalCC) {
        this.totalCC = totalCC;
    }
}
