package com.dotstudioz.dotstudioPRO.models.dto;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by user on 15-06-2016.
 */
public class NewsDTO {
    private String newsId;
    private String newsAuthor;
    private String newsDate;
    private String newsDateGMT;
    private String newsContent;
    private String newsTitle;
    private String newsExcerpt;
    private String newsFeaturedImage;
    private int newsFeaturedImageWidth;
    private int newsFeaturedImageHeight;

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsDateGMT() {
        return newsDateGMT;
    }

    public void setNewsDateGMT(String newsDateGMT) {
        this.newsDateGMT = newsDateGMT;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsExcerpt() {
        return newsExcerpt;
    }

    public void setNewsExcerpt(String newsExcerpt) {
        this.newsExcerpt = newsExcerpt;
    }

    public String getNewsFeaturedImage() {
        return newsFeaturedImage;
    }

    public void setNewsFeaturedImage(String newsFeaturedImage) {
        this.newsFeaturedImage = newsFeaturedImage;
    }

    public int getNewsFeaturedImageWidth() {
        return newsFeaturedImageWidth;
    }

    public void setNewsFeaturedImageWidth(int newsFeaturedImageWidth) {
        this.newsFeaturedImageWidth = newsFeaturedImageWidth;
    }

    public int getNewsFeaturedImageHeight() {
        return newsFeaturedImageHeight;
    }

    public void setNewsFeaturedImageHeight(int newsFeaturedImageHeight) {
        this.newsFeaturedImageHeight = newsFeaturedImageHeight;
    }

    public static ArrayList<NewsDTO> getNewsDTOArrayList(JSONArray obj) {
        ArrayList<NewsDTO> newsDTOArrayList = new ArrayList<>();

        if(obj != null && obj.length() > 0) {
            for (int i = 0; i < obj.length(); i++) {
                try {
                    newsDTOArrayList.add(getNewsDTO(obj.getJSONObject(i)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return newsDTOArrayList;
    }

    public static NewsDTO getNewsDTO(JSONObject obj) {
        NewsDTO newsDTO = new NewsDTO();

        try {
            newsDTO.setNewsId(obj.getString("ID"));
        } catch(Exception e) {
            newsDTO.setNewsId("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsAuthor(obj.getString("post_author"));
        } catch(Exception e) {
            newsDTO.setNewsAuthor("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsDate(obj.getString("post_date"));
        } catch(Exception e) {
            newsDTO.setNewsDate("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsDateGMT(obj.getString("post_date_gmt"));
        } catch(Exception e) {
            newsDTO.setNewsDateGMT("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsContent(obj.getString("post_content"));
        } catch(Exception e) {
            newsDTO.setNewsContent("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsTitle(obj.getString("post_title"));
        } catch(Exception e) {
            newsDTO.setNewsTitle("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsExcerpt(obj.getString("post_excerpt"));
        } catch(Exception e) {
            newsDTO.setNewsExcerpt("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsFeaturedImage(obj.getJSONObject("featured_image").getString("url"));
        } catch(Exception e) {
            newsDTO.setNewsFeaturedImage("");
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsFeaturedImageWidth(obj.getJSONObject("featured_image").getInt("width"));
        } catch(Exception e) {
            newsDTO.setNewsFeaturedImageWidth(0);
            e.printStackTrace();
        }

        try {
            newsDTO.setNewsFeaturedImageHeight(obj.getJSONObject("featured_image").getInt("height"));
        } catch(Exception e) {
            newsDTO.setNewsFeaturedImageHeight(0);
            e.printStackTrace();
        }

        return newsDTO;
    }
}
