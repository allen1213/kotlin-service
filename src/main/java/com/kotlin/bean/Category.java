package com.kotlin.bean;

public class Category {
    private Long categoryId;

    private String categoryName;

    private String categoryDescription;

    private String categoryBgpicture;

    private String categoryBgcolor;

    private String categoryHeaderimage;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription == null ? null : categoryDescription.trim();
    }

    public String getCategoryBgpicture() {
        return categoryBgpicture;
    }

    public void setCategoryBgpicture(String categoryBgpicture) {
        this.categoryBgpicture = categoryBgpicture == null ? null : categoryBgpicture.trim();
    }

    public String getCategoryBgcolor() {
        return categoryBgcolor;
    }

    public void setCategoryBgcolor(String categoryBgcolor) {
        this.categoryBgcolor = categoryBgcolor == null ? null : categoryBgcolor.trim();
    }

    public String getCategoryHeaderimage() {
        return categoryHeaderimage;
    }

    public void setCategoryHeaderimage(String categoryHeaderimage) {
        this.categoryHeaderimage = categoryHeaderimage == null ? null : categoryHeaderimage.trim();
    }
}