package org.devathon.contest2016;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DevathonPlugin extends JavaPlugin {

	private static DevathonPlugin instance;
	
    @Override
    public void onEnable() {
    	instance = this;
        Bukkit.getServer().getLogger().info("this might work holy shit fuck me right");
        Bukkit.getPluginManager().registerEvents(new FridgeListener(), this);
    }

    @Override
    public void onDisable() {
    	instance = null;
    }

	public static DevathonPlugin getInstance() {
		return instance;
	}
	
}

