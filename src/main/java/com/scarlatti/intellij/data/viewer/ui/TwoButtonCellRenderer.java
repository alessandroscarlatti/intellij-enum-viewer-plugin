package com.scarlatti.intellij.data.viewer.ui;

import javax.swing.*;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 8/24/2018
 */
public class TwoButtonCellRenderer implements CustomCellUiComponent {

    private JPanel jPanel = new JPanel();
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();

    public TwoButtonCellRenderer() {
        jPanel.add(button1);
        jPanel.add(button2);

        button1.addActionListener(e -> System.out.println("clicked"));
    }

    @Override
    public void setValue(Object value) {
        button1.setText(String.valueOf(value));
        button2.setText(String.valueOf(value));
    }

    @Override
    public JComponent getUi() {
        return jPanel;
    }
}
