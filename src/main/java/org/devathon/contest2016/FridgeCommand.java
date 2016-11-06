package org.devathon.contest2016;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class FridgeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String what, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fridge")) {
			if (args.length == 0) {
				String [] fridgeMsg = {
						"good day fellow minecraftian.",
						"in your eternal quest of finding meaning in life, you might find yourself" + ChatColor.RED + " hungry.",
						ChatColor.RESET + "worry not, because now you can use a" + ChatColor.AQUA + " high-tech " + ChatColor.BOLD + "fridge!",
						"to use this wonderful" + ChatColor.GRAY.toString() + ChatColor.ITALIC + " machine" + ChatColor.RESET + ", you must first constructuate the construation(?) first.",
						"to construactuate the fridge you must have a" + ChatColor.GRAY + " stone button and an iron block.",
						"put the block on the button, and" + ChatColor.ITALIC + " vòílã" + ChatColor.RESET + ", there you have your" + ChatColor.LIGHT_PURPLE + " magical " + ChatColor.RESET + "fridge.",
						"by pushing the button, the fridge will grant you great gifts which will fill you empty stomach, so that you can live yet another day in this horrible world.",
				};
				sender.sendMessage(fridgeMsg);
				return true;
			} else if (args.length == 1 && args[0].equalsIgnoreCase("sacrifice")) { // need some spooks
				if (sender instanceof Player) {
					Player player  = (Player) sender;
					player.sendMessage(ChatColor.DARK_RED + "you've done the right thing");
					player.damage(420);
					player.kickPlayer(ChatColor.DARK_RED + "the great fridge god is thankful for your sacrifice");
					Bukkit.getServer().broadcastMessage(player.getName() + " committed suicide for some crazy religious reason lol");
					return true;
				} else {
					sender.sendMessage("players only");
					return false;
				}
			} else {
				sender.sendMessage("what'chu doing?");
				return false;
			}
		}
		return false;
	}

	// it's intentional, chill
}
