package com.scarlatti.intellij.data.viewer.ui;

import javax.swing.*;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 8/24/2018
 */
public class ButtonCellRenderer implements CustomCellUiComponent {

    private JButton jButton = new JButton();

    @Override
    public void setValue(Object value) {
        jButton.setText(String.valueOf(value));
    }

    @Override
    public JComponent getUi() {
        return jButton;
    }
}
