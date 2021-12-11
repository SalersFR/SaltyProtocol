package eu.salers.salty;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        SaltyAPI.get().load(this);

    }

    @Override
    public void onDisable() {
        SaltyAPI.get().disable(this);
    }
}
