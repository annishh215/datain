package com.example.datain;

public class menulist {
    String imgurl;
    String f;
    String p;
    public menulist() {

    }

    public menulist(String id, String imgurl, String f, String p) {
        this.imgurl = imgurl;
        this.f = f;
        this.p = p;
    }

    public String getImgurl() {
        return imgurl;
    }

    public String getF() {
        return f;
    }

    public String getP() {
        return p;
    }
}
