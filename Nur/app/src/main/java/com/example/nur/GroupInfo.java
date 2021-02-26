package com.example.nur;

import java.util.ArrayList;

public class GroupInfo {
    private String name;
   private ArrayList<ChildInfo> list = new ArrayList<ChildInfo>();
        private final int image;

    public GroupInfo(int image) {
        this.image = image;
    }
    public int getImage() {
        return image;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public ArrayList<ChildInfo> getProductList() {
        return list;
    }

    public void setProductList(ArrayList<ChildInfo> productList) {
        this.list = productList;
    }

}
