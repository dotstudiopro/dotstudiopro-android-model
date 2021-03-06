package com.dotstudioz.dotstudioPRO.models.dto;

import java.util.ArrayList;

public class ChannelMyListDTO {

    private String id;
    private String title;
    private String companyId;
    private String poster;
    private String spotlightPoster;
    private String slug;
    private String categoryName;
    private boolean isProduct;
    private ArrayList<String> categoriesArrayList = new ArrayList<>();
    private ParentChannelMyListDTO parentChannelMyListDTO = new ParentChannelMyListDTO();

    private String parentCategorySlug;

    private String parentChannelSlug;

    public String getParentChannelSlug() {
        return parentChannelSlug;
    }

    public String getParentCategorySlug() {
        return parentCategorySlug;
    }

    public void setParentCategorySlug(String parentCategorySlug) {
        this.parentCategorySlug = parentCategorySlug;
    }
    public void setParentChannelSlug(String parentChannelSlug) {
        this.parentChannelSlug = parentChannelSlug;
    }
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getSpotlightPoster() {
        return spotlightPoster;
    }

    public void setSpotlightPoster(String spotlightPoster) {
        this.spotlightPoster = spotlightPoster;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
    public boolean isProduct() {
        return isProduct;
    }

    public void setProduct(boolean product) {
        isProduct = product;
    }

    public ArrayList<String> getCategoriesArrayList() {
        return categoriesArrayList;
    }

    public void setCategoriesArrayList(ArrayList<String> categoriesArrayList) {
        this.categoriesArrayList = categoriesArrayList;
    }

    public ParentChannelMyListDTO getParentChannelMyListDTO() {
        return parentChannelMyListDTO;
    }

    public void setParentChannelMyListDTO(ParentChannelMyListDTO parentChannelMyListDTO) {
        this.parentChannelMyListDTO = parentChannelMyListDTO;
    }

    public class ParentChannelMyListDTO {
        private String id;
        private String title;
        private String companyId;
        private String poster;
        private String spotlightPoster;
        private String slug;
        private String categoryName;
        private boolean isProduct;
        private ArrayList<String> categoriesArrayList = new ArrayList<>();

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCompanyId() {
            return companyId;
        }

        public void setCompanyId(String companyId) {
            this.companyId = companyId;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

        public String getSpotlightPoster() {
            return spotlightPoster;
        }

        public void setSpotlightPoster(String spotlightPoster) {
            this.spotlightPoster = spotlightPoster;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public boolean isProduct() {
            return isProduct;
        }

        public void setProduct(boolean product) {
            isProduct = product;
        }

        public ArrayList<String> getCategoriesArrayList() {
            return categoriesArrayList;
        }

        public void setCategoriesArrayList(ArrayList<String> categoriesArrayList) {
            this.categoriesArrayList = categoriesArrayList;
        }
    }
}
