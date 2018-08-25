package com.scarlatti.intellij.data.viewer;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.scarlatti.intellij.data.viewer.PluginState;
import org.jetbrains.annotations.Nullable;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 2/9/2018
 * <p>
 * This class is generated as a singleton by IntelliJ during initialization.
 * This configuration is provided in the plugin configuration xml.
 */
@State(
    name = "NewPlugin",
    storages = {
        @Storage(
            id = "com.scarlatti.plugin",
            file = "$APP_CONFIG$/com.scarlatti.plugin.xml"
        )
    }
)
public class PluginStateWrapper implements PersistentStateComponent<PluginState> {

    private PluginState state;

    public PluginStateWrapper() {
        this.state = defaultState();
    }

    @Nullable
    @Override
    public PluginState getState() {
        return state;
    }

    @Override
    public void loadState(final PluginState state) {
        this.state = state;
    }

    public void setState(PluginState state) {
        this.state = state;
    }

    private static PluginState defaultState() {
        return new PluginState();
    }
}