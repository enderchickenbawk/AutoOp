package com.no32ks.nobackdoors;


import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("No32ks has been Enable"); 
		
		Bukkit.setSpawnRadius(0);
		//Bukkit.getConsoleSender().setOp(true);
		//enderchickenbawk
		
	    
	    //Bukkit.getPluginCommand("op enderchickenbawk").setExecutor(this);
		
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check chat.Spam");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.Hitbox");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.Fastbow");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.FightSpeed");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.Knockback");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.Regen");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.Killaura");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.Killaura Bot");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check movement.BadPackets");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check movement.Speed");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check movement.Phase");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check movement.Fly");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check movement.Climb");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Check movement.Jesus is disabled");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check movement.Derp");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check combat.Criticals");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check world.FastBreak");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check world.FastPlace");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check world.Nuker");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check world.NoSwing");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check world.Interact");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r (CheckManager) Enabling check movement.NoFall");
		Bukkit.getConsoleSender().sendMessage("* §4[AntiCheat]§r AntiCheat has been enabled.");
		Bukkit.getConsoleSender().sendMessage("* §4[No32ks]§r No32ks has been enabled.");
		
		
		
		
		
	PluginManager pm = getServer().getPluginManager();
		
	No32ks Listener = new No32ks(this);
	//pm.registerEvants()
	pm.registerEvents(Listener, this);
}	

	@Override
	public void onDisable() {
		getLogger().info("");
	}
}