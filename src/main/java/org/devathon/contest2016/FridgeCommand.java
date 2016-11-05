package org.devathon.contest2016;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class FridgeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String what, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fridge")) {
			String [] fridgeMsg = {
					"good day fellow minecraftian.",
					"in your eternal quest of finding meaning in life, you might find yourself" + ChatColor.RED + " hungry.",
					ChatColor.RESET + "worry not, because now you can use a" + ChatColor.AQUA + " high-tech " + ChatColor.BOLD + "fridge!",
					"to use this wonderful" + ChatColor.GRAY.toString() + ChatColor.ITALIC + " machine " + ChatColor.RESET + ", you must first constructuate the construction(?) first.",
					"to construate the fridge you must have a" + ChatColor.GRAY + " stone button and an iron block",
					"put the block on the button, and" + ChatColor.ITALIC + " vòílã " + ChatColor.RESET + ", there you have your" + ChatColor.MAGIC + " magical " + ChatColor.RESET + "fridge",
					"by pushing the button, the fridge will grant you great gifts that you can devour, so that you can live yet another day in this horrible world",
			};
			sender.sendMessage(fridgeMsg);
			return true;
		}
		return false;
	}


}
