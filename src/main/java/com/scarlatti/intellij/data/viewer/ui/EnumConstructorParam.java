package com.scarlatti.intellij.data.viewer.ui;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 8/24/2018
 */
public class EnumConstructorParam {

    private String id;
    private String text;

    public EnumConstructorParam() {
    }

    public EnumConstructorParam(String name, String text) {
        this.id = name;
        this.text = text;
    }

    public EnumConstructorParam(EnumConstructorParam other) {
        this.text = other.text;
        this.id = other.id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
