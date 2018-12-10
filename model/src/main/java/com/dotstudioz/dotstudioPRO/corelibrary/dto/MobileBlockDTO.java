package com.dotstudioz.dotstudioPRO.corelibrary.dto;

import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by user on 15-06-2016.
 */
public class MobileBlockDTO {
    private String title;
    private String author;
    private String date;
    private String description;
    private String imageURL;
    private int imageWidth;
    private int imageHeight;
    private String postType;
    private String postContent;
    public String videoID;
    private int indexForGradient;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public int getIndexForGradient() {
        return indexForGradient;
    }

    public void setIndexForGradient(int indexForGradient) {
        this.indexForGradient = indexForGradient;
    }

    public static ArrayList<MobileBlockDTO> getData(JSONObject obj) {
        ArrayList<MobileBlockDTO> appsHomeMobileBlockDTOArrayList = new ArrayList<>();

        try {
            if(obj.has("head_block")) {
                if(obj.getJSONObject("head_block").has("news_blog")) {
                    MobileBlockDTO mobileBlockDTO = new MobileBlockDTO();
                    if(obj.getJSONObject("head_block").getJSONObject("news_blog").has("title")) {
                        mobileBlockDTO.setTitle(obj.getJSONObject("head_block").getJSONObject("news_blog").getString("title"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("news_blog").has("post_author")) {
                        mobileBlockDTO.setAuthor(obj.getJSONObject("head_block").getJSONObject("news_blog").getString("post_author"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("news_blog").has("post_date")) {
                        mobileBlockDTO.setDate(obj.getJSONObject("head_block").getJSONObject("news_blog").getString("post_date"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("news_blog").has("description")) {
                        mobileBlockDTO.setDescription(obj.getJSONObject("head_block").getJSONObject("news_blog").getString("description"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("news_blog").has("image")) {
                        if(obj.getJSONObject("head_block").getJSONObject("news_blog").getJSONObject("image").has("url")) {
                            mobileBlockDTO.setImageURL(obj.getJSONObject("head_block").getJSONObject("news_blog").getJSONObject("image").getString("url"));
                        }
                        if(obj.getJSONObject("head_block").getJSONObject("news_blog").getJSONObject("image").has("width")) {
                            mobileBlockDTO.setImageWidth(obj.getJSONObject("head_block").getJSONObject("news_blog").getJSONObject("image").getInt("width"));
                        }
                        if(obj.getJSONObject("head_block").getJSONObject("news_blog").getJSONObject("image").has("height")) {
                            mobileBlockDTO.setImageHeight(obj.getJSONObject("head_block").getJSONObject("news_blog").getJSONObject("image").getInt("height"));
                        }
                    }
                    mobileBlockDTO.setPostType("news");

                    appsHomeMobileBlockDTOArrayList.add(mobileBlockDTO);
                }
                if(obj.getJSONObject("head_block").has("music")) {
                    MobileBlockDTO mobileBlockDTO = new MobileBlockDTO();
                    if(obj.getJSONObject("head_block").getJSONObject("music").has("title")) {
                        mobileBlockDTO.setTitle(obj.getJSONObject("head_block").getJSONObject("music").getString("title"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("music").has("post_author")) {
                        mobileBlockDTO.setAuthor(obj.getJSONObject("head_block").getJSONObject("music").getString("post_author"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("music").has("post_date")) {
                        mobileBlockDTO.setDate(obj.getJSONObject("head_block").getJSONObject("music").getString("post_date"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("music").has("description")) {
                        mobileBlockDTO.setDescription(obj.getJSONObject("head_block").getJSONObject("music").getString("description"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("music").has("image")) {
                        if(obj.getJSONObject("head_block").getJSONObject("music").getJSONObject("image").has("url")) {
                            mobileBlockDTO.setImageURL(obj.getJSONObject("head_block").getJSONObject("music").getJSONObject("image").getString("url"));
                        }
                        if(obj.getJSONObject("head_block").getJSONObject("music").getJSONObject("image").has("width")) {
                            mobileBlockDTO.setImageWidth(obj.getJSONObject("head_block").getJSONObject("music").getJSONObject("image").getInt("width"));
                        }
                        if(obj.getJSONObject("head_block").getJSONObject("music").getJSONObject("image").has("height")) {
                            mobileBlockDTO.setImageHeight(obj.getJSONObject("head_block").getJSONObject("music").getJSONObject("image").getInt("height"));
                        }
                    }
                    mobileBlockDTO.setPostType("music");

                    appsHomeMobileBlockDTOArrayList.add(mobileBlockDTO);
                }
                if(obj.getJSONObject("head_block").has("radio")) {
                    MobileBlockDTO mobileBlockDTO = new MobileBlockDTO();
                    if(obj.getJSONObject("head_block").getJSONObject("radio").has("title")) {
                        mobileBlockDTO.setTitle(obj.getJSONObject("head_block").getJSONObject("radio").getString("title"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("radio").has("post_author")) {
                        mobileBlockDTO.setAuthor(obj.getJSONObject("head_block").getJSONObject("radio").getString("post_author"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("radio").has("post_date")) {
                        mobileBlockDTO.setDate(obj.getJSONObject("head_block").getJSONObject("radio").getString("post_date"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("radio").has("description")) {
                        mobileBlockDTO.setDescription(obj.getJSONObject("head_block").getJSONObject("radio").getString("description"));
                    }
                    if(obj.getJSONObject("head_block").getJSONObject("radio").has("image")) {
                        if(obj.getJSONObject("head_block").getJSONObject("radio").getJSONObject("image").has("url")) {
                            mobileBlockDTO.setImageURL(obj.getJSONObject("head_block").getJSONObject("radio").getJSONObject("image").getString("url"));
                        }
                        if(obj.getJSONObject("head_block").getJSONObject("radio").getJSONObject("image").has("width")) {
                            mobileBlockDTO.setImageWidth(obj.getJSONObject("head_block").getJSONObject("radio").getJSONObject("image").getInt("width"));
                        }
                        if(obj.getJSONObject("head_block").getJSONObject("radio").getJSONObject("image").has("height")) {
                            mobileBlockDTO.setImageHeight(obj.getJSONObject("head_block").getJSONObject("radio").getJSONObject("image").getInt("height"));
                        }
                    }
                    mobileBlockDTO.setPostType("radio");

                    appsHomeMobileBlockDTOArrayList.add(mobileBlockDTO);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            if(obj.has("blocks")) {
                if(obj.getJSONArray("blocks").length() > 0) {
                    for(int i = 0; i < obj.getJSONArray("blocks").length(); i++) {
                        MobileBlockDTO mobileBlockDTO = new MobileBlockDTO();
                        if(((JSONObject)obj.getJSONArray("blocks").get(i)).has("post_title")) {
                            mobileBlockDTO.setTitle(((JSONObject)obj.getJSONArray("blocks").get(i)).getString("post_title"));
                        }
                        if(((JSONObject)obj.getJSONArray("blocks").get(i)).has("post_author")) {
                            mobileBlockDTO.setAuthor(((JSONObject)obj.getJSONArray("blocks").get(i)).getString("post_author"));
                        }
                        if(((JSONObject)obj.getJSONArray("blocks").get(i)).has("post_date")) {
                            mobileBlockDTO.setDate(((JSONObject)obj.getJSONArray("blocks").get(i)).getString("post_date"));
                        }
                        if(((JSONObject)obj.getJSONArray("blocks").get(i)).has("post_excerpt")) {
                            mobileBlockDTO.setDescription(((JSONObject)obj.getJSONArray("blocks").get(i)).getString("post_excerpt"));
                        }
                        if(((JSONObject)obj.getJSONArray("blocks").get(i)).has("post_content")) {
                            mobileBlockDTO.setPostContent(((JSONObject)obj.getJSONArray("blocks").get(i)).getString("post_content"));
                        }
                        if(((JSONObject)obj.getJSONArray("blocks").get(i)).has("featured_image")) {
                            if(((JSONObject)obj.getJSONArray("blocks").get(i)).getJSONObject("featured_image").has("url")) {
                                mobileBlockDTO.setImageURL(((JSONObject)obj.getJSONArray("blocks").get(i)).getJSONObject("featured_image").getString("url"));
                            }
                            if(((JSONObject)obj.getJSONArray("blocks").get(i)).getJSONObject("featured_image").has("width")) {
                                mobileBlockDTO.setImageWidth(((JSONObject)obj.getJSONArray("blocks").get(i)).getJSONObject("featured_image").getInt("width"));
                            }
                            if(((JSONObject)obj.getJSONArray("blocks").get(i)).getJSONObject("featured_image").has("height")) {
                                mobileBlockDTO.setImageHeight(((JSONObject)obj.getJSONArray("blocks").get(i)).getJSONObject("featured_image").getInt("height"));
                            }
                        }
                        mobileBlockDTO.setPostType("post");

                        appsHomeMobileBlockDTOArrayList.add(mobileBlockDTO);
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return appsHomeMobileBlockDTOArrayList;
    }
}
