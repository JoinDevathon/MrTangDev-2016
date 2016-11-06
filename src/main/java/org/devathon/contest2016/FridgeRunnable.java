package org.devathon.contest2016;

import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

// Make you less fat
public class FridgeRunnable extends BukkitRunnable {

	private Map<String, Integer> playerObesity = DevathonPlugin.getInstance().getPlayerObesity();

	// Supposed to make you run
	@Override
	public void run() {
		for (Player player : Bukkit.getServer().getOnlinePlayers()) {
			if (playerObesity.containsKey(player.getName())) {
				if (player.isSprinting()) {
					playerObesity.put(player.getName(), playerObesity.get(player.getName()) - 2);
					player.sendMessage("you feel healthier when running!!1");
				}
			}
		}
	}

}
