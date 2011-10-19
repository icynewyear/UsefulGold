package me.icynewyear.UsefulGold;

import org.bukkit.Material;

public class Utils {

    static Material smeltResult(Material mat) {
    	Material result;
    	if(mat == Material.COBBLESTONE) { result = Material.STONE; }
    	else if (mat == Material.STONE) { result = Material.STONE; }
    	else if (mat == Material.SAND) { result = Material.GLASS; }
    	else if (mat == Material.WOOD) { result = Material.COAL; }
    	//add other woods.
    	else if (mat == Material.GOLD_ORE) { result = Material.GOLD_INGOT; }
    	else if (mat == Material.IRON_ORE) { result = Material.IRON_INGOT; }
    	else if (mat == Material.COAL_ORE) { result = Material.COAL;}
    	//add cactus
    	//add clay
    	else {result = null;}
    	return result;
        }


    static boolean isSmeltable(Material m) {
        if(smeltResult(m) != null) {return true;}
        else {return false;}
    }
}
