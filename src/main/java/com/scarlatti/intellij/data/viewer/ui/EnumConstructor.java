package com.scarlatti.intellij.data.viewer.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 8/24/2018
 */
public class EnumConstructor {
    private List<EnumConstructorParam> params = new ArrayList<>();

    public EnumConstructor() {
    }

    public EnumConstructor(List<EnumConstructorParam> params) {
        this.params = params;
    }

    public EnumConstructor(EnumConstructor other) {
        for (EnumConstructorParam param : other.getParams()) {
            params.add(new EnumConstructorParam(param));
        }
    }

    public EnumConstructorParam getParam(String name) {
        for (EnumConstructorParam param : params) {
            if (Objects.equals(param.getId(), name)) {
                return param;
            }
        }

        return null;
    }

    public List<EnumConstructorParam> getParams() {
        return params;
    }

    public void setParams(List<EnumConstructorParam> params) {
        this.params = params;
    }
}
