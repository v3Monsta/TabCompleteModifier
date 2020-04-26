package me.v3monsta.tabcompletemodifier.listener;

import me.v3monsta.tabcompletemodifier.TabCompleteModifier;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;

import java.util.List;


public class TabCompleteListener implements Listener {
    private final TabCompleteModifier INSTANCE = TabCompleteModifier.getInstance();

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onTabComplete(TabCompleteEvent event) {
        List<String> commands = INSTANCE.getConfig().getStringList("commands");
        event.getCompletions().removeIf(commands::contains);
    }
}
