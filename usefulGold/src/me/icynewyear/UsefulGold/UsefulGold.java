package me.icynewyear.UsefulGold;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class UsefulGold extends JavaPlugin{

	final UsefulGoldEntityListener entityListener = new UsefulGoldEntityListener(this);
	final UsefulGoldBlockListener blockListener = new UsefulGoldBlockListener(this);
	
	public void onEnable()
	{ 
    PluginManager pm = this.getServer().getPluginManager();
    pm.registerEvent(Event.Type.ENTITY_DAMAGE, entityListener, Event.Priority.Normal, this);
    pm.registerEvent(Event.Type.BLOCK_BREAK, blockListener, Event.Priority.Normal, this);
	Logger log = Logger.getLogger("Minecraft");
	log.info("UsefulGold enabled.");
	}
 
	public void onDisable()
	{ 
 
	}
}