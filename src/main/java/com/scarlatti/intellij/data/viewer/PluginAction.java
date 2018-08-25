package com.scarlatti.intellij.data.viewer;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.components.ServiceManager;

import javax.swing.*;

/**
 * ~     _____                                    __
 * ~    (, /  |  /)                /)         (__/  )      /)        ,
 * ~      /---| // _ _  _  _ __  _(/ __ ___     / _ _  __ // _ _/_/_
 * ~   ) /    |(/_(//_)/_)(_(/ ((_(_/ ((_)   ) / (_(_(/ ((/_(_((_(__(_
 * ~  (_/                                   (_/
 * ~  Wednesday, 11/8/2017
 */
public class PluginAction extends AnAction {

    public PluginAction() {
        super("Perform Plugin Action...");
    }

    /**
     * A very simple experiment to try to show a message pane
     * when the action is performed.
     */
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        PluginStateWrapper pluginStateWrapper = ServiceManager.getService(PluginStateWrapper.class);
        JOptionPane.showMessageDialog(null, pluginStateWrapper.getState());
    }

    @Override
    public boolean displayTextInToolbar() {
        return true;
    }
}
