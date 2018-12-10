package com.dotstudioz.dotstudioPRO.corelibrary.dto;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by user on 15-06-2016.
 */
public class MagazineDTO {
    private String magazineTitle;
    private String magazineURL;
    private String magazineImageURL;
    private int magazineImageWidth;
    private int magazineImageHeight;

    public String getMagazineTitle() {
        return magazineTitle;
    }

    public void setMagazineTitle(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    public String getMagazineURL() {
        return magazineURL;
    }

    public void setMagazineURL(String magazineURL) {
        this.magazineURL = magazineURL;
    }

    public String getMagazineImageURL() {
        return magazineImageURL;
    }

    public void setMagazineImageURL(String magazineImageURL) {
        this.magazineImageURL = magazineImageURL;
    }

    public int getMagazineImageWidth() {
        return magazineImageWidth;
    }

    public void setMagazineImageWidth(int magazineImageWidth) {
        this.magazineImageWidth = magazineImageWidth;
    }

    public int getMagazineImageHeight() {
        return magazineImageHeight;
    }

    public void setMagazineImageHeight(int magazineImageHeight) {
        this.magazineImageHeight = magazineImageHeight;
    }




    public static ArrayList<MagazineDTO> getMagazineDTOArrayList(JSONArray obj) {
        ArrayList<MagazineDTO> magazineDTOArrayList = new ArrayList<>();

        if(obj != null && obj.length() > 0) {
            for (int i = 0; i < obj.length(); i++) {
                try {
                    magazineDTOArrayList.add(getMagazineDTO(obj.getJSONObject(i)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return magazineDTOArrayList;
    }

    public static MagazineDTO getMagazineDTO(JSONObject obj) {
        MagazineDTO magazineDTO = new MagazineDTO();

        try {
            magazineDTO.setMagazineTitle(obj.getString("title"));
        } catch(Exception e) {
            magazineDTO.setMagazineTitle("");
            e.printStackTrace();
        }

        try {
            magazineDTO.setMagazineURL(obj.getString("url"));
        } catch(Exception e) {
            magazineDTO.setMagazineURL("");
            e.printStackTrace();
        }

        try {
            magazineDTO.setMagazineImageURL(obj.getJSONObject("image").getString("url"));
        } catch(Exception e) {
            magazineDTO.setMagazineImageURL("");
            e.printStackTrace();
        }

        try {
            magazineDTO.setMagazineImageWidth(obj.getJSONObject("image").getInt("width"));
        } catch(Exception e) {
            magazineDTO.setMagazineImageWidth(0);
            e.printStackTrace();
        }

        try {
            magazineDTO.setMagazineImageHeight(obj.getJSONObject("image").getInt("height"));
        } catch(Exception e) {
            magazineDTO.setMagazineImageHeight(0);
            e.printStackTrace();
        }

        return magazineDTO;
    }
}
