package me.v3monsta.tabcompletemodifier;

import me.v3monsta.tabcompletemodifier.listener.TabCompleteListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TabCompleteModifier extends JavaPlugin {
    private static TabCompleteModifier instance;

    /*
     * @return An instance of the plugin.
     */
    public static TabCompleteModifier getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new TabCompleteListener(), instance);

        saveDefaultConfig();
    }
}
