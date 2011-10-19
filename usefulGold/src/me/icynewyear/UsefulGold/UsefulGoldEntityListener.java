package me.icynewyear.UsefulGold;

import java.util.logging.Logger;

import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.entity.Player;

public class UsefulGoldEntityListener extends EntityListener{
	public static UsefulGold plugin;
	Logger log = Logger.getLogger("Minecraft");
	public UsefulGoldEntityListener(UsefulGold instance) {
        plugin = instance;
}
	public void onEntityDamage(EntityDamageEvent event)
	{
	if(event instanceof EntityDamageByEntityEvent)
	{	
        EntityDamageByEntityEvent eventEbE = (EntityDamageByEntityEvent) event;			
		Entity attacker = eventEbE.getDamager();
		Entity target = event.getEntity();
		if(attacker instanceof Player)
			{
			Player att = (Player) attacker;
			if(att.getItemInHand().getTypeId() == 283)
			{
			target.setFireTicks(5000);
			}
			}
	}
	else {return;}
	}
}
