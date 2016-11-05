package org.devathon.contest2016;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class FridgeListener implements Listener {

	@EventHandler
	public void onCollectingFoodFromFridgeByPushingTheButtonEvent (PlayerInteractEvent event){
		Player player = (Player) event.getPlayer();

		// Checks if we're clicking on a button on an iron block -- because it's a fridge, get it?
		if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.STONE_BUTTON)) {
			for (BlockFace face : BlockFace.values()) {
				if (event.getClickedBlock().getRelative(face).getType() == Material.IRON_BLOCK) {

					giveFood(player);

				}
			}
		}
	}

	/**
	 * Give a random item(food) from a list of items. Will also saturate the player.
	 * 
	 * @param player The player you wish to give food and saturate.
	 */
	private void giveFood(Player player) {
		ItemStack[] foodItems = new ItemStack[] {
				new ItemStack(Material.COOKED_BEEF),
				new ItemStack(Material.COOKED_CHICKEN),
				new ItemStack(Material.COOKED_FISH),
				new ItemStack(Material.COOKED_MUTTON),
				new ItemStack(Material.COOKED_RABBIT),
				new ItemStack(Material.GOLDEN_APPLE),
				new ItemStack(Material.LEATHER_BOOTS),
		};
		ItemStack randomFood = foodItems[new Random().nextInt(foodItems.length)];
		player.getInventory().addItem(randomFood);
		player.setSaturation(420); // What's the maximum saturation anyways
		
		String foodMsg = ChatColor.GREEN + randomFood.getType().toString();
		player.sendMessage("there ya go, you got a " + foodMsg);
	}
}
