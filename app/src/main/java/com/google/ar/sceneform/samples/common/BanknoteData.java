package com.google.ar.sceneform.samples.common;

public class BanknoteData {
    private String id;
    private String title;
    private String name;
    private String description;
    private int img_res_id;
    private int flag_res_id;

    public BanknoteData(String id, String name, String title, String description, int img_res_id, int flag_res_id){
       this.id = id;
       this.name = name;
       this.title = title;
       this.description = description;
       this.flag_res_id = flag_res_id;
       this.img_res_id = img_res_id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImg_res_id() {
        return img_res_id;
    }

    public int getFlag_res_id() {
        return flag_res_id;
    }
}
