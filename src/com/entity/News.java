package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Gzy
 * @version 1.0
 */
public class News implements Serializable {
    private int id;
    private String title;
    private String content;
    private Date insertTime;

    private static final long serialVersionUID = 1l;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
