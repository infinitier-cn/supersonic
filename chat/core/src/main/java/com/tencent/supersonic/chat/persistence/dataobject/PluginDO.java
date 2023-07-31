package com.tencent.supersonic.chat.persistence.dataobject;

import java.util.Date;

public class PluginDO {
    /**
     * 
     */
    private Long id;

    /**
     * DASHBOARD,WIDGET,URL
     */
    private String type;

    /**
     * 
     */
    private String domain;

    /**
     * 
     */
    private String pattern;

    /**
     * 
     */
    private String parseMode;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private String createdBy;

    /**
     * 
     */
    private Date updatedAt;

    /**
     * 
     */
    private String updatedBy;

    /**
     * 
     */
    private String config;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * DASHBOARD,WIDGET,URL
     * @return type DASHBOARD,WIDGET,URL
     */
    public String getType() {
        return type;
    }

    /**
     * DASHBOARD,WIDGET,URL
     * @param type DASHBOARD,WIDGET,URL
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 
     * @return domain 
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 
     * @param domain 
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * 
     * @return pattern 
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 
     * @param pattern 
     */
    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }

    /**
     * 
     * @return parse_mode 
     */
    public String getParseMode() {
        return parseMode;
    }

    /**
     * 
     * @param parseMode 
     */
    public void setParseMode(String parseMode) {
        this.parseMode = parseMode == null ? null : parseMode.trim();
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return created_at 
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt 
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return created_by 
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy 
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 
     * @return updated_at 
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt 
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return updated_by 
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 
     * @param updatedBy 
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 
     * @return config 
     */
    public String getConfig() {
        return config;
    }

    /**
     * 
     * @param config 
     */
    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}