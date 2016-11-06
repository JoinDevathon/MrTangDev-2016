package org.devathon.contest2016;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class DevathonPlugin extends JavaPlugin {

	private static DevathonPlugin instance;
	
	private Map<String, Integer> playerObesity = new HashMap<>();
	
    @Override
    public void onEnable() {
    	instance = this;
        
        Bukkit.getPluginManager().registerEvents(new FridgeListener(), this);
        
        this.getCommand("fridge").setExecutor(new FridgeCommand());
        
        // Check if player is running every two seconds
        new FridgeRunnable().runTaskTimer(this, 0, 40);
    }

    @Override
    public void onDisable() {
    	instance = null;
    }

	public static DevathonPlugin getInstance() {
		return instance;
	}

	public Map<String, Integer> getPlayerObesity() {
		return playerObesity;
	}

	public void setPlayerObesity(Map<String, Integer> playerObesity) {
		this.playerObesity = playerObesity;
	}
	
	// this is a mess to be honest
}

