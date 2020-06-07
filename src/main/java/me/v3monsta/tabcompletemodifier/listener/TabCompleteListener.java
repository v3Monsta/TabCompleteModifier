package me.v3monsta.tabcompletemodifier.listener;

import me.v3monsta.tabcompletemodifier.TabCompleteModifier;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

import java.util.Collection;
import java.util.List;

public class TabCompleteListener implements Listener {
    private final TabCompleteModifier INSTANCE = TabCompleteModifier.getInstance();
    private final List<String> COMMANDS = INSTANCE.getConfig().getStringList("commands");
    private final boolean USE_AS_WHITELIST = INSTANCE.getConfig().getBoolean("use-as-whitelist");

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onTabComplete(PlayerCommandSendEvent event) {
        if (event.getPlayer().hasPermission("tabcompletemodifier.bypass")) { return; }

        Collection<String> commands = event.getCommands();
        if (USE_AS_WHITELIST) {
            commands.clear();
            commands.addAll(COMMANDS);
            return;
        }

        commands.removeAll(COMMANDS);
    }
}
