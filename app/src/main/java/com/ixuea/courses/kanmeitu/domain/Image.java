package com.ixuea.courses.kanmeitu.domain;

//用来封装接口返回的数据
public class Image {

    //我们这里只解析用到的数据
    private String uri;

    public Image(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
