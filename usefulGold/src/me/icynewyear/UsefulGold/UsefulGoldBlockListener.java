package me.icynewyear.UsefulGold;

import org.bukkit.Location;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class UsefulGoldBlockListener extends BlockListener{
	public static UsefulGold plugin;
	public UsefulGoldBlockListener(UsefulGold instance) {plugin = instance;}
	
	public void onBlockBreak(BlockBreakEvent event)
	{
		Player player = event.getPlayer();
		ItemStack helm = player.getInventory().getHelmet();
		
		//Pickaxes
		if((player.getItemInHand().getTypeId() == 257) || (player.getItemInHand().getTypeId() == 278) || (player.getItemInHand().getTypeId() == 285))	
		{
		int amountDropped = 1;
		if(player.getItemInHand().getTypeId() == 285) {amountDropped = 2;}
		if(helm.getTypeId() == 314)
		{
			
			if(Utils.isSmeltable(event.getBlock().getType()))
			{
			if((event.getBlock().getTypeId() == 1) || (event.getBlock().getTypeId() == 4) || (event.getBlock().getTypeId() == 14) || (event.getBlock().getTypeId() == 15))
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(Utils.smeltResult(event.getBlock().getType()),amountDropped));
				event.getBlock().setTypeId(0);
			}
			}
		}
		//Gold Pickaxe. No Helmet
		else if(player.getItemInHand().getTypeId() == 285)
		{
			if((event.getBlock().getTypeId() == 1) || (event.getBlock().getTypeId() == 4) || (event.getBlock().getTypeId() == 14) || (event.getBlock().getTypeId() == 15) || (event.getBlock().getTypeId() == 24))
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(event.getBlock().getType(),2));
				event.getBlock().setTypeId(0);
			}
			else if (event.getBlock().getTypeId() == 16) 
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(263,2));
				event.getBlock().setTypeId(0);	
			}
			else if (event.getBlock().getTypeId() == 1) 
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(4,2));
				event.getBlock().setTypeId(0);	
			}
		}
		}
		//Shovels
		if((player.getItemInHand().getTypeId() == 256) || (player.getItemInHand().getTypeId() == 277) || (player.getItemInHand().getTypeId() == 284))	
		{
		int amountDropped = 1;
		if(player.getItemInHand().getTypeId() == 284) {amountDropped = 2;}
		if(helm.getTypeId() == 314)
		{
			
			if(Utils.isSmeltable(event.getBlock().getType()))
			{
			if(event.getBlock().getTypeId() == 12)
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(Utils.smeltResult(event.getBlock().getType()),amountDropped));
				event.getBlock().setTypeId(0);
			}
			}
		}
		//Gold Shovel. No Helmet
		else if(player.getItemInHand().getTypeId() == 284)
		{
			if((event.getBlock().getTypeId() == 3) || (event.getBlock().getTypeId() == 12) || (event.getBlock().getTypeId() == 82))
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(event.getBlock().getType(),2));
				event.getBlock().setTypeId(0);
			}
			else if(event.getBlock().getTypeId() == 2)
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(3,2));
				event.getBlock().setTypeId(0);
			}
		}
		}
		//Axes
		if((player.getItemInHand().getTypeId() == 258) || (player.getItemInHand().getTypeId() == 279) || (player.getItemInHand().getTypeId() == 286))	
		{
		int amountDropped = 1;
		if(player.getItemInHand().getTypeId() == 286) {amountDropped = 2;}
		if(helm.getTypeId() == 314)
		{
			
			if(Utils.isSmeltable(event.getBlock().getType()))
			{
			if(event.getBlock().getTypeId() == 17)
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(Utils.smeltResult(event.getBlock().getType()),amountDropped));
				event.getBlock().setTypeId(0);
			}
			}
		}
		//Gold Axe no helmet
		else if(player.getItemInHand().getTypeId() == 286)
		{
			if((event.getBlock().getTypeId() == 17) || (event.getBlock().getTypeId() == 5))
			{
				Location loc = new Location(event.getBlock().getWorld(), event.getBlock().getX(), event.getBlock().getY(), event.getBlock().getZ(), 0.0F, 0.0F);
				event.getBlock().getWorld().dropItem(loc, new ItemStack(event.getBlock().getType(),2));
				event.getBlock().setTypeId(0);
			}
		}
		}
	}
	
}
